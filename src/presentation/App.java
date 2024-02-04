package presentation;

import metier.Avion;
import metier.Moto;
import metier.Voiture;

public class App {
    public static void main(String[] args) {
        System.out.println("************Voiture**************");
        Voiture v1=new Voiture("Renault",50000,"m1",2023);
        v1.emettreSon();
        v1.afficherInformation();
        System.out.println("************Moto**************");
        Moto m1=new Moto("BMW",10000,"marque Moto","100ch");
        m1.emettreSon();
        m1.afficherInformation();
        System.out.println("************Avion**************");
        Avion a1=new Avion("airbus",555555555,"Air Maroc",1000);
        a1.emettreSon();
        a1.afficherInformation();
    }
}
