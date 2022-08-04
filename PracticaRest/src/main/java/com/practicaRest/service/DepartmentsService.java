/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practicaRest.service;

import com.practicaRest.models.Departments;
import com.practicaRest.repositories.DepartmentsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlo
 */
@Service
public class DepartmentsService {
    @Autowired
    private DepartmentsRepository deptoRepo;
    
    public Departments insertar(Departments depto){
        return deptoRepo.save(depto);
    }
    
    public Departments actualizar(Departments depto){
        return deptoRepo.save(depto);
    }
    
    public List<Departments> listar(){
        return deptoRepo.findAll(); 
    } 
    
    public void eliminar(Integer id){
        deptoRepo.deleteById(id);
    }
}
