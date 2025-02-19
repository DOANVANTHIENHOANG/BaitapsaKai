package lecture90;

import java.util.Date;

public class Animal {
String id;
String source;
Date dateOfBirth;
String color;
    public Animal (String id,String source,Date dateOfBirth,String color) {
        this.id=id;
        this.source=source;
        this.dateOfBirth=dateOfBirth;
        this.color=color;
        
    }
    public void makeSound() {
        System.out.println("Animal makes a soud");
        
    }
    public void displayInfo(){
        System.out.println("ID: " + id);
        System.out.println("source: " +source);
        System.out.println("DD/MM/YYYY: " + dateOfBirth);
        System.out.println("color: " +color);
    }
}
