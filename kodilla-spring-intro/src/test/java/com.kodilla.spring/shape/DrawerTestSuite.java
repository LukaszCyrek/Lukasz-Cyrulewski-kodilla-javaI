package com.kodilla.spring.shape;


import com.kodilla.spring.intro.shape.Drawer;
import com.kodilla.spring.intro.shape.Shape;
import com.kodilla.spring.intro.shape.Triangle;
import javafx.scene.shape.Circle;
import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuite {
    @Test
    public void testDoDrawingWithCircle() {
    Circle circle = new Circle();

    Drawer drawer = new Drawer((Shape) circle);
    String result = drawer.doDrawing();

    Assert.assertEquals("This is a circle",result);
}

    @Test
    public void testDoDrawingWithTriangle() {
        //Given
        Triangle triangle = new Triangle();
        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();
        //Then
        Assert.assertEquals("This is a triangle", result);
    }
}
