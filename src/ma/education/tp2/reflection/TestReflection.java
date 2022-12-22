//  III.1 Dans le projet "TPs Java", créer un package p2= “ma.education.tp2.reflection”
package ma.education.tp2.reflection;

import ma.education.tp1.introduction.Salle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//  III.2 Dans (p2), créer une classe TestReflection contenant la méthode main.
public class TestReflection {
    public static void main(String[] args) {
        //  III.3 Dans la méthode main, créer un programme java qui affiche les nom des attributs de la
        //  classe “ma.education.tp1.introduction.Salle”
        Class classSalle = Salle.class;

        Field attributs[] = classSalle.getDeclaredFields();
        int i = 1;
        for (Field attribut : attributs) {
            System.out.println("l'attribut "+i+": "+attribut.getName());
            i++;
        }

        //  III.4 Dans la méthode main de la classe TestReflection, créer un programme java qui affiche
        //  les nom des méthodes de la classe “ma.education.tp1.introduction.Salle”
        Method methodes[] = classSalle.getDeclaredMethods();
        int j = 1;
        for (Method methode : methodes) {
            System.out.println("Methode "+j+": "+methode.getName());
            j++;
        }

        //  III.5 Dans la méthode main de la classe TestReflection, En utilisant la reflection, instancier
        //  trois objets de la classe “ma.education.tp1.introduction.Salle”
        //  III.5.a Un objet (o1) en utilisant le constructeur sans paramètres
        //  III.5.b Un objet (o2) ayant le nom “Salle Informatique”
        //  III.5.c Un objet (o3) ayant l’id 2 et le nom “Salle des cours”

        Constructor cons [] = classSalle.getDeclaredConstructors();

        Salle o1 = null;
        Salle o2 = null;
        Salle o3 = null;

        for (Constructor c : cons) {
            int count = c.getParameterCount();

            switch (count){
                case 0:{
                    //o1 = (Salle) c.newInstance();
                    break;
                }
                case 1:{
                    //o2 = (Salle) c.newInstance("Salle Informatique");
                }
                case 2:{
                    //o3 = (Salle) c.newInstance(2,"Salle des cours");
                }
            }
        }



        //  III.6 Dans la méthode main, comparer les objets o2 et o3 en utilisant la méthode equals de la
        //  classe Object. Afficher le résultat de la comparaison dans la console.


        //  III.7 Recréer la méthode equals dans la classe “ma.education.tp1.introduction.Salle” pour
        //  retourner true si deux objets portent le même id.
    }
}
