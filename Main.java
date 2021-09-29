import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        /*
        floarea 1 este - musetel
        floarea 2 este - papadie
        floarea 3 este - lalea
        floarea 4 este - trandafir
        floarea 5 este - muscata

        vitamine : biopon si agrecol si plantella
         */

        Scanner sc = new Scanner(System.in);
        Gradina geo = new Gradina();

        System.out.print("Gradina are: \n Metrii teren : ");
        geo.teren = sc.nextInt();
        System.out.print("Numar flori : ");
        geo.nrFlori = sc.nextInt();
        System.out.print("Litri apa : ");
        geo.setApa(sc.nextInt());
        System.out.print("Numar vizitatori : ");
        geo.setVizitatori(sc.nextInt());





        System.out.println("--------------------------Musetelul--------------------------------");

        System.out.print("Introduceti cate frunze are musetelul - " );
        geo.planteGeo[1].frunze = sc.nextDouble();
        System.out.print("Introduceti culoarea musetelului - " );
        geo.planteGeo[1].culoare = sc.next();
        System.out.print("Introduceti numarul de vitamine administrate musetelului - " );
        geo.planteGeo[1].setVitamine(sc.nextDouble());
        System.out.print("Introdu numele vitaminei administrate musetelului " );
        geo.planteGeo[1].setName(sc.next());

        System.out.println("--------------------------Papadia---------------------------------");

        System.out.print("Introduceti cate frunze are papadia - " );
        geo.planteGeo[2].frunze = sc.nextDouble();
        System.out.print("Introduceti culoarea papadiei - " );
        geo.planteGeo[2].culoare = sc.next();
        System.out.print("Introduceti numarul de vitamine administrate papadiei - " );
        geo.planteGeo[2].setVitamine(sc.nextDouble());
        System.out.print("Introdu numele vitaminei administrate papadiei - " );
        geo.planteGeo[2].setName(sc.next());

        System.out.println("--------------------------Lalea--------------------------------");

        System.out.print("Introduceti cate frunze are laleaua - " );
        geo.planteGeo[3].frunze = sc.nextDouble();
        System.out.print("Introduceti culoarea lalelei - " );
        geo.planteGeo[3].culoare = sc.next();
        System.out.print("Introduceti numarul de vitamine administrate lalelei  - " );
        geo.planteGeo[3].setVitamine(sc.nextDouble());
        System.out.print("Introdu numele vitaminei administrate lalelei  - " );
        geo.planteGeo[3].setName(sc.next());

        System.out.println("--------------------------Trandafir--------------------------------");

        System.out.print("Introduceti cate frunze are trandafirul - " );
        geo.planteGeo[4].frunze = sc.nextDouble();
        System.out.print("Introduceti culoarea trandafirului - " );
        geo.planteGeo[4].culoare = sc.next();
        System.out.print("Introduceti numarul de vitamine administrate trandafirului  - " );
        geo.planteGeo[4].setVitamine(sc.nextDouble());
        System.out.print("Introdu numele vitaminei administrate trandafirului  - " );
        geo.planteGeo[4].setName(sc.next());

        System.out.println("--------------------------Muscata--------------------------------");

        System.out.print("Introduceti cate frunze are muscata - " );
        geo.planteGeo[5].frunze = sc.nextDouble();
        System.out.print("Introduceti culoarea muscatei - " );
        geo.planteGeo[5].culoare = sc.next();
        System.out.print("Introduceti numarul de vitamine administrate muscatei  - " );
        geo.planteGeo[5].setVitamine(sc.nextDouble());
        System.out.print("Introdu numele vitaminei administrate muscatei  - " );
        geo.planteGeo[5].setName(sc.next());





 // trandafir

        double depunere = 0.0;
        double scote;

         Planta trandafir = new Planta();
        System.out.print("Introduceti numarul de vitamine pe care il dati trandafirului azi : ");
        depunere = sc.nextDouble();
        trandafir.depozitareVitamine(depunere);
        System.out.print("Numarul total de vitamine date trandafirului este : ");
        System.out.print( geo.planteGeo[4].getVitamine() + depunere);

        System.out.print("Introduceti numarul de vitamine pe care il scoateti de la trandafir : ");
        scote= sc.nextDouble();
        trandafir.retragereVitamine(scote);
        System.out.print("Numarul total de vitamine ramase trandafirului este : ");
        System.out.print( geo.planteGeo[4].getVitamine() + depunere - scote);



    }
}
