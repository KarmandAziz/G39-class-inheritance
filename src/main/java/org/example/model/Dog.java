package org.example.model;

import java.util.Objects;

public class Dog extends Animal{

    private int legs;
    private int tail;
    private int teeth;


    public Dog(String name, double weight, int legs, int tail, int teeth){
        super(name, weight);
        setLegs(legs);
        setTail(tail);
        setTeeth(teeth);
    }



    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }



    @Override
    public int hashCode() {
        return Objects.hash(legs, tail, teeth);
    }

    public boolean equals(Object obj){
        if(obj == null) return false;
        if(!obj.getClass().equals(this.getClass())){
            return false;
        }
        Dog that =  (Dog) obj;
        return that.getName().equals(this.getName())
                && that.getWeight() == this.getWeight()
                && that.getLegs() == this.legs
                && that.getTail() == this.tail
                && that.getTeeth() == this.teeth;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " chews on a bone");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", legs=" + legs +
                ", tail=" + tail +
                ", teeth=" + teeth +
                '}';
    }
}
