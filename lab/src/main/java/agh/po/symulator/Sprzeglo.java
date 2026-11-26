package agh.po.symulator;

public class Sprzeglo {
    boolean stanSprzegla; //true - wcisniete, false - puszczone

    void wcisnijSprzeglo(){
        if(stanSprzegla==false) {
            stanSprzegla = true;
        }
    }
    void zwolnijSprzeglo(){
        if(stanSprzegla==true) {
            stanSprzegla = false;
        }
    }
}
