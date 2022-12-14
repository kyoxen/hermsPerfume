package com.perfume.model;

import lombok.Data;

@Data
public class CustomerModel {

    private int customerId;
    private String customerFirstName;
    private String customerLastName;
    private String address;
    private String phone;

    private String herms;
}
