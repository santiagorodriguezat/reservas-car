package com.usergio.reservascar.dbo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GamaDbo {
    private int idGama;
    private String name;
    private  String description;
}
