package com.company.details;

import com.company.vehicles.Lorry;

public class Engine {
    private int power;
    private String maker;

    public int getPower() {
        return power;
    }

    public String getMaker() {
        return maker;
    }

    public Engine(int power, String maker) {
        this.power = power;
        this.maker = maker;
    }

    public void infoEngine(){
            System.out.println("Информация об двигателе: \n"+" Мощность - "+getPower()+" л.с."+"\n Марка - "+getMaker());
        }

}
