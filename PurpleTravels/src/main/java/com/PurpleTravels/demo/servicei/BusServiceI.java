package com.PurpleTravels.demo.servicei;

import java.util.List;

import com.PurpleTravels.demo.model.Bus;
import com.PurpleTravels.demo.model.Passanger;


public interface BusServiceI {

	public void saveData(Bus b);

	public List<Bus> getAllData();

	public void bookbus(Passanger p);
}
