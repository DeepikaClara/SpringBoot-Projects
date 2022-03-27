package com.java.courierdetails.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="courierdetails")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourierDetails {
	@Id
private String courierTrackingNumber;
private String senderName;
private String receiverName;
private String senderDetails;
private String receiverDetails;
private String sendingDate;
private String receivingDate;
}
