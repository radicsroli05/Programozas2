package labor5;

import java.util.Scanner;

public class Tornyok {
    public static int process(String h){
        int sum=0;
        for(int i=0;i<h.length()-1;i++){
            int currentHeight=Character.getNumericValue(h.charAt(i));
            int nextHeight=Character.getNumericValue(h.charAt(i+1));
            sum+=Math.abs(currentHeight-nextHeight);
            //Character.getNumericValue();//Karakterből csinál számot
        }
        return sum;
    }


    static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Kérem adja meg a magasságokat:");
        String heights=sc.nextLine();
        System.out.println("A válasz: "+process(heights));

    }
}
