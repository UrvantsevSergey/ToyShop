package presenter;

import model.Toy;
import view.View;

import java.util.Queue;
import java.util.Scanner;

public class Presenter {
    private View mView;
    private MService mService;


    public Presenter(View view) {
        mService = new MService();
        mView = view;
    }
    public void addToy(String name, Double weight) {
        mService.addToy(name, weight);
        mView.printAnswer("Игрушка добавлена в список.");
    }
    public void getToy() {
        mService.getToy();
        mView.printAnswer("Розыгрышь окончен!");
    }
    public void getListToys() {
        mService.getListToys();
    }
}