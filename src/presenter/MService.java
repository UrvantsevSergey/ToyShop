package presenter;

import model.Toy;
import model.ToyShop;
import java.util.Queue;

public class MService implements ServiceInterface {
    private Toy toy;
    private ToyShop toyShop;


    public MService() {
        this.toyShop = new ToyShop();
    }
    public void addToy(String name, Double weight) {
        this.toy = new Toy(name, weight);
        toyShop.addToy(toy);
    }
    public void getToy() {
        toyShop.getToy();
    }
    public void getListToys() {
        String answer = toyShop.toString();
        System.out.println(answer);
    }

}
