package com.epicode.U5D1;

import com.epicode.U5D1.entities.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrdineTest {
    @Test
    public void totalOrderTest(){
        Topping tomato = new Topping("Tomato", 0,0.50);
        Topping cheese = new Topping("Cheese", 92, 0.69);
        Pizza pizza = new Pizza("Pizza Margherita", Arrays.asList(tomato, cheese), false);
        Tavolo tavolo = new Tavolo(1,4, StatoTavolo.LIBERO,2.0);

        Ordine ordine = new Ordine(2, Arrays.asList(pizza), tavolo);
        double expectedTotal = pizza.getPrice()+4;
        assertEquals(expectedTotal,ordine.getTotale());
    }
}
