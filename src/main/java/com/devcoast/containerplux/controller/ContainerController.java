package com.devcoast.containerplux.controller;

import com.devcoast.containerplux.model.Container;
import com.devcoast.containerplux.repository.ContainerRepository;
import com.devcoast.containerplux.service.ContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//TODO : Agregar metodo POST para agregar Contenedor
@CrossOrigin
@RestController
public class ContainerController {
    @Autowired
    ContainerService containerService;
    @GetMapping("/containers")
    public List<Container> getAllContainers(){
        return containerService.getAllContainers();
    }


}
