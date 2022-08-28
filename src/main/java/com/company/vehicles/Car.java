package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String label;
    private String classCar;
    private int weight;

    public String getLabel() {
        return label;
    }

    public String getClassCar() {
        return classCar;
    }

    public int getWeight() {
        return weight;
    }

    public Car(String label, String classCar, int weight) {
        this.label = label;
        this.classCar = classCar;
        this.weight = weight;
    }

    public void toString(Driver driver, Engine engine) {
        System.out.println("_____________________________________________________________________________");
        System.out.println("Информация про автомобиль: \n" + " Марка - " + label + "\n Класс - " + classCar +
                "\n Вес - " + weight+" кг");
        engine.infoEngine();
        driver.aboutDriver();
        System.out.println("_____________________________________________________________________________");
    }
    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Остановились");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }

}

