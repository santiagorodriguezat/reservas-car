package com.usergio.reservascar.controller;

import com.usergio.reservascar.model.ClientModel;
import com.usergio.reservascar.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public  List<ClientModel> crear(@RequestBody ClientModel client){
        clientService.crear(client);
        return obtener(); // Llamado al método GET
    }
}
