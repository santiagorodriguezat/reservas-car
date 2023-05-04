package com.usergio.reservascar.service;

import com.usergio.reservascar.model.CarModel;
import com.usergio.reservascar.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    public List<CarModel> obtener(){
        return carRepository.findAll();
    }

    public void crear(CarModel car){
        if(!carRepository.existsById(car.getIdCar())){
            carRepository.save(car);
        }
    }

}
