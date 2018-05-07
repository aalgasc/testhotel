package com.computerspace.hotelspace;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservas")
public class ReservasHotelSpace {

	@GetMapping
	public String reservas() {
		
		
		return "reservas";
	}
	
}
