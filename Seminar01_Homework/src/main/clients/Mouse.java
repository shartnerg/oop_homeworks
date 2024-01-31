package main.clients;

import java.time.LocalDate;

public class Mouse extends Animal {
    public Mouse(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); // Сходи в род.класс и вызови 4 параметра
    }

}