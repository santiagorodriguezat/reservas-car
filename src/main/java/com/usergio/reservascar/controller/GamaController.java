package com.usergio.reservascar.controller;

import com.usergio.reservascar.model.CarModel;
import com.usergio.reservascar.model.GamaModel;
import com.usergio.reservascar.service.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Gama")
public class GamaController {
    @Autowired
    GamaService gamaService;

    @GetMapping("/all")
    public List<GamaModel> obtenerGamas(){
        return gamaService.obtener();

    }

    @PostMapping("/save")
    public List<GamaModel> crearGamas(@RequestBody GamaModel gama){
        gamaService.crear(gama);
        return obtenerGamas(); // Llamado al método GET
    }

    @PostMapping("/all")
    public  List<GamaModel> saveAll(@RequestBody GamaModel gama){
        crearGamas(gama);
        return obtenerGamas();
    }
}
