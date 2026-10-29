package agh.po.lab3;

public class CodingBat {
    boolean doubleX(String str) {
        int i=0;
        do{
            if (str.charAt(i) == 'x') {
                if (str.charAt(i + 1) == 'x') {

                    return true;
                }
            }
            else{
                i+=1;
            }
        }
        while(str.charAt(i-1)!='x' && i-1==str.length());
        return false;

    }


    public static void main(String[] args){
        CodingBat codingBat = new CodingBat();
        codingBat.doubleX("yyy");
    }
}
