package com.excelr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.excelr.entity.Devices;
import com.excelr.repo.ExcelRRepo;

@Controller
public class ExceRController {
	@Autowired
	private ExcelRRepo repo;
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/addDevice")
	public String addDevice() {
		return "addDevice";
	}
	
	@RequestMapping("/success")
	public String success(Devices device) {
		repo.save(device);
		return "success";
	}
	
	@RequestMapping("/viewDevices")
	public String viewDevices(ModelMap model) {
		model.put("devices", repo.findAll());
		return "viewDevices";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
		repo.deleteById(id);
		return "redirect:/viewDevices";
	}

	@RequestMapping("/edit/{id}")
	public String editById(@PathVariable int id,ModelMap model) {
		model.put("device", repo.findById(id).get());
		return "editById";
	}
	
	@RequestMapping("/update")
	public String update(Devices device) {
		repo.save(device);
		return "redirect:/viewDevices";
}
 
}
