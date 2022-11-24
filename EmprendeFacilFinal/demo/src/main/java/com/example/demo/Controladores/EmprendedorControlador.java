package com.example.demo.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelos.EmprendedorModelo;
import com.example.demo.repositorios.EmprendedorRepositorio;



@RestController
@RequestMapping("/emprendedor")

public class EmprendedorControlador {
    @Autowired  
    EmprendedorRepositorio emprendedorRepositorio;

    @GetMapping()
    public List<EmprendedorModelo> getListEmprendedores(){
     return emprendedorRepositorio.findAll(); // Método para listar todos los emprendedores
    }
    
    @PostMapping()
    public EmprendedorModelo saveEmprendedor (@RequestBody EmprendedorModelo emprendedor){
        return emprendedorRepositorio.save(emprendedor); // Este método me sirve para guargar y actualizar en caso de terner un el ID
    }

   @DeleteMapping(path = "/{id}")
   public void deletePacienteById(@PathVariable("id") String id){
    emprendedorRepositorio.deleteById(id); //eliminar por id
   }
   
}