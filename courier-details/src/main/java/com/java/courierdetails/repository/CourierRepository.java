package com.java.courierdetails.repository;

import org.springframework.data.repository.CrudRepository;

import com.java.courierdetails.model.CourierDetails;

public interface CourierRepository extends CrudRepository<CourierDetails,String> {

}
