package com.usergio.reservascar.service;

import com.usergio.reservascar.model.ClientModel;
import com.usergio.reservascar.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<ClientModel> obtener(){ return clientRepository.findAll(); }

    public void crear(ClientModel model){
        if(!clientRepository.existsById(model.getId())){
            clientRepository.save(model);
        }
    }
}
