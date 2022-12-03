import ma.education.tp1.introduction.Salle;

//  s3.4 Créer une classe AccesHorsPackage contenant une méthode main
//  s3.12 La classe AccesHorsPackage présente toujours des erreurs de compilation. Essayer de rendre la classe AccesHorsPackage fille de la classe Salle en utilisant “extends Salle”.
public class AccesHorsPackage extends Salle{
    //  s3.13 Dans la classe AccesHorsPackage créer la méthode afficher suivante :
    public void afficher(Salle s) {
        System.out.println(s.id);
        System.out.println(s.nom);
        System.out.println(id);
        System.out.println(nom);
    }
    //  s3.14 Que remarquez- vous par rapport à l’accès aux attributs déclarés protected?
    // Si un attribut, une méthode ou un constructeur sont déclarés protected, alors ils seront visibles dans
    // toutes les classes du même package + les classes filles qui existent hors package
    // (mais par l'accès se fait par héritage et non pas par référence )
    public static void main(String[] args) {

        //  s3.5 Créer un objet de la classe Salle ayant le nom “Salle B” dans la méthode main de la
        //  classe AccesHorsPackage . Afficher les valeurs des attributs nom et id

        Salle s = new Salle("Salle B");

        System.out.println("Id de Salle: " + s.id);
        System.out.println("Nom de Salle: " + s.nom);
    }
}