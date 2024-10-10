package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ToyShop {
    private Queue<Toy> toyShop;
    private Random random;

    public ToyShop() {
        this.toyShop = new LinkedList<>();
        this.random = new Random();
    }


    public void getToy() {
        if (toyShop.isEmpty()) {
            System.out.println("Очередь игрушек пуста!");
            return;
        }
        ArrayList<Toy> list = new ArrayList<>(toyShop);
        int index = random.nextInt(list.size());
        Toy selectedToy = list.get(index);
        System.out.println("Случайно выбранная игрушка: " + selectedToy);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("selected_toy.txt", true))) {
            writer.write("Выбранная игрушка: " + selectedToy);
            writer.newLine(); // Переход на новую строку
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    public void addToy (Toy toy) {
        if (toy != null) {
            toyShop.add(toy);
        } else {
            System.out.println("Невозможно добавить игрушку без параметров.");
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список игрушек: \n");
        if (toyShop.isEmpty()) {
            sb.append("Список пуст!");
        } else {
            for (Toy toy : toyShop) {
                sb.append(toy).append("\n");
            }
        }
        return sb.toString();
    }
}