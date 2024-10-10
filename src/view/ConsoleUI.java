package view;


import model.Toy;
import presenter.Presenter;

import java.util.Queue;
import java.util.Scanner;

public class ConsoleUI implements View {
    private boolean work = true;
    private Scanner scanner;
    private Presenter presenter;

    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
        this.presenter = new Presenter(this);
        this.work = true;
    }
    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
    @Override
    public void start() {
        System.out.println("Добро пожаловать в магазин игрушек. \n");

            String choice = "";
            System.out.println("1. Добавить игрушку.");
            System.out.println("2. Провести розыгрышь.");
            System.out.println("3. Показать список игрушек.");
            System.out.println("4. Закончить работу.");
            System.out.println("Выберите действие: ");

        while (work) {
            if (scanner.hasNextLine()) {
                choice = scanner.nextLine();
                }
            switch (choice) {
                case "1":
                    addToy();
                    break;
                case "2":
                    presenter.getToy();
                    break;
                case "3":
                    presenter.getListToys();
                    break;
                case "4":
                    work = false;
                    System.out.println("Работа программы завершена!");
                    break;
                default:
                    System.out.println("Некорректный ввод. Пожалуйста, введите число от 1 до 4.");
                    break;
            }
        }
    }
    public void addToy() {
        System.out.print("Введите имя игрушки: ");
        if (scanner.hasNextLine()) { // Проверка наличия следующей строки
            String name = scanner.nextLine(); // Чтение имени игрушки

            System.out.print("Введите вес игрушки: ");
            if (scanner.hasNextDouble()) { // Проверка наличия следующего числа
                double weight = scanner.nextDouble();
                scanner.nextLine(); // Очистка буфера после nextDouble()
                presenter.addToy(name,weight);
                // Здесь можно добавить логику для создания игрушки
            } else {
                System.out.println("Ошибка: вес должен быть числом.");
                scanner.nextLine(); // Очистка буфера в случае ошибки
            }
        } else {
            System.out.println("Ошибка: не введено имя игрушки.");
        }
    }
}