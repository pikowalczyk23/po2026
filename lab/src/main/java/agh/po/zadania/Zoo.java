package agh.po.zadania;
import  agh.po.animals.*;
import java.util.Random;

public class Zoo {
    Animal[] animals = new Animal[100];
    public void wypelnijTablice(){
        Random r = new Random();
        int wylosowanaLiczba;
        for (int i=0;i<100;i++){
            wylosowanaLiczba=r.nextInt(3)+1;
            if(wylosowanaLiczba==1){
                animals[i]=new Parrot();
            }
            if(wylosowanaLiczba==2){
                animals[i]=new Dog();
            }
            if(wylosowanaLiczba==3){
                animals[i]=new Snake();
            }
        }
    }

    public static void main(String[] args) {
        Zoo z = new Zoo();
    }
}

