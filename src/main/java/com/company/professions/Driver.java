package com.company.professions;

import com.company.entities.Person;

public class Driver extends Person {
    private int experience;

    public int getExperience() {
        return experience;
    }

    public Driver(String name, int age, String gender, int phone, int experience) {
        super(name, age, gender, phone);
        this.experience = experience;
    }

    public void aboutDriver(){
        System.out.println("Информация о водителе: \n"+" ФИО - "+getName()+"\n Возраст - "+getAge()+
                "\n Пол - "+getGender()+"\n Телефон - "+getPhone()+"\n Опыт вождения - "+getExperience());
    }

}
