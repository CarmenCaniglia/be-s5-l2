package com.epicode.U5D1;

import com.epicode.U5D1.entities.Topping;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToppingTest {
    @Test
    public void toppingCreation(){
        Topping tomato = new Topping("Tomato", 0,0);
        assertEquals("Tomato", tomato.getName());
        assertEquals(0, tomato.getCalories());
        assertEquals(0,tomato.getPrice());
    }
}
