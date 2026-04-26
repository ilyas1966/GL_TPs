class CompteBancaire {
    private String numeroCompte;
    private double solde;

    public CompteBancaire(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public String getNumeroCompte() { return numeroCompte; }
    public double getSolde() { return solde; }

    
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " € effectué. Nouveau solde : " + solde + " €");
        } else {
            System.out.println("Erreur : Le montant du dépôt doit être positif.");
        }
    }

    
    public void retirer(double montant) {
        if (montant <= 0) {
            System.out.println("Erreur : Le montant du retrait doit être positif.");
        } else if (montant > solde) {
            System.out.println("Erreur : Solde insuffisant. Solde actuel : " + solde + " €");
        } else {
            solde -= montant;
            System.out.println("Retrait de " + montant + " € effectué. Nouveau solde : " + solde + " €");
        }
    }

    public void afficherInfos() {
        System.out.println("Compte N° " + numeroCompte + " | Solde : " + solde + " €");
    }
}


class CompteCourant extends CompteBancaire {
    public CompteCourant(String numeroCompte, double solde) {
        super(numeroCompte, solde);
    }
}


class CompteEpargne extends CompteBancaire {
    public CompteEpargne(String numeroCompte, double solde) {
        super(numeroCompte, solde);
    }

    
    public void calculerInterets(double taux) {
        double interets = getSolde() * taux / 100;
        deposer(interets);
        System.out.println("Intérêts de " + interets + " € ajoutés (taux : " + taux + "%).");
    }
}


public class TP1_Exercice1_3_Banque {
    public static void main(String[] args) {
        System.out.println("=== Exercice 1.3 - Gestion de Comptes Bancaires ===\n");

        
        System.out.println("--- Compte Courant ---");
        CompteCourant cc = new CompteCourant("CC-001", 1000.0);
        cc.afficherInfos();
        cc.deposer(500);
        cc.retirer(200);
        cc.retirer(2000); 
        cc.afficherInfos();

        System.out.println();

        
        System.out.println("--- Compte Épargne ---");
        CompteEpargne ce = new CompteEpargne("CE-001", 5000.0);
        ce.afficherInfos();
        ce.deposer(1000);
        ce.calculerInterets(3.5); 
        ce.retirer(500);
        ce.afficherInfos();
    }
}
