/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practicaRest.controller;

import com.practicaRest.models.Employees;
import com.practicaRest.service.EmployeesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author carlo
 */
@RestController
@RequestMapping("/employees")
public class EmployeesController {
    @Autowired
    private EmployeesService empService;
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/listarEmpleados")
    public List<Employees> getPaises(){
        return empService.listar();
    }
}
