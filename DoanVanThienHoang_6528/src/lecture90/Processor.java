
package lecture90;
import java.util.Date;
public class Processor {
    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();
        Dog dog1 = new Dog("D001","Farm",new Date(),"Brown","Golden Retriever");
        Dog dog2 = new Dog("D002","Street",new Date(),"Black","Bulldo");
        Cat cat1 = new Cat("C001","Home",new Date(),"White");
        Cat cat2 = new Cat("C002","Shelte",new Date(),"Gray");
        animalList.addAnimal(dog1);
        animalList.addAnimal(dog2);
        animalList.addAnimal(cat1);
        animalList.addAnimal(cat2);
        animalList.displayAll();
        
    }
 
}
