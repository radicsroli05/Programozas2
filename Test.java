public class Test {

    static void szokoevek(int ev1, int ev2)
    {
        for(int i=ev1;i<=ev2;i++){
            if((i % 4 ==0 && i % 100!=0) || (i%400==0)) {
                System.out.println("Szökőév: " + i);
            }

        }

    }
    static void main(String[] args){

        szokoevek(1880,2026);

    }
}
