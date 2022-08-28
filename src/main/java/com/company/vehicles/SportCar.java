package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public SportCar(String label, String classCar, int weight, int speed) {
        super(label, classCar, weight);
        this.speed = speed;
    }
    public void toStringSportCar(Driver driver, Engine engine) {
        System.out.println("_____________________________________________________________________________");
        System.out.println("Информация про автомобиль: \n" + " Марка - " + getLabel() + "\n Класс - " + getClassCar() +
                "\n Вес - " + getWeight()+" кг"+"\n Предельная скорость - "+getSpeed()+" км/ч");
        engine.infoEngine();
        driver.aboutDriver();
        System.out.println("_____________________________________________________________________________");
    }

}
