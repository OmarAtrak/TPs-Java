package ma.education.tp4.singleton;

//  V.3.d Créer une classe TestSingleton avec la méthode main
public class TestSingleton {
    public static void main(String[] args) {
        //  V.3.e Dans la méthode main créer les deux objets suivants.
        Terre t1= Terre.getInstance(1000, 2000);
        Terre t2= Terre.getInstance(4000, 5000);

        //  V.3.f Afficher la distanceToSoleil et la surface pour l’objet (t1)
        System.out.println("Les Informations d'objet t1");
        System.out.println("Distance To Soleil: "+t1.distanceToSoleil);
        System.out.println("Surface: "+t1.surface);

        System.out.println("-------------------------------------------");

        //  V.3.g Afficher la distanceToSoleil et la surface pour l’objet (t2).
        System.out.println("Les Informations d'objet t2");
        System.out.println("Distance To Soleil: "+t2.distanceToSoleil);
        System.out.println("Surface: "+t2.surface);

        //  V.3.g Quelle est votre remarque par rapport aux nombre d' objets créés dans la mémoire.
        //  l'objet t1 est le premier objet qu'est crée dans la mémoire
        //  l'objet t2 n'est pas crée mais prendre les valeur de premier objet qui crée

        
    }
}
