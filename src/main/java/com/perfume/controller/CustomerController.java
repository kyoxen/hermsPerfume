package com.perfume.controller;

import com.perfume.dto.CustomerDTO;
import com.perfume.model.CustomerModel;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @PostMapping("/list/all")
    List<CustomerModel> listAllCustomers(@RequestBody CustomerDTO customerDTO) {
        return Collections.emptyList();
    }

}
