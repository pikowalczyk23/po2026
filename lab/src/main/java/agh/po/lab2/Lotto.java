package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        Random r=new Random();

        int wylosowanaLiczba;
        for (int i=0; i<6; i++) {
            wylosowanaLiczba=r.nextInt(49)+1;
            while(lista.contains(wylosowanaLiczba)){
                wylosowanaLiczba=r.nextInt(49)+1;
            }
            lista.add(wylosowanaLiczba);
        }

        System.out.print("Wylosowane liczby to ");
        System.out.println(lista);

        ArrayList<Integer> liczbyGracza = new ArrayList<>();
        Scanner wczytaj = new Scanner(System.in);
        int liczbaGracza;
        System.out.println("Podaj swoje 6 liczb od 1 do 49");
        for (int i=0; i<6; i++){
            liczbaGracza=wczytaj.nextInt();
            while(liczbyGracza.contains(liczbaGracza) || liczbaGracza <1 || liczbaGracza>49){
                System.out.println("Podaj odpowiednia i nowa liczbe");
                liczbaGracza=wczytaj.nextInt();
            }
            liczbyGracza.add(liczbaGracza);
        }
        int liczbaTrafien=0;
        for (int i=0; i<6; i++){
            if (lista.contains(liczbyGracza[i])){
                liczbaTrafien=liczbaTrafien+1;
            }
        }
        System.out.print("Liczba trafionych liczb: ");
        System.out.print(liczbaTrafien);
    }
}
