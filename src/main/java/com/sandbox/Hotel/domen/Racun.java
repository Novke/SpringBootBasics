package com.sandbox.Hotel.domen;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Racun {

    private Rezervacija rezervacija;
    private double iznos;
    private List<Usluga> usluge;

}
