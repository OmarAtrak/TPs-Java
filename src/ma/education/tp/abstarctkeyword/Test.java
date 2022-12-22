package ma.education.tp.abstarctkeyword;

//  s3.I.10 Créer une classe Test avec les instanciations suivantes.
//  Remarquer que f1 et f2 présentent des erreurs de compilations car les classes abstraites ne sont pas instanciable

public class Test {
    public static void main(String[] args) {
        //FormeGeometrique f1 =new FormeGeometrique();
        //FormeGeometrique f2 = new FormeGeoTypeA();
        FormeGeometrique f3 = new Triangle();
        FormeGeometrique f4 = new FormeGeometrique() {
            @Override // Classe fille Annonyme
            public double calculerSurface() {
                return 22;
            }
        };
    }

}
