/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariopizza;


/**
 *
 * @author Rasmus
 */
public class MarioPizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char addPizzaToOrder = 0;
        //Test data
        pizzaTestData pizza1 = new pizzaTestData(1,"Tomat","","","","","");
        pizzaTestData pizza2 = new pizzaTestData(2,"Tomat","ost","","","","");
        pizzaTestData pizza3 = new pizzaTestData(3,"Tomat","ost","skinke","","","");
        pizzaTestData pizza4 = new pizzaTestData(4,"Tomat","ost","skinke","ananas","","");
        pizzaTestData pizza5 = new pizzaTestData(5,"Tomat","ost","skinke","ananas","pepperfrugt","");
        pizzaTestData pizza6 = new pizzaTestData(6,"Tomat","ost","skinke","ananas","pepperfrugt","Pepperoni");
        
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
        System.out.println(pizza4);
        System.out.println(pizza5);
        System.out.println(pizza6);
        //Test data slut
        
        
        
        Bestillinger ordre = new Bestillinger(12.45);
        ordre.indsætPizza(pizza6);
        ordre.indsætPizza(pizza2);
        System.out.println(ordre.toString());
        Bestillinger ordre2 = new Bestillinger(13);
        ordre2.indsætPizza(pizza3);
        System.out.println(ordre2.toString());
        
        
    }
    
}
