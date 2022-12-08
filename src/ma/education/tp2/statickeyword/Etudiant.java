//  IV.1 Créer un nouveau package p3= “ma.education.tp2.statickeyword”
package ma.education.tp2.statickeyword;

//  IV.2 Créer une classe nouvelle classe Etudiant avec les attributs id(long), nom (String) et nbEtudiants (int)

public class Etudiant {
    //  IV.3.a Est ce que chaque étudiant a son propre Id? : Oui
    //  IV.3.b Est ce que chaque étudiant a son propre nom? : Oui
    //  IV.3.c Est ce que chaque étudiant a son propre nb Etudiant? : non

    //  IV.4 Déclarer l’attribut nbEtudiants en utilisant le mot réservé static

    public long id;
    public  String nom;
    public static int nbEtudiants;

    //  IV.5 Créer un constructeur pour les trois attributs comme suivant.
    public Etudiant (long id, String nom,int nb) {
        this.id = id;
        this.nom = nom;
        nbEtudiants+=nb;
    }
}
