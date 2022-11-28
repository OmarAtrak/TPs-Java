//  s1.2 Créer un package p1= “ma.education.tp1.introduction”
package ma.education.tp1.introduction;

//  s1.3.Dans le package (p1), créer une classe java Salle
public class Salle {
    //  s1.3 classe java Salle définie par un id de type long et un nom de type String
    long id;
    String nom;

    //  s1.4 Dans la classe Salle créer les trois constructeurs suivants:

    //  s1.4.a Un constructeur sans paramètres
    //  s2.3 Mettre en commentaire le constructeur sans paramètres de la classe “ma.education.tp1.introduction.Salle”.
    //  Remarquer les erreurs de compilation dans les classes filles
    /*
    public Salle(){
    }
    */

    //  s1.4.b Un constructeur pour le nom de la salle
    public Salle(String nom){
        this.nom = nom;
    }

    //  s1.4.c Un constructeur pour l’id et le nom de la salle
    public Salle(long id, String nom){
        this(nom);
        this.id = id;
    }
}
