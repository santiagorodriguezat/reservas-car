package com.usergio.reservascar.service;

import com.usergio.reservascar.dbo.CarDbo;
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
    public void actualizar(CarDbo carDbo){
        if(carRepository.existsById(carDbo.getIdCar())){
            CarModel car = carRepository.findById(carDbo.getIdCar()).get();
            car.setName(carDbo.getName());
            car.setBrand(carDbo.getBrand());
            car.setYear(carDbo.getYear());
            car.setDescription(carDbo.getDescription());
            carRepository.save(car);
        }
    }

}
