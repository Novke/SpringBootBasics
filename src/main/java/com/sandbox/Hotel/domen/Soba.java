package com.sandbox.Hotel.domen;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Soba {

    private int brojSobe;
    private TipSobe tip;
    private double cena;
    private StatusSobe status;
}
