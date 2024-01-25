package main;

import java.time.LocalDate;

public class Animal {
    private String nickName;
    private Owner owner;
    private LocalDate birthDate;
    private Illness illness;

    // Это пустой конструктор (по умолчанию)
    public Animal(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }
}