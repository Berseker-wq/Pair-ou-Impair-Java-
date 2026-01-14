// Importation de la classe Scanner pour lire l'entrée utilisateur
import java.util.Scanner;

// Classe principale de la calculatrice simple
public class Main {
    // Méthode principale qui s'exécute au lancement du programme
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée de l'utilisateur depuis la console
        Scanner scanner = new Scanner(System.in);
        
        // Demande à l'utilisateur d'entrer le premier nombre
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        // Demande à l'utilisateur d'entrer le deuxième nombre
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        // Demande à l'utilisateur d'entrer l'opérateur (+, -, *, /)
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        // Variable pour stocker le résultat du calcul
        double result;

        // Utilisation d'un switch pour effectuer l'opération selon l'opérateur choisi
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Vérification pour éviter la division par zéro
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                // Gestion des opérateurs invalides
                System.out.println("Error: Invalid operator");
                return;
        }
        // Affichage du résultat
        System.out.println("The result is: " + result);
    }
}
