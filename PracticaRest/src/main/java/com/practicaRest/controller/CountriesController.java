/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practicaRest.controller;

import com.practicaRest.models.Countries;
import com.practicaRest.service.CountriesService;
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
@RequestMapping("/countries")
public class CountriesController {
    @Autowired
    CountriesService countriesService;
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/listarPaises")
    public List<Countries> getPaises(){
        return countriesService.listarPaises();
    }
}
