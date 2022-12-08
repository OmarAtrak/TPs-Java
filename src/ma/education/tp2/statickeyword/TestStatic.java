package ma.education.tp2.statickeyword;

//  IV.6 Dans le package p3, créer la classe TestStatic contenant la méthode main

public class TestStatic {
    public static void main(String[] args) {
        //  IV.7 Dans la méthode main, instancier les deux objets suivants:
        Etudiant e1= new Etudiant(1, "AHMED", 20);
        Etudiant e2= new Etudiant(2, "SAID", 30);

        //  IV.8 Afficher les attributs de (e1) et (e2)
        System.out.println("ID: "+e1.id);
        System.out.println("Nom: "+e1.nom);
        System.out.println("------------------------------");
        System.out.println("ID: "+e2.id);
        System.out.println("Nom: "+e2.nom);
        //  IV.9 Que dites vous par rapport à la valeur de l’attribut static nbEtudiants?
        // on ne peut pas l'acces a les attributs de la classe a partir d'un objet
        // mais on peut l'acces les attributs de la clacce a partir de la nom de classe
        System.out.println("Nombre Etudiants: "+Etudiant.nbEtudiants);
    }
}
