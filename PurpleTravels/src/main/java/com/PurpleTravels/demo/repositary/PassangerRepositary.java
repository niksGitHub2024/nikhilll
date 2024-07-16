package com.PurpleTravels.demo.repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.PurpleTravels.demo.model.Passanger;

@Repository
public interface PassangerRepositary extends CrudRepository<Passanger, Integer>{

}
