package com.example.Controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.TravelService;
import com.example.model.Travel;
import com.fasterxml.jackson.core.JsonProcessingException;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class TravelController {
	
	@Autowired
	TravelService travelService;
	@Operation(summary="Create a new travel")
	@ApiResponses(value= {@ApiResponse(responseCode="201",description="travel created successfully"),
			@ApiResponse(responseCode="400",description="travel is invalid")})
    @ResponseStatus(HttpStatus.CREATED)
	@PostMapping(produces="application/json",consumes="application/json",value = "/travel")
	public ResponseEntity<Travel>createEmployee(final @RequestBody Travel travel)
	{
		Travel createTravel=travelService.create(travel);
				return ResponseEntity.ok(createTravel);
	}
	  @Operation(summary = "Get a travel with given id")
	  @ApiResponses(value = {@ApiResponse(responseCode = "200" , description = "getting travel successful"),
	               @ApiResponse(responseCode = "401" , description = "Invalid credentials"),
	               @ApiResponse(responseCode = "404" , description = "travel not  found")
	  })
	  
	  @GetMapping(value = "/travel/{id}" , produces = "application/json")
	  public ResponseEntity<Optional<Travel>> getEmployeeById (final @PathVariable Integer id){
	    Optional<Travel> createdTravel   = travelService.read(id);
	    return ResponseEntity.ok(createdTravel);
	  }
	  
	  
	  //update
	  
	  @Operation(summary = "update the travel by diven id")
	  @ApiResponses(value = {@ApiResponse(responseCode = "200" , description = "travel updated  successful"),
	         @ApiResponse(responseCode = "401" , description = "Travel is Invalid "),
	         @ApiResponse(responseCode = "404" , description = "Travel not  found")
	})
	  @PutMapping(value = "/travel/{id}" , produces = "application/json" , consumes="application/json")
	  public ResponseEntity<Travel> updateEmployee (final  @RequestBody Travel travel)
	     throws JsonProcessingException
	     {
	      final Travel updatedTravel = travelService.update(travel);
	      return ResponseEntity.ok(updatedTravel);
	     }
	  //delete
	  @Operation(summary = "Deletes a  travel by given ID")
	  @ApiResponses(value = {@ApiResponse(responseCode = "201",description = "travel deleted successfully"),
	       @ApiResponse(responseCode = "401" , description = "Invalid credentials"),
	         @ApiResponse(responseCode = "404" , description = "travel not  found")
	  })
	  @ResponseStatus(HttpStatus.OK)
	  @DeleteMapping("/travel/{id}")
	  public void  deleteEmployee (final @PathVariable("id") Integer id)
	  {
	    travelService.delete(id);
	  }
//	  @GetMapping(value = "/sort/{field}")
//		Iterable<Travel> employeesSort(@PathVariable ("field") String field) {
//			return travelService.sortEmployees(field);
//		}
//		@GetMapping(value = "/paging1/{pageNo}/{pageSize}")
//		Page<Travel> employeesPaging(@PathVariable ("pageNo") int pageno,@PathVariable ("pageSize") int pageSize) {
//			return travelService.pagingEmployees(pageno, pageSize);
//		}
//
//		@GetMapping(value = "/pagingSorting/{pageNo}/{pageSize}/{field}")
//		Page<Travel> employeesPagingAndSorting(@PathVariable ("pageNo") int pageno,@PathVariable ("pageSize") int pageSize,@PathVariable ("field")String field) {
//			return travelService.pagingAndSortingEmployees(pageno, pageSize,field);
//		}

}
