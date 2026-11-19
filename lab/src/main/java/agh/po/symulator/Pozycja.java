package agh.po.symulator;

public class Pozycja {
    double x; //współrzędna x
    double y; //współrzędna y

    void zmienPozycje(double deltaX, double deltaY){
        x=x+deltaX;
        y=y+deltaY;
    }
    String getPozycja(){
        String wspolrzedne = String.format("Pozycja: ", x, y);
        return wspolrzedne;
    }
}
