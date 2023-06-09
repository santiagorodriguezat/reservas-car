package com.usergio.reservascar.controller;

import com.usergio.reservascar.dbo.CarDbo;
import com.usergio.reservascar.model.CarModel;
import com.usergio.reservascar.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody CarModel car){
        carService.crear(car);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public void actualizar(@RequestBody CarDbo carDbo){
        carService.actualizar(carDbo);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable int id){
        carService.eliminar(id);
    }

}
