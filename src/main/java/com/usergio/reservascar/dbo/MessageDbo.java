package com.usergio.reservascar.dbo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageDbo {

    private int idMessage;
    private String messageText;
}
