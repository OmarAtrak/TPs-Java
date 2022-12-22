package ma.education.tp.interfacekeyword;

//  s3.III.4 Vu qu’une classe en java peut implémenter plusieurs interface, Créer la classe Humain suivante

public class Humain extends Animal implements Carnivore,Herbivore{
    @Override
    public void manger(Animal animal) {
        // ...
    }
    @Override
    public void manger(Vegetal vegetal) {
        // ...
    }

}
