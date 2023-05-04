package com.usergio.reservascar.controller;

import com.usergio.reservascar.model.CarModel;
import com.usergio.reservascar.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Car")
public class CarController {
    @Autowired
    CarService carService;
    @GetMapping("/all")
    public List<CarModel> obtener(){ return carService.obtener(); }

    @PostMapping("/save")
    public List<CarModel> crear(@RequestBody CarModel car) {
        carService.crear(car);
        return obtener(); // Llamado al método GET
    }
}
