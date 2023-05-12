package com.usergio.reservascar.dbo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDbo {
    private int idClient;
    private String email;
    private String password;
    private String name;
    private byte age;
}
