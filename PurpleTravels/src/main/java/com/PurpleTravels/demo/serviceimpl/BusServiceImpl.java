package com.PurpleTravels.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PurpleTravels.demo.model.Bus;
import com.PurpleTravels.demo.model.Passanger;
import com.PurpleTravels.demo.repositary.BusRepositary;
import com.PurpleTravels.demo.repositary.PassangerRepositary;
import com.PurpleTravels.demo.servicei.BusServiceI;



@Service
public class BusServiceImpl implements BusServiceI{
	@Autowired
	BusRepositary br;
	
	@Autowired
	PassangerRepositary pr;
	
	@Override
	public void saveData(Bus b) {
       
		br.save(b);
		
	}

	@Override
	public List<Bus> getAllData() {
       List<Bus> list=(List<Bus>) br.findAll();
		return list;
	}
	

	@Override
	public void bookbus(Passanger p) {
      int id=p.getB().getBid();
      Bus b=br.findById(id).get();
      b.setAvlseat(b.getAvlseat()-1);
      br.save(b);
      pr.save(p);
	}

}
