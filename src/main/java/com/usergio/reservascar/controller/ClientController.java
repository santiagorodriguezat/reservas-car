package com.usergio.reservascar.controller;

import com.usergio.reservascar.dbo.ClientDbo;
import com.usergio.reservascar.model.ClientModel;
import com.usergio.reservascar.model.GamaModel;
import com.usergio.reservascar.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("/all")
    public List<ClientModel> obtener(){ return clientService.obtener(); }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody ClientModel client){
        clientService.crear(client);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public void actualizar(@RequestBody ClientDbo clientDbo){
        clientService.actualizar(clientDbo);
    }


    /*@PostMapping("/all")
    public  List<ClientModel> saveAll(@RequestBody ClientModel client){
        crear(client);
        return obtener();
    }*/
}
