//  s1.2 Créer un package p1= “ma.education.tp1.introduction”
package ma.education.tp1.introduction;

//  s1.3 Dans le package (p1), créer une classe java Salle
public class Salle {
    //  s1.3 classe java Salle définie par un id de type long et un nom de type String
    //  s3.1 Mettre les attributs de la classe “ma.education.tp1.introduction.Salle” publiques
    //  s3.6 Maintenant rendre les attributs de la classe “ma.education.tp1.introduction.Salle” private
    //  s3.7 Remarquer que les deux classes AccesSamePackage et AccesHorsPackage n’arrivent plus à accéder aux attributs id et nom déclarés private
    //  s3.8 Maintenant supprimer le modificateur d’accès “private” aux attributs de la classe “ma.education.tp1.introduction.Salle”
    //  s3.9 Remarquer que seule la classe AccesSamePackage arrive à accéder aux attributs id et nom contrairement à la classe AccesHorsPackage qui présente des erreurs de compilation. On dit que les attributs id et nom ont la visibilité par défaut
    //  s3.10 Maintenant déclarer les attributs de la classe “ma.education.tp1.introduction.Salle” protected
    //  s3.11 Remarquer que la classe AccesSamePackage arrive à accéder aux attributs id et nom contrairement à la classe AccesHorsPackage . Alors la visibilité protected donne l’accès aux classes du même package
    protected long id;
    protected String nom;

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
