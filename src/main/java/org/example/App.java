package org.example;

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
