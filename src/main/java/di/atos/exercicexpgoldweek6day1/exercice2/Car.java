/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercicexpgoldweek6day1.exercice2;

/**
 *
 * @author ezekielkouassi
 */
public class Car {

    private String make;
    private String model;
    private int year;
    private String color;
    private double price;
    
    public Car() {
        this.make = "renault";
        this.model = "g2";
        this.year = 2023;
        this.color = "red";
        this.price = 2000;
    }
    
    public Car(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }
    
    public void displayCarInfo() {
        System.out.println("Make: " + this.make + 
                "Model: " + 
                this.model + 
                " Year: " + 
                this.year + 
                " Color: " + 
                this.color + 
                " Price: " + 
                this.price +
                "$");
    }
}
