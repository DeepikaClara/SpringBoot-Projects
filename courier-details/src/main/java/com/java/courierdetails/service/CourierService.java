package com.java.courierdetails.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.courierdetails.model.CourierDetails;
import com.java.courierdetails.repository.CourierRepository;

@Service
public class CourierService {
@Autowired
private CourierRepository courierRepository;

public List<CourierDetails> getAllCouriers() {
List<CourierDetails> couriers =new ArrayList<>();
courierRepository.findAll().forEach(couriers1->couriers.add(couriers1));
return(couriers);
	
}

public CourierDetails getcourierDetails(String courierTrackingNumber) {
	
	return courierRepository.findById(courierTrackingNumber).get();
}

public void save(CourierDetails couriers) {
	courierRepository.save(couriers);
	}

public void update(String courierTrackingNumber, CourierDetails couriers) {
	
	courierRepository.save(couriers);
}

public void delete(String courierTrackingNumber) {
	courierRepository.deleteById(courierTrackingNumber);
		
	}
	


}
