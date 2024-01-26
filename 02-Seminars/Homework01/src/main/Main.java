package main;

import main.clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("«Гав»", new Owner("Сергей Валерьевич"),
                LocalDate.of(2021, 10, 3), new Illness("Лишай"),0.5, 10); //Создаём экземпляр класса

        Animal dog = new Dog("«Чаппи»", new Owner("Алексей Максимович"),
                LocalDate.of(2023, 10, 4), new Illness("Лишай"), 0); //Создаём экземпляр класса

        System.out.println(cat);
        cat.toGo(10);
        cat.swim(5);
        cat.fly(100);


        System.out.println();
        System.out.println("-------------------");
        System.out.println(dog);
        dog.toGo(10);
        dog.fly(100);
        dog.swim(3);
        System.out.println();

        Sparrow sparrow = new Sparrow ("«Облачко»", new Owner("Клавдия петровна"),
                LocalDate.of(2023, 10, 4), new Illness("болят лапки"), 0); //Создаём экземпляр класса


        System.out.println("-------------------");
        System.out.println(sparrow);
        sparrow.fly(100);
        sparrow.toGo(10);
//        ((Sparrow) sparrow).moveByJumping(10);
        sparrow.moveByJumping(50);
        sparrow.swim(30);


    }
}


