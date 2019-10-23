/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariopizza;

import java.util.ArrayList;

/**
 *
 * @author Rasmus
 */
public class Bestillinger {
    private int ordreNummer = 1;
    private double tidTilAfhentning;
    
    public Bestillinger(double tidTilAfhentning) {
        this.tidTilAfhentning = tidTilAfhentning + 1;
        this.tidTilAfhentning = tidTilAfhentning;
    }
    
    ArrayList<pizzaTestData> bestilling = new ArrayList();
    
    public void indsætPizza(pizzaTestData pizza) {
        bestilling.add(pizza);
    }
    public void fjernPizza(pizzaTestData pizza) {
        bestilling.remove(pizza);
    }
    @Override
    public String toString() {
        String result="" + tidTilAfhentning + " \n";
        for(pizzaTestData pizza:bestilling) {
            result+=pizza.toString() + "\n";
        }
        return result;
    }
    
}
