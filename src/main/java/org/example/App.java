package org.example;

import org.example.exercises.Car;
import org.example.exercises.Motorcycle;
import org.example.exercises.Truck;
import org.example.exercises.Vehicle;
import org.example.model.Animal;
import org.example.model.Dog;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Vehicle car = new Car(1,
                "GEM06Z",
                "Seat",
                2020,
                4,
                4,
                "Red");

        Vehicle motorcycle = new Motorcycle(
                1,
                "USY185",
                "Toyota",
                2015,
                "Standard",
                "210 Km/h",
                3.0);

        Vehicle truck = new Truck(
                1,
                "SS23",
                "Suzuki",
                2009,
                "Minivan",
                "20 km/h",
                "650 KG",
                "20 km");


      car.drive();
      motorcycle.drive();
      truck.drive();

      System.out.println();


    }

    public static void lectureExample(){
        Dog rudolf = new Dog("Rudolf",
                6,
                4,
                1,
                20);

        Object pip = new Dog("pippi", 22, 44,33,5);

        Animal koko = new Dog("koko", 10, 4, 1, 20);

        Object[] objects = new Object[6];
        objects[0] = koko;
        objects[1] = pip;
        objects[2] = koko;
        objects[3] = "nisse";
        objects[4] = 1;
        objects[5] = LocalDate.now();

        for(Object obj: objects)
            System.out.println(obj);
        //-------------------------
        Integer integer = 1;
        Double d = 2.43;
        Byte b = 41;
        Float f = 23f;
        Short s = 2345;
        Long l = 4359843L;
        Character carObject = 's';
        Boolean bool = true;
        //-------------------------


        System.out.println(rudolf);
        System.out.println(pip);
        System.out.println(koko);

    }
}
