
package mario;

// Alfonso indtaster

import java.util.ArrayList;
import java.util.Scanner;


public class Bestillinger {

    private int ordreNummer = 0;
    private String ordre;
    private char userInput = 'T';    
    private ArrayList<String> list = new ArrayList<String>();
        // odreNummer++
    public void Alfonso(){
        Scanner TorF = new Scanner(System.in);
        Scanner alfonso = new Scanner(System.in);
        System.out.println("Bestillingsliste.");
        System.out.println("Tilføj eller fjern bestilling (T/F): ");

        while (userInput != 'F'){
            userInput = TorF.next().charAt(0);
            if (userInput == 'T'){
                System.out.println("Indtast bestillingen:");
                ordre = alfonso.nextLine();
                list.add(ordre);
                System.out.println("Din ordre: " + list);
                System.out.println("Tilføj eller fjern bestilling (T/F): ");
            } else if (userInput != 'T' && userInput != 'F'){
                System.out.println("Dette er ikke en mulighed");
            } else if (userInput == 'F'){
                System.out.println("Test");
            }
        }
        }

    }
    // Tilføje pizzaer til bestillinger
    
    // Fjerne/rykke pizzaer fra bestillinger til TidligereOrdre
    
    
    /*
    TO-DO:
        - Lav scanner således at alfonso kan idtaste hvilke pizzaer der bestilles
        - Lav metode til at add
        - Lav metode til at fjerne
    */

    

