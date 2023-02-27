package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.Repository.TravelRepository;
import com.example.model.Travel;

@Service
public class TravelService 
{
     @Autowired
     TravelRepository travelRepository;
	public Travel create(Travel travel)
	{
		return travelRepository.save(travel);
	}
	 public Optional<Travel> read(Integer id)
	  {
	    return travelRepository.findById(id);
	  }
	  
	  public String delete(Integer id)
	  {
	    travelRepository.deleteById((int) id);
	    return id+" is deleted";
	     
	  }
	  
	  public List<Travel> get()
	  {
	    return travelRepository.findAll();
	  }
	  
	  public Travel update(Travel travel)
	  {
	    return travelRepository.save(travel);
	  }
	  public Iterable<Travel> sortEmployees(String field) {
			return travelRepository.findAll(Sort.by(field));
		}
		public Page<Travel> pagingEmployees(int page,int pageSize) {
			Pageable paging=PageRequest.of(page,pageSize);
			return travelRepository.findAll(paging);
		}
		public Page<Travel> pagingAndSortingEmployees(int offset,int pageSize,String field) {
			Pageable paging = PageRequest.of(offset, pageSize).withSort(Sort.by(field));
			return travelRepository.findAll(paging);
		}

	

}
