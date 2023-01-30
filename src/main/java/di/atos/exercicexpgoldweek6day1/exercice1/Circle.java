/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercicexpgoldweek6day1.exercice1;

/**
 *
 * @author ezekielkouassi
 */
public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getArea()  {
        return Math.PI*Math.pow(this.radius, 2);
    }
}
