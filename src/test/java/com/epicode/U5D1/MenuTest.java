package com.epicode.U5D1;

import com.epicode.U5D1.entities.AppConfig;
import com.epicode.U5D1.entities.Menu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class MenuTest {
    @Test
    public void menuCreationTest(){
        AppConfig config = new AppConfig();
        Menu menu = config.menuBean();

        assertFalse(menu.getPizzaList().isEmpty());
        assertFalse(menu.getDrinkList().isEmpty());
        assertFalse(menu.getToppingList().isEmpty());
    }
}
