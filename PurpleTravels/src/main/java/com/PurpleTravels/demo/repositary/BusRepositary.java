package com.PurpleTravels.demo.repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.PurpleTravels.demo.model.Bus;

@Repository
public interface BusRepositary extends CrudRepository<Bus, Integer>{

}
