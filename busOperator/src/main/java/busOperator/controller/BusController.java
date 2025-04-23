package busOperator.controller;

/* 
This application helps to check the availability of buses. 
a. Bus class properties: busname, location (destination), ticket_price. 
b. Create a form where bus operator can add bus details. And when the form is submitted, request should go to /addbus. Write a method which handles this end point and adds the bus to the database. 
c. Create an endpoint called /buses which user can use to send request to get details of all buses.  
d. If the user searches for a bus to a specific location, like /buses/{location}, then buses which goes to that location alone should be returned in response.
e. Operator should be able to edit/delete the existing bus details by changing to different endpoints.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import busOperator.model.Bus;
import busOperator.service.BusService;

//Controller class

@Controller
public class BusController {

	@Autowired
	BusService busService;

	@GetMapping("/showbuses")
	public String getBusesByLocation(@RequestParam(value = "location", required = false) String location, Model model) {
		/**
		 * Endpiont handling for showing all buses
		 */

		if (location != null && !location.isEmpty()) {
			model.addAttribute("buses", busService.getBus(location));
		} else {
			model.addAttribute("buses", busService.getBus()); // Fetch all buses if no location is given
		}
		return "showbus";
	}

	@GetMapping("/showbuses/{location}")
	public String getBusByLocation(@PathVariable("location") String location, Model model) {
		/**
		 * Endpoint handling for search by location
		 */

		model.addAttribute("buses", busService.getBus(location));
		return "showbus";
	}

	@GetMapping("/addbus")
	public String addBus(Model model) {
		/**
		 * Endpoint handling for adding new bus details
		 */

		model.addAttribute("bus", new Bus());
		return "addbus";
	}

	@PostMapping("/addbus")
	public String addBus(@ModelAttribute("bus") Bus bus) {

		busService.addBus(bus);
		return "redirect:/showbuses";
	}

	@GetMapping("/editbus")
	public String editBus(@RequestParam("bus_id") int bus_id, Model model) {
		/**
		 * Endpoint handling for editing existing bus details
		 */

		Bus bus = busService.getBusById(bus_id);
		model.addAttribute("bus", bus);
		return "editbus";
	}

	@PostMapping("/editbus")
	public String editBus(@ModelAttribute("bus") Bus bus) {

		busService.updateBus(bus);
		return "redirect:/showbuses";
	}

	@GetMapping("/deletebus")
	public String deleteBus(@RequestParam("bus_id") int bus_id, Model model) {
		/**
		 * Endpoint handling for deleting existing bus
		 */

		Bus bus = busService.getBusById(bus_id);
		model.addAttribute("bus", bus);
		return "deletebus";
	}

	@PostMapping("/deletebus")
	public String deleteBus(@ModelAttribute("bus_id") int id) {

		busService.deleteBus(id);
		return "redirect:/showbuses";
	}
}
