package com.usergio.reservascar.dbo;

import com.usergio.reservascar.model.ClientModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportClientDbo {
    public Integer total;
    private ClientModel client;
}
