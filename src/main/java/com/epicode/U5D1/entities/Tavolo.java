package com.epicode.U5D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Tavolo {
    private int numeroTavolo;
    private int maxCoperti;
    private StatoTavolo stato;
    private double costoCoperto;
}
