public class Choinka {
    public static void main(String[] args){

        String Wysokosc = args[0];
        int n=Integer.parseInt(Wysokosc);

        for (int i=0; i<=n; i++) {
            int j=0;
            while (j<=i) {
                System.out.print("*");
                j=j+1;
            }
            System.out.println("");
        }
    }
}