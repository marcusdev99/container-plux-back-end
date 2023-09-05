package com.devcoast.containerplux.service;

import com.devcoast.containerplux.model.Enterprise;
import com.devcoast.containerplux.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseService {

    @Autowired
    EnterpriseRepository enterpriseRepository;

    public List<Enterprise> getAllEnterprises() {
        return
                enterpriseRepository.findAll();
    }
}
