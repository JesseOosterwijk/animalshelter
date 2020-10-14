package Logic;

import Animals.Animal;
import Animals.Dog;

import java.util.ArrayList;
import java.util.List;

public class WebShop {
    public static int dogAmount = 0;

    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
        if(animal.getClass() == Dog.class) {
            dogAmount++;
        }
    }

    public void reserveAnimal(String name, int index) {
        if(animals.get(index).getReservedBy() == null){
            animals.get(index).Reserve(name);
        }
    }

    public List<Animal> getAnimals() {
        return animals;
    }

}
