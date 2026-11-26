package agh.po.symulator;

public class SkrzyniaBiegow {
    int aktualnyBieg;
    int iloscBiegow;

    //dodac wyjatek przy probie zmiany biegu bez wcisniecia sprzegla

    void zwiekszBieg(boolean stanSprzegla){
        if(aktualnyBieg<iloscBiegow && stanSprzegla==true){
            aktualnyBieg+=1;
        }
        else{
            System.out.print("Jedziesz na najwyzszym biegu. Nie mozna zwiekszyc biegu");
        }
    }
    void zmniejszBieg(){
        if(aktualnyBieg>1){
            aktualnyBieg=aktualnyBieg-1;
        }
        else{
            System.out.print("Jedziesz na najnizszym biegu. Nie mozna zmniejszyc biegu");
        }
    }
    public SkrzyniaBiegow(int aktualnyBieg, int iloscBiegow){
        this.aktualnyBieg=aktualnyBieg;
        this.iloscBiegow=iloscBiegow;
    }
}
