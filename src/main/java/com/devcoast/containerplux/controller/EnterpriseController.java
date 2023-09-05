package com.devcoast.containerplux.controller;

import com.devcoast.containerplux.model.Enterprise;
import com.devcoast.containerplux.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class EnterpriseController {
    @Autowired
    EnterpriseService enterpriseService;

    @GetMapping("/enterprises")
    public List<Enterprise> getAllEnterprises(){
        return enterpriseService.getAllEnterprises();
    }
}
