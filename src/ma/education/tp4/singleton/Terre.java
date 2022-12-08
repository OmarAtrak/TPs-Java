//  V.1 Créer un nouveau package p4= “ma.education.tp4.singleton”
package ma.education.tp4.singleton;

//  V.2 Créer une classe Terre définie par les attributs distanceToSoleil (double) et surface (double)
//  V.3 Vu qu'il n'y a qu' une seule Terre, cette classe doit créer un seul objet dans la mémoire.
//  Pour le faire, on doit assurer les trois règles suivantes

public class Terre {
    double distanceToSoleil;
    double surface;
    //  V.3.b Créer un attribut private static ayant le type Terre et le nom instance
    private static Terre instance;

    //  V.3.a Verrouiller le constructeur de cette classe en utilisant la visibilité “private”
    private Terre(double distanceToSoleil, double surface) {
        this.distanceToSoleil = distanceToSoleil;
        this.surface = surface;
    }

    //  V.3.c Créer une méthode public et static ayant le type de retour Terre et le nom getInstance
    public static Terre getInstance(double distanceToSoleil, double surface) {
        if (instance == null)
            instance = new Terre(distanceToSoleil, surface);
        return instance;
    }

}
