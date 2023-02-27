package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Travel;

public interface TravelRepository extends JpaRepository<Travel, Integer> {

}
