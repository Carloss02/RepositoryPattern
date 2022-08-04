/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practicaRest.repositories;

import com.practicaRest.models.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author carlo
 */
public interface CountriesRepository extends JpaRepository<Countries, String>{
    
}
