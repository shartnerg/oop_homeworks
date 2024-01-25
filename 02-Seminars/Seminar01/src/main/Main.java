package main;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("Солнышко", new Owner("Сергей Валерьевич"),
                LocalDate.of(2021, 10, 05), new Illness("Лишай")); //Создаём экземпляр класса

        System.out.println(cat.owner);
        System.out.println(cat.nickName);
        cat.nickName = "Барсик";

        System.out.println(cat.nickName);
    }
}


