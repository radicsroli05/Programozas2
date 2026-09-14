import java.util.Random;
import java.util.Scanner;

public class Labor2 {
    public static boolean contains_one(String s,char ch){

        return s.indexOf(ch)==s.lastIndexOf(ch);
        //ez megnézi hogy csak egy található e az adott karakterből a stringben
    }

    public static void RoShamBo(){ //kő papír olló játék készítése a gép ellen
        String player1;
        String player2;

        int score1=0;
        int score2=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Kérem a válaszát:");
        while ( ! (player1=sc.nextLine()).equals("vege")) { //a jelentése a while (! az az amig nemet fogja jelenteni és ugye a többi hogy a player1 sztirngje nem vége
            Random rnd = new Random(); //egy új randomot fogok ezzel létrehozni
            int j2 = rnd.nextInt(3);

            if (j2 == 0) {
                player2 = "ko";
            } else if (j2 == 0) {
                player2 = "papir";
            } else {
                player2 = "ollo";
            }

            System.out.println("A második játékos válasza: " + player2);
            if (player1.equals("ko") && player2.equals("papir")){
                score2++;
            }
            else if(player1.equals("ko")&& player2.equals("ollo")){
                score1++;
            }

            if (player1.equals("papir") && player2.equals("ko")){
                score1++;
            }
            else if(player1.equals("papir")&& player2.equals("ollo")){
                score2++;
            }
            if (player1.equals("ollo") && player2.equals("papir")){
                score1++;
            }
            else if(player1.equals("ollo")&& player2.equals("ko")){
                score2++;
            }
            System.out.println("Kérem a választ: ");
        }
    if (score1>score2){
        System.out.println("Az első játékos nyert");
    }
    else if (score1<score2){
        System.out.println("A második játékos nyert");
    }
    else{
        System.out.println("Döntetlen");
    }


    }

    public static void main(String[] args) {

        String s1="Welcome to Java";
        String s2=s1;
        String s3="Welcome to Java";
        String s4=new String("Welcome to Java");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        //String pool az s1et lértrehozom ez bele kerül a memóriába. az s1 olyan mint egy pointer rámutat a welcome to javaba
        //az s2 rámutat az s1 által ugyan úgy a welcome to javara. Az s3-at felismeri a jvm hogy ugyan az és nem pazarolja a helyet ezért ugyan az lesz
        //a new szó miatt az s4es welcome to java újra létre fog jönni és nem köti a többihez emiatt lesz a 3as false nem lesz ugyan az a referenicajuk
        //mert ez nem azt fogja nézni hogy megegyezik e a tartalma hanem azt hogy megegyezik e a referenciájuk
        System.out.println("Tartalmi egyenlőség: "+s1.equals(s2));
        System.out.println("Tartalmi egyenlőség: "+s1.equals(s4));
        //ez tartalmilag fogja összehasonlítani őket
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.compareTo("Welcome to Tava"));
        //a j kisebb mint a t ezért egy negativ értéket várunk és azért -10 mert 10el nagyobb helyen van a t mint a j
        System.out.println(s1.charAt(5));
        //a 6. pozíciót fogja visszaadni mert a javaba is 0tól van az indexelés
        String dupla="";
        for(int i=0;i<s1.length();i++){
            dupla=dupla+s1.charAt(i)+s1.charAt(i); //itt az s1 string i-edik elemeit belefüzzök 2x a dupla stringbe amibe alapból semmi nem volt
        }
        System.out.println(dupla);
        //Majd kiiratjuk az eredény pedig a várt minden betű dupla

        System.out.println("A karakter első előfordulása: " + "Halibali".indexOf('a'));
        //Ez vissza fogja adni az adott szövegben található első előfordulását az adott karakternek. A visszaadott érték a karakter indexe lesz
        System.out.println("A karakter első előfordulása: " + "Halibali".lastIndexOf('a'));
        System.out.println("A karakter első előfordulása: " + "Halibali".indexOf('a'));

        System.out.println("Halibali".substring(2));
        //az adott indextől kezdve írja ki a dolgokat
        System.out.println("Halibali".substring(2 ,6));
        //Az intervallumok balról zárt jobbról nyitott ez általában mindenhol igaz tehát itt a a 2es még benne van de a 6os már nem 0.H 1.a | 2.l 3.i 4.b 5.a | 6.l 7.i
        System.out.println(contains_one("Hulibuli",'h'));
        //a ch adott karaktert nézzük meg hogy 1szer szerepel e a Hulibuli stringben
        RoShamBo();
    }
}
