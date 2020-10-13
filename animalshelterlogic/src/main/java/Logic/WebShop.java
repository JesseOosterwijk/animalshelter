package Logic;

import Animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class WebShop {
    public static int dogAmount;

    private List<Animal> animals = new ArrayList<>();

    private void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void reserveAnimal(String name, int index) {
        if(animals.get(index) == null){
            animals.get(index).Reserve(name);
        }
    }

}
