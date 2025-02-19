package lecture90;

import java.util.Date;

public class Dog extends Animal {
    private String breed;
    public Dog(String id,String source,Date dateOfBirth,String color,String breed){
        super(id, source, dateOfBirth, color);
        this.breed=breed;
    }
    @Override
   public void makeSound(){
        System.out.println("Dog barks: Woof Woof!" );
}
   @Override
   public void displayInfo(){
       super.displayInfo();
       System.out.println("Breed: " +breed);
   }
}
