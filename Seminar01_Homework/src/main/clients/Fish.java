package main.clients;

import java.time.LocalDate;

public class Fish extends Animal {
    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); // Сходи в род.класс и вызови 4 параметра
    }
    @Override
    public void fly() {
        System.out.println("Животное не может летать");}
}