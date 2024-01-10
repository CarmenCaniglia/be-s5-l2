package com.epicode.U5D1;

import com.epicode.U5D1.entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5D1Application.class);

        Menu m = (Menu) ctx.getBean("menu");

        m.printMenu();

        Tavolo tavolo1 = ctx.getBean("tavolo_1", Tavolo.class);

        List<Item> prodottiOrdinati = new ArrayList<>();
        prodottiOrdinati.add(ctx.getBean("salami_pizza", Pizza.class));
        prodottiOrdinati.add(ctx.getBean("water", Drink.class));

        Ordine ordine1 = new Ordine(4,prodottiOrdinati, tavolo1);
        System.out.println(ordine1);

        System.out.println(ordine1.getTotale());
        ctx.close();
    }
}
