// Programme pour déterminer si un nombre est pair ou impair

// Importation de la classe Scanner pour lire l'entrée utilisateur
import java.util.Scanner;

// Classe principale du programme
public class Pair {
    // Méthode principale qui s'exécute au lancement du programme
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée de l'utilisateur depuis la console
        Scanner scanner = new Scanner(System.in);
        
        // Demande à l'utilisateur d'entrer un nombre entier
        System.out.print("Entrez un nombre entier: ");
        int number = scanner.nextInt();
        
        // Vérification si le nombre est pair (divisible par 2)
        if (number % 2 == 0) {
            System.out.println(number + " est un nombre pair.");
        } else {
            // Sinon, il est impair
            System.out.println(number + " est un nombre impair.");
        }
    }
} 
