package com.usergio.reservascar.controller;

import com.usergio.reservascar.dbo.MessageDbo;
import com.usergio.reservascar.model.GamaModel;
import com.usergio.reservascar.model.MessageModel;
import com.usergio.reservascar.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
public class MessageController {
    @Autowired
    MessageService messageService;
    @GetMapping("/all")
    public List<MessageModel> obtener(){ return messageService.obtener();}
    @PostMapping("/save")
    public List<MessageModel> crear(@RequestBody MessageModel message){
        messageService.crear(message);
        return obtener();
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public void actualizar(@RequestBody MessageDbo messageDbo){
        messageService.actualizar(messageDbo);
    }

    /*@PostMapping("/all")
    public  List<MessageModel> saveAll(@RequestBody MessageModel message){
        crear(message);
        return obtener();
    }*/
}
