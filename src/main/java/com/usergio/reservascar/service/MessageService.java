package com.usergio.reservascar.service;

import com.usergio.reservascar.model.MessageModel;
import com.usergio.reservascar.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    MessageRepository messageRepository;

    public List<MessageModel> obtener(){return messageRepository.findAll(); }

    public void crear(MessageModel message){
        if(!messageRepository.existsById(message.getId())){
            messageRepository.save(message);
        }
    }
}
