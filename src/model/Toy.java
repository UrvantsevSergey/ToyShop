package model;

import java.util.UUID;

public class Toy {
    private String id;
    private String name;
    private Double weight;

//    public Toy() {
//        this.id = generateID();
//        this.name = "";
//        this.weight = null;
//    }
    public Toy(String name, double weight) {
        this.id = IDGenerator.generateID();
        this.name = name;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "ID: " + id + ", Название: " + name + ", Вес: " + weight;
    }

    public double getWeight() {
        return weight;
    }
}



//    public void addToy(String name, double weight) {
//
//    }
