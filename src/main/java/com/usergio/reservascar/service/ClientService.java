package com.usergio.reservascar.service;

import com.usergio.reservascar.dbo.ClientDbo;
import com.usergio.reservascar.dbo.ReportClientDbo;
import com.usergio.reservascar.model.ClientModel;
import com.usergio.reservascar.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<ClientModel> obtener(){ return clientRepository.findAll(); }

    public void crear(ClientModel model){
        if(!clientRepository.existsById(model.getIdClient())){
            clientRepository.save(model);
        }
    }
    public void actualizar(ClientDbo clientDbo){
        if(clientRepository.existsById(clientDbo.getIdClient())){
            ClientModel client = clientRepository.findById(clientDbo.getIdClient()).get();
            client.setAge(clientDbo.getAge());
            client.setEmail(clientDbo.getEmail());
            client.setName(clientDbo.getName());
            client.setPassword(clientDbo.getPassword());
            clientRepository.save(client);
        }
    }

    public void eliminar(int id){
        clientRepository.deleteById(id);
    }

    public List<ReportClientDbo> reportClients() {
        List<ReportClientDbo> listReportClient = new LinkedList<>();
        List<ClientModel> listClient = clientRepository.findClientByStatusCompleted();
        for (ClientModel client : listClient) {
            int totalReservation = client.getReservations().size();
            listReportClient.add(new ReportClientDbo(totalReservation,client));
        }
        return listReportClient;
    }
}
