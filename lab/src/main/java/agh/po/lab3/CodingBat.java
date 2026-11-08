package agh.po.lab3;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class CodingBat {
    boolean doubleX(String str) {
        int dlugosc = str.length();
        int i=0;
        if (dlugosc<2) {
            return false;
        }
        do{
            if(str.charAt(i)=='x'){
                if(str.charAt(i+1)=='x'){
                    return true;
                }
                else{
                    return false;}
                }
            i+=1;
            }
        while(i<=dlugosc-2);
        return false;
        }

    public boolean lastDigit(int a, int b) {
        String a_string=Integer.toString(a);
        String b_string=Integer.toString(b);

        if(a_string.charAt(a_string.length()-1)==b_string.charAt(b_string.length()-1)){
            return true;
        }else{
            return false;
        }
    }
    public boolean lucky13(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1 || nums[i]==3){
                return false;
            }
        }
        return true;
    }

    public boolean endsLy(String str) {
        if(str.length()>1) {
            if (str.charAt(str.length() - 2) == 'l' && str.charAt(str.length() - 1) == 'y') {
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }
    }


    public Map<String, String> mapAB2(Map<String, String> map) {

        if(map.containsKey("a") && map.containsKey("b")){
            String val_a=map.get("a");
            String val_b=map.get("b");
            if(val_a.equals(val_b)){
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }
    /*public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        for(int i=0;)*/

    }





    /*public static void main(String[] args){

    }*/

