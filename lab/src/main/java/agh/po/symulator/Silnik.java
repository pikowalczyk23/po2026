package agh.po.symulator;

public class Silnik {
    int obroty;
    int maxObroty;

    public void uruchomSilnik(){
        if(obroty==0){
            obroty=800;
            System.out.println("Uruchomiono silnik");
        }
    }
    public void zatrzymajSilnik(){
        if(obroty!=0){
            obroty=0;
            System.out.println("Zgaszono silnik");
        }
    }
    public Silnik(int obroty, int maxObroty){
        this.obroty=obroty;
        this.maxObroty=maxObroty;
    }
}

