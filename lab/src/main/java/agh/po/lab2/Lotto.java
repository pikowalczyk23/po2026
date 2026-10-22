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

        //Ponowne losowanie
        lista.clear();
        for (int i=0; i<6; i++) {
            wylosowanaLiczba=r.nextInt(49)+1;
            while(lista.contains(wylosowanaLiczba)){
                wylosowanaLiczba=r.nextInt(49)+1;
            }
            lista.add(wylosowanaLiczba);
        }

        int liczbaTrafien=0;
        for (int i=0; i<6; i++){
            if (lista.contains(liczbyGracza.get(i))){
                liczbaTrafien=liczbaTrafien+1;
            }
        }
        System.out.print("Twoje wytypowane liczby: ");
        System.out.println(liczbyGracza);
        System.out.print("Wylosowane liczby: ");
        System.out.println(lista);
        System.out.print("Liczba trafionych liczb: ");
        System.out.println(liczbaTrafien);

        //Trzecia część - losowanie aż do trafienia szóstki

        liczbyGracza.clear();
        System.out.println("Podaj swoje 6 liczb od 1 do 49");
        for (int i=0; i<6; i++) {
            liczbaGracza = wczytaj.nextInt();
            while (liczbyGracza.contains(liczbaGracza) || liczbaGracza < 1 || liczbaGracza > 49) {
                System.out.println("Podaj odpowiednia i nowa liczbe");
                liczbaGracza = wczytaj.nextInt();
            }
            liczbyGracza.add(liczbaGracza);
        }

        int liczbaLosowan=0;

        long start=System.currentTimeMillis();
        do {
            lista.clear();
            liczbaLosowan+=1;
            for (int i=0; i<6; i++) {
                wylosowanaLiczba=r.nextInt(49)+1;
                while(lista.contains(wylosowanaLiczba)){
                    wylosowanaLiczba=r.nextInt(49)+1;
                }
                lista.add(wylosowanaLiczba);
            }
            liczbaTrafien=0;
            for (int i=0; i<6; i++){
                if (lista.contains(liczbyGracza.get(i))){
                    liczbaTrafien=liczbaTrafien+1;
                }
            }
        }
        while (liczbaTrafien!=6);

        long stop=System.currentTimeMillis();

        System.out.print("Liczba losowań do trafienia 6 wyniosła ");
        System.out.println(liczbaLosowan);
        long czasLosowan=stop-start;
        System.out.print("Czas potrzebny do wylosowania 6 wyniósł ");
        System.out.print(czasLosowan);
        System.out.print(" milisekund");
    }
}
