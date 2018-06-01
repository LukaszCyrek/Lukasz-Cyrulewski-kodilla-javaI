package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testStandardWithHamOnionTomatoTunaDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new PizzaWithHamDecorator(thePizza);
        thePizza = new PizzaWithOnionDecorator(thePizza);
        thePizza = new PizzaWithTomatoDecorator(thePizza);
        thePizza = new PizzaWithTunaDecorator(thePizza);
        System.out.println(thePizza.getDescription());

        //When
        String description = thePizza.getDescription();

        //Then
        assertEquals("Standard pizza: dough, tomato sauce, cheese + Ham, Onion, Tomato, Tuna, ", description);
    }

    @Test
    public void testStandardWithHamOnionTomatoTunaGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new PizzaWithHamDecorator(thePizza);
        thePizza = new PizzaWithOnionDecorator(thePizza);
        thePizza = new PizzaWithTomatoDecorator(thePizza);
        thePizza = new PizzaWithTunaDecorator(thePizza);
        System.out.println(thePizza.getCost() + " zl");

        //When
        BigDecimal theCost = thePizza.getCost();

        //Then
        assertEquals(new BigDecimal(31), theCost);
    }

    @Test
    public void testStandardWithTomatoTunaDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new PizzaWithTomatoDecorator(thePizza);
        thePizza = new PizzaWithTunaDecorator(thePizza);
        System.out.println(thePizza.getDescription());

        //When
        String description = thePizza.getDescription();

        //Then
        assertEquals("Standard pizza: dough, tomato sauce, cheese + Tomato, Tuna, ", description);
    }

    @Test
    public void testStandardWithTomatoTunaGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new PizzaWithTomatoDecorator(thePizza);
        thePizza = new PizzaWithTunaDecorator(thePizza);
        System.out.println(thePizza.getCost() + " zl");

        //When
        BigDecimal theCost = thePizza.getCost();

        //Then
        assertEquals(new BigDecimal(23), theCost);
    }
}
