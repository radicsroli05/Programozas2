package labor5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test_Csaszar
{
    public static void feltolt(List<Csaszar> t){
        Scanner sc=new Scanner(System.in);

        String nev;
        int ev;

        while((ev=sc.nextInt()) !=0 ){
            nev=sc.next();
            Csaszar cs = new Csaszar(nev,ev);
            t.add(cs);

        }
    }
    static void main(String[] args){
        List<Csaszar> li=new ArrayList<>();
        feltolt(li);
        Csaszar min=li.get(0);
        for(int i=1;i<li.size();i++){

            if(li.get(i).getSzul_ev()<min.getSzul_ev())
            {
                min=li.get(i);

            }
        }
        System.out.println(min);
        System.out.println("Császárok listája");
        for(Csaszar cs:li){
            System.out.println(cs);
        }
    }
}
