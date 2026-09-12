public class Gyak {
    public static void main(String[] args){
        int adag=2;
        double Peradag=23.5;
        double ossz=adag*Peradag;
        ossz+=8;
        System.out.println("A turmix teljes fehérjetartalma: " + ossz + "gramm");

        int osszsuly=345;
        int szeriak=4;
        double atlag=osszsuly/szeriak;
        System.out.println("Az átlag: " +atlag);
        double psuly=345.0;
        atlag=psuly/szeriak;
        System.out.println("A pontos átlag: " +atlag);

        int ara=75000;
        double akcio=ara*0.8;
        System.out.println("A termék eredeti ára: " +ara+ "Ft az akciós ára pedig:" +akcio);

        int het=7;
        int maradek=het%2;
        System.out.println("A 7 osztva 2 vel muvelet maradéka?" +maradek);

        int osszMp=135;
        int perc=osszMp/60;
        int maradekMp=osszMp%60;
        System.out.println("A renderelési idő :" +perc+" perc és "+maradekMp+" másodperc");
    }
}