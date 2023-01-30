/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercicexpgoldweek6day1.exercice3;

/**
 *
 * @author ezekielkouassi
 */
public class Student {

    private String name;
    private int age;
    private String course;
    private char grade;
    
    public Student() {
        this.name = "ezekiel kouassi";
        this.age = 20;
        this.course = "ANGULAR/JAVA";
        this.grade = 'A';
    }
    
    public Student(String name, int age, String course, char grade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }
    
    public void displayStudentInfo() {
        System.out.println("Name: " + this.name + 
                " Age: " + 
                this.age + 
                " Course: " + 
                this.course + 
                " grade: " + 
                this.grade);
    }
}
