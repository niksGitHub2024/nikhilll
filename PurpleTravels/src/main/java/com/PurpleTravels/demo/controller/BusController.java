package com.PurpleTravels.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PurpleTravels.demo.model.Bus;
import com.PurpleTravels.demo.model.Passanger;
import com.PurpleTravels.demo.servicei.BusServiceI;



@RestController
public class BusController {

	@Autowired
	BusServiceI bsi;
	
	@PostMapping("/saveData")
	public String saveData(@RequestBody Bus b)
	{
		bsi.saveData(b);
		return "Data Saved";
	}
	
	  @GetMapping("/getAllData")
      public List<Bus> GetAllData()	{
	List<Bus> list=	bsi.getAllData();
		return list;
	}
	  
	  @PostMapping("/bookbus")
	  public String BookBus(@RequestBody Passanger p)
	  {
		  bsi.bookbus(p);
		  return "Bus Book";
	  }
}
