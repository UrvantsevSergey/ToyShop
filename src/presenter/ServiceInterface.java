package presenter;

import model.Toy;

import java.util.Queue;

public interface ServiceInterface {
    void addToy(String name, Double weight);
    void getToy();
    void getListToys();
}
