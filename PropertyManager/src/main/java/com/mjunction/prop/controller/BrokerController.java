package com.mjunction.prop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mjunction.prop.model.Broker;
import com.mjunction.prop.model.Customer;
import com.mjunction.prop.service.BrokerService;
import com.mjunction.prop.*;

@RestController
@CrossOrigin(origins="http://localhost:4200", allowedHeaders = "*", exposedHeaders = "Authorization")
public class BrokerController {

	@Autowired
	BrokerService brokerService;
	
	//Input broker using Postman
	@RequestMapping(value="/addbroker",method=RequestMethod.POST)
	public void addBroker(@RequestBody Broker broker) {
		brokerService.add(broker);
	}
	
//	@RequestMapping("/brokerlogin")
//	public ModelAndView brokerLoginPage() {
//		return new ModelAndView("brokerlogin");
//	}
	@RequestMapping("/viewbrokers")
	public List<Broker> brokerLoginPage() {
		return brokerService.getAll();
	}
	
	@RequestMapping("/brokerhome")
	public ModelAndView brokerHome() {
		return new ModelAndView("brokerhome");
	}
	
	@RequestMapping(value="/logintobr",method=RequestMethod.POST)
	public ModelAndView brLogin(@RequestParam(name="br_username") String br_username,@RequestParam(name="br_password") String br_password) {
		ModelAndView mv = new ModelAndView();
		String s = brokerService.brokerLogin(br_username,br_password);
		if(s.equals("unp")) {
			mv.setViewName("brokerlogin");
			mv.addObject("msg","User Name Not Present");
			return mv;
		}
		
		mv.setViewName("brokerhome");
		return mv;
	}
	
}

