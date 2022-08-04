/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practicaRest.service;

import com.practicaRest.models.Employees;
import com.practicaRest.repositories.EmployeesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlo
 */
@Service
public class EmployeesService {
    @Autowired
    private EmployeesRepository empRepository;
    
    
    public List<Employees> listar(){
        return empRepository.findAll(); 
    } 
}
