//  s3.II.1 Créer un nouveau package p6= “ma.education.tp.interfacekeyword”
package ma.education.tp.interfacekeyword;

//  s3.II.2 Créer une interface java avec le nom Compte
//  s3.II.3 Créer les signatures suivante dans l’interface compte

public interface Compte {
    void deposer(int montant) ; // Signature méthode 1
    int retirer(int montant); // Signature méthode 2
    int getBalance(); // Signature méthode 3
}
