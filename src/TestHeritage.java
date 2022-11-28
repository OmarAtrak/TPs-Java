import ma.education.tp1.introduction.Salle;

//  s2.5 Créer la classe TestHeritage
public class TestHeritage {
    //  s2.5 la classe TestHeritage contenant la méthode main
    public static void main(String[] args) {
        //  s2.5 tester les instanciations et les déclarations suivantes dans la méthode main
        Salle s1 = new SalleCours((long) 1,"Salle 1", (byte) 20); //  s2.6 on ne peut pas converte type int à type long et int à byte
        SalleCours s2 = new SalleCours((long) 2, "Salle 2", (byte) 20); //  s2.6 on ne peut pas converte type int à type long et int à byte
        SalleCours s3 = (SalleCours)s1; // s2.6 le compilateur ne sait pas si s1 est Laboratoire ou SalleCours
        SalleCours s4 = s2;

        //  s2.7 oui parce que il convert type d'objet

        //  s2.8 Tester les instanciations et les déclarations suivantes dans la méthode main
        Salle s5 = new Laboratoire(2, "LABO", "CHIMIE");
        SalleCours s6 = new SalleCours((long) 2, "Salle 2",(byte) 20); //  s2.9 on ne peut pas converte type int à type long et int à byte
        SalleCours s7 = (SalleCours) s5;
        // s2.9 le compilateur ne sait pas si s1 est Laboratoire ou SalleCours
        // s2.10 le compilateur affiche erreur parce que on ne puet pas convert Laboratoire à SalleCours
        SalleCours s8 = s6;
    }
}
