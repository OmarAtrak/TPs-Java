//  S3.I.1 Créer un nouveau package p4= “ma.education.tp.abstarctkeyword”
//  s3.I.2 Créer une classe nouvelle classe FormeGeometrique avec l’attribut surface(double) et la
//  méthode public double calculerSurface() {}
//  s3.I.3 Supprimer le corps {} de la méthode calculerSurface() et le remplacer par point virgule ;
//  s3.I.4 Remarquer l’erreur de compilation, déclarer alors la méthode calculerSurface() abstract
//  s3.I.5 Remarquer les erreurs de compilation au niveau de la classe FormeGeometrique. Déclarer alors cette classe abstract.
//  s3.I.9 Créer une méthode concrète afficherSurface() au niveau de la classe FormeGeometrique.


package ma.education.tp.abstarctkeyword;

abstract public class FormeGeometrique {
    double surface;

    public abstract double calculerSurface();

    public void afficherSurface() {
        System.out.println(this.surface);
    };
}
