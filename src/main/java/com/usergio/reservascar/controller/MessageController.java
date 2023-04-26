package com.usergio.reservascar.controller;

import com.usergio.reservascar.model.GamaModel;
import com.usergio.reservascar.model.MessageModel;
import com.usergio.reservascar.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
public class MessageController {
    @Autowired
    MessageService messageService;
    @GetMapping("/all")
    public List<MessageModel> obtenerMessage(){ return messageService.obtener();}
    @PostMapping("/save")
    public void crearMessage(@RequestBody MessageModel message){ messageService.crear(message); }
}
