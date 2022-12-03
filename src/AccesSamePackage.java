import ma.education.tp1.introduction.Salle;

//  s3.2 Créer une classe AccesSamePackage contenant une méthode main
public class AccesSamePackage {
    public static void main(String[] args) {

        //  s3.3 Créer un objet de la classe Salle ayant le nom “Salle A” dans la méthode main de la
        //  classe AccesSamePackage. Afficher les valeurs des attributs nom et id

        Salle s = new Salle("Salle A");

        System.out.println("Id de Salle: " + s.id);
        System.out.println("Nom de Salle: " + s.nom);


    }
}
