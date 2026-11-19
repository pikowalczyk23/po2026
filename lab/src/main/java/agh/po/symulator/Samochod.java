package agh.po.symulator;

public class Samochod {
    String nrRejest;
    Silnik silnik;
    SkrzyniaBiegow skrzynia;

    void uruchomSamochod(){
        silnik.uruchomSilnik();
    }
    void wylaczSamochod(){
        silnik.zatrzymajSilnik();
    }

    public Samochod(String nrRejest, Silnik silnik, SkrzyniaBiegow skrzynia){
        this.silnik=silnik;
        this.skrzynia=skrzynia;
        this.nrRejest=nrRejest;
    }

    public static void main(String[] args) {
        Samochod s = new Samochod("KR69420", new Silnik(0, 5500), new SkrzyniaBiegow(1, 6));
    }
}
