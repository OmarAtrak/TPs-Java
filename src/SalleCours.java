//  s2.1 Créer la classe fille SalleCours de la classe mère “ma.education.tp1.introduction.Salle”

import ma.education.tp1.introduction.Salle;

public class SalleCours extends Salle{
    //  s2.2 la classe SalleCours contient l’attribut nombre de places(byte)
    byte nbPlaces;

    //  s2.4  Corriger l'erreur en donnant des arguments à super() au niveau des constructeurs la classe fille SalleCours
    public SalleCours(long id, String nom, byte nbPlaces){
        super(id,nom);
        this.nbPlaces = nbPlaces;
    }
}
