package com.usergio.reservascar.dbo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDbo {
    private int idCar;
    private String name;
    private String brand;
    private int year;
    private String description;
}
