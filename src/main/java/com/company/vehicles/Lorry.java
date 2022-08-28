package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private int liftCap;

    public int getLiftCap() {
        return liftCap;
    }

    public Lorry(String label, String classCar, int weight, int liftCap) {
        super(label, classCar, weight);
        this.liftCap = liftCap;
    }
    public void toStringLorry(Driver driver, Engine engine) {
        System.out.println("_____________________________________________________________________________");
        System.out.println("Информация про автомобиль: \n" + " Марка - " + getLabel() + "\n Класс - " + getClassCar() +
                "\n Вес - " + getWeight()+" кг"+"\n Грузоподъемность - "+getLiftCap()+" т");
        engine.infoEngine();
        driver.aboutDriver();
        System.out.println("_____________________________________________________________________________");
    }



}
