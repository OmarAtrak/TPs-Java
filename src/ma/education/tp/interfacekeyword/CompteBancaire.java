package ma.education.tp.interfacekeyword;

//  s3.III.1 Créer une classe CompteBancaire qui implémente l’interface Compte précédente
//  s3.III.2 Remarquer les erreurs de compilation et donner une implémentation (un corps ) aux signatures déclarées
//  dans l’interface Compte


public class CompteBancaire implements Compte{
    private String numero;
    private int balance;

    public CompteBancaire(String numero) {
        this.numero = numero;
    }
    @Override
    public void deposer(int montant) {
        this.balance += montant;
    }
    @Override
    public int retirer(int montant) {
        if (balance < montant) {
            return 0;
        }
        return this.balance -= montant;
    }
    @Override
    public int getBalance() {
        return this.balance;
    }
    public String getNumero() {
        return numero;
    }
}
