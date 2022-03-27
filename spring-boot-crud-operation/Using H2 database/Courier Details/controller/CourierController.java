package com.java.courierdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.courierdetails.model.CourierDetails;
import com.java.courierdetails.service.CourierService;

@RestController
public class CourierController {
@Autowired
private CourierService courierService;
@GetMapping("/courier")
private List<CourierDetails> getAllCouriers()
{
	return courierService.getAllCouriers();
}
@GetMapping("/courier/{courierTrackingNumber}")
private CourierDetails getCourierDetails(@PathVariable("courierTrackingNumber") String courierTrackingNumber)
{
	return courierService.getcourierDetails(courierTrackingNumber);
}
@PostMapping("/courier")
private  String create(@RequestBody CourierDetails couriers)
{
	courierService.save(couriers);
	return couriers.getCourierTrackingNumber();
}
@PutMapping("/courier/{courierTrackingNumber}")
private void update(@PathVariable("courierTrackingNumber") String courierTrackingNumber,@RequestBody CourierDetails couriers)
{
courierService.update(courierTrackingNumber,couriers);
}
@DeleteMapping("/courier/{courierTrackingNumber}")
private void delete(@PathVariable("courierTrackingNumber") String courierTrackingNumber)
{
	courierService.delete(courierTrackingNumber);
}
}
