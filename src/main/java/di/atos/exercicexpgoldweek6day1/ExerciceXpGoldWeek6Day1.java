/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package di.atos.exercicexpgoldweek6day1;

import di.atos.exercicexpgoldweek6day1.exercice1.Circle;
import di.atos.exercicexpgoldweek6day1.exercice2.Car;
import di.atos.exercicexpgoldweek6day1.exercice3.Student;

/**
 *
 * @author ezekielkouassi
 */
public class ExerciceXpGoldWeek6Day1 {

    public static void main(String[] args) {
        
        System.out.println("=================== Début Exercice 1 ==================");
        
        Circle circle = new Circle(2.0);
        Circle circle2 = new Circle(12);
        Circle circle3 = new Circle(24);
        
        System.out.println("area of first circle is: "+ circle.getArea());
        System.out.println("area of second circle is:" + circle2.getArea());
        System.out.println("area of third circle is:" + circle3.getArea());
        
        System.out.println("=================== Fin Exercice 1 ==================");
        

        System.out.println("=================== Début Exercice 2 ==================");
        
        Car car = new Car();
        Car car2 = new Car("Citroen", "C5", 2015, "grey", 1500);
        car.displayCarInfo();
        car2.displayCarInfo();
        
        System.out.println("=================== Fin Exercice 2 ==================");
        
        System.out.println("=================== Début Exercice 3 ==================");
        
        Student student = new Student();
        Student student2 = new Student("Cisse Charlène", 21, "SEA", 'A');
        student.displayStudentInfo();
        student2.displayStudentInfo();
        
        System.out.println("=================== Fin Exercice 3 ==================");

    }
}
