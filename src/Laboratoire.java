//  s2.1 Créer la classe fille Laboratoire de la classe mère “ma.education.tp1.introduction.Salle”

import ma.education.tp1.introduction.Salle;

public class Laboratoire extends Salle{
    //  s2.2 La classe Laboratoire contient l’attribut type (String)
    String type;

    //  s2.4  Corriger l'erreur en donnant des arguments à super() au niveau des constructeurs la classe fille Laboratoire
    public Laboratoire(long id, String nom, String type) {
        super(id, nom);
        this.type = type;
    }


}
