import java.util.ArrayList;
import java.util.List;

public class Ville {
    private String nom;
    private List<Commentaire> commentaires;

 
    public Ville(String nom) {
        this.nom = nom;
        this.commentaires = new ArrayList<>();
    }

  
    public void ajouterCommentaire(Commentaire c) {
        commentaires.add(c);
    }


    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void afficherCommentaires() {
        System.out.println("Ville : " + nom);
        if (commentaires.isEmpty()) {
            System.out.println("Aucun commentaire pour cette ville.");
        } else {
            for (Commentaire c : commentaires) {
                System.out.println("- " + c);
            }
        }
    }
}

class Commentaire {
    private String auteur;
    private String texte;

    public Commentaire(String auteur, String texte) {
        this.auteur = auteur;
        this.texte = texte;
    }

    @Override
    public String toString() {
        return auteur + " : " + texte;
    }
}

class Main {
    public static void main(String[] args) {
       
        Ville paris = new Ville("Paris");
        Ville lyon = new Ville("Lyon");

       
        Commentaire c1 = new Commentaire("Alice", "Super ville avec beaucoup de culture !");
        Commentaire c2 = new Commentaire("Bob", "J'adore la nourriture ici.");

        // Ajouter commentaires aux villes
        paris.ajouterCommentaire(c1);
        paris.ajouterCommentaire(c2);

        // Afficher commentaires
        paris.afficherCommentaires();
        lyon.afficherCommentaires(); // Aucun commentaire pour Lyon
    }
}
