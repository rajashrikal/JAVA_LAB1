// Write a program that prints your name, college name, and current date using java.time.LocalDate.
import java.time.LocalDate;
public class Name{
    public static void main(String[] args){
        String name="Rajashri Kalshetti";
        String Collage="WIT,Solapur";
        LocalDate date=LocalDate.now();
        System.out.println("Name="+name);
        System.out.println("Collage="+Collage);
        System.out.println("date="+date);
        
    }
}