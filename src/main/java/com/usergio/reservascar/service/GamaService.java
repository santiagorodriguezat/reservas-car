package com.usergio.reservascar.service;

import com.usergio.reservascar.model.GamaModel;
import com.usergio.reservascar.repository.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamaService {
    @Autowired
    GamaRepository gamaRepository;

    public List<GamaModel> obtener(){return gamaRepository.findAll(); }

    public void crear(GamaModel gama){
        if(!gamaRepository.existsById(gama.getId())){
            gamaRepository.save(gama);
        }
    }
}
