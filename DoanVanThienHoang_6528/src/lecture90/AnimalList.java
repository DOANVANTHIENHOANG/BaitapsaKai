
package lecture90;

import java.util.ArrayList;

public class AnimalList {
    private ArrayList<Animal> animals;
    public AnimalList(){
        animals = new ArrayList<>();
    }
    public void addAnimal(Animal animal) {
       animals.add(animal);
    }
    public void displayAll(){
        for (Animal animal : animals){
            animal.displayInfo();;
            animal.makeSound();
            System.out.println("------------------");
        }
    }
}
