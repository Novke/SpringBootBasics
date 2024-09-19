package com.sandbox.Hotel.domen;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Rezervacija {

    private Gost gost;
    private Soba soba;
    private LocalDate datumDolaska;
    private LocalDate datumOdlaska;


}
