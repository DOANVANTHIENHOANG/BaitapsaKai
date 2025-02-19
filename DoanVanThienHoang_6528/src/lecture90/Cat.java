
package lecture90;

import java.util.Date;

public class Cat extends Animal{
    public Cat(String id,String source,Date dateOfBirth,String color){
        super(id,source,dateOfBirth,color);
    }
    @Override
    public void makeSound(){
        System.out.println("Cat meow: Meow Meow!");
    }
    
}
