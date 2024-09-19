package com.sandbox.Hotel;

import com.sandbox.Hotel.domen.Gost;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class HotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);
		//
	}


	@EventListener(ApplicationReadyEvent.class)
	public void start(){
		Gost gost = new Gost();
		gost.setIme("Novica");
	}




}
