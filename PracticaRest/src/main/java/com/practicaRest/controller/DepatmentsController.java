/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practicaRest.controller;

import com.practicaRest.models.Departments;
import com.practicaRest.service.DepartmentsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author carlo
 */
@RestController
@RequestMapping("/departments")
public class DepatmentsController {
    @Autowired
    private DepartmentsService deptoService;
    
    @GetMapping("/obtener")
    public String ver(){
        return "Hola mundo";
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/ListarDatos")
    public List<Departments> listar(){
        return deptoService.listar();
    }
    
    @PostMapping
    public Departments insertar(@RequestBody Departments depto){
        return deptoService.insertar(depto);
    }
    
    @PutMapping
    public Departments actualizar(@RequestBody Departments depto){
        return deptoService.actualizar(depto);
    }
    
    @DeleteMapping
    public void eliminar(Integer id){
        deptoService.eliminar(id);
    }
}
