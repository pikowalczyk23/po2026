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
    void przemiesc(double dt, double v, Pozycja cel){

        double odlegloscX=cel.x-x;
        double odlegloscY=cel.y-y;

        double odleglosc=Math.sqrt(Math.pow(odlegloscX, 2)+Math.pow(odlegloscY, 2));
        //double nachylenie=odlegloscY/odlegloscX;
        double dx=v*dt*(odlegloscX/odleglosc);
        double dy=v*dt*(odlegloscY/odleglosc);

        x=x+dx;
        y=y+dy;

        System.out.println(x);
        System.out.println(y);

    }

    public static void main(String[] args) {
        Pozycja test = new Pozycja();
        test.x=0;
        test.y=0;

        Pozycja testCelu= new Pozycja();
        testCelu.x=1000;
        testCelu.y=0;

        test.przemiesc(50, 20, testCelu);
    }
}
