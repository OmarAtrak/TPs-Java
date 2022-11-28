package ma.education.tp1.introduction;

//  s1.5.Dans le package (p1), créer une classe Test qui contient la méthode main
public class Test {
    public static void main(String[] args) {
        //  s1.6.En utilisant le mot réservé new, dans la méthode main, instancier les trois objets suivants:

        //  s1.6.a.Un objet (o1) en utilisant le constructeur sans paramètres
        Salle o1 = new Salle();

        //  s1.6.b.Un objet (o2) ayant le nom “Salle Informatique”
        Salle o2 = new Salle("Salle Informatique");

        //  s1.6.b.Un objet (o3) ayant l’id 2 et le nom “Salle des cours”
        Salle o3 = new Salle(2,"Salle des cours");

        //  s1.7.Afficher dans la consoles les valeurs des attributs des objets o1, o2 et o3
        System.out.println("les Informations d'objet o1");
        System.out.println("id: "+o1.id);
        System.out.println("nom: "+o1.nom);
        System.out.println("--------------------------------");
        System.out.println("les Informations d'objet o2");
        System.out.println("id: "+o2.id);
        System.out.println("nom: "+o2.nom);
        System.out.println("--------------------------------");
        System.out.println("les Informations d'objet o3");
        System.out.println("id: "+o3.id);
        System.out.println("nom: "+o3.nom);


    }
}
