package com.italo.projetoEstado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.italo.projetoEstado.dto.EstadoDTO;
import com.italo.projetoEstado.model.Estado;
import com.italo.projetoEstado.service.Service;

@RestController
@RequestMapping("/states")
public class Controller{

    @Autowired
    private Service service;

    @GetMapping
    public List<Estado> getStates(){
        return this.service.getStates();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstadoDTO> getState(@PathVariable("id") Long id){
        EstadoDTO dto = service.getState(id);
        return ResponseEntity.ok().body(dto);
    }


}