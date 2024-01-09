package com.epicode.U5D1.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Ordine {
    private int numeroOrdine;
    private StatoOrdine stato;
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;
    private List<Item> items;
    private double importoTotale;
}
