
public class ElsoHazi {
    //Első rész
    public static void main(String[] args) {
        int osszeg=0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                osszeg += i;
            }
        }
        System.out.println("Az 1000-nél kisebb 5-tel vagy 3-mal osztható számok összege: " + osszeg);
        //A második feladat megoldása:
        int negyzetOsszeg = 0;
        int osszegNegyzet = 0;
        for (int i = 1; i <= 100; i++) {
            negyzetOsszeg+=i*i;
            osszegNegyzet+=i;
        }
        int kulombseg=(osszegNegyzet*osszegNegyzet)-negyzetOsszeg;
        System.out.println("Az első 100 szám négyzetének és négyzetösszege közötti külömbség: " + kulombseg);
    }
}
