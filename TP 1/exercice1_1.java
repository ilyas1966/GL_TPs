abstract class Animal {
    private String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    
    public abstract void faireDuBruit();
}


class Mammifere extends Animal {
    public Mammifere(String nom) {
        super(nom);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " grogne.");
    }
}

// 3. Classe Oiseau héritant d'Animal
class Oiseau extends Animal {
    public Oiseau(String nom) {
        super(nom);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " chante.");
    }

    // Question 5 : Méthode voler() complétée
    public void voler() {
        System.out.println("L'oiseau vole.");
    }
}


public class TP1_Exercice1_1_Zoo {
    public static void main(String[] args) {
        System.out.println("=== Exercice 1.1 - Gestion du Zoo ===\n");

        Animal tigre = new Mammifere("Tigre");
        Animal perroquet = new Oiseau("Perroquet");

    
        tigre.faireDuBruit();     
        perroquet.faireDuBruit();   

        
        System.out.println();
        Oiseau perroquetOiseau = (Oiseau) perroquet;
        perroquetOiseau.voler();    

        System.out.println("\n=== Réponses aux Questions ===\n");

        
        System.out.println("Q1 - Encapsulation :");
        System.out.println("L'encapsulation consiste à cacher les données internes d'un objet");
        System.out.println("et à n'exposer que les méthodes nécessaires. Dans la classe Animal,");
        System.out.println("l'attribut 'nom' est privé (private) et accessible via le getter getNom().\n");

        System.out.println("Q2 - Héritage :");
        System.out.println("L'héritage permet à une classe de réutiliser les attributs et méthodes");
        System.out.println("d'une autre classe. Mammifere et Oiseau héritent de Animal via 'extends'.\n");

        System.out.println("Q3 - Abstraction :");
        System.out.println("L'abstraction permet de définir un contrat sans implémentation.");
        System.out.println("La classe Animal est abstraite (abstract class) et la méthode faireDuBruit()");
        System.out.println("est abstraite, obligeant chaque sous-classe à fournir sa propre implémentation.\n");

        System.out.println("Q4 - Polymorphisme :");
        System.out.println("Le polymorphisme permet à un même appel de méthode d'avoir des comportements");
        System.out.println("différents selon le type réel de l'objet. Dans main(), tigre.faireDuBruit()");
        System.out.println("appelle la version Mammifere, et perroquet.faireDuBruit() la version Oiseau.\n");

        
        System.out.println("Q7 - Mots-clés identifiés :");
        System.out.println("- Héritage : extends");
        System.out.println("- Redéfinition de méthode : @Override");
        System.out.println("- Abstraction : abstract");
    }
}
