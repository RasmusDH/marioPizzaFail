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
public class pizzaTestData {
    
    int nummerPåMenu;
    String ingrediens1;
    String ingrediens2;
    String ingrediens3;
    String ingrediens4;
    String ingrediens5;
    String ingrediens6;

    public pizzaTestData(int nummerPåMenu, String ingrediens1, String ingrediens2, String ingrediens3, String ingrediens4, String ingrediens5, String ingrediens6) {
        this.nummerPåMenu = nummerPåMenu;
        this.ingrediens1 = ingrediens1;
        this.ingrediens2 = ingrediens2;
        this.ingrediens3 = ingrediens3;
        this.ingrediens4 = ingrediens4;
        this.ingrediens5 = ingrediens5;
        this.ingrediens6 = ingrediens6;
    }

    
    
    
    public int getNummerPåMenu() {
        return nummerPåMenu;
    }

    public void setNummerPåMenu(int nummerPåMenu) {
        this.nummerPåMenu = nummerPåMenu;
    }

    public String getIngrediens1() {
        return ingrediens1;
    }

    public void setIngrediens1(String ingrediens1) {
        this.ingrediens1 = ingrediens1;
    }

    public String getIngrediens2() {
        return ingrediens2;
    }

    public void setIngrediens2(String ingrediens2) {
        this.ingrediens2 = ingrediens2;
    }

    public String getIngrediens3() {
        return ingrediens3;
    }

    public void setIngrediens3(String ingrediens3) {
        this.ingrediens3 = ingrediens3;
    }

    public String getIngrediens4() {
        return ingrediens4;
    }

    public void setIngrediens4(String ingrediens4) {
        this.ingrediens4 = ingrediens4;
    }

    public String getIngrediens5() {
        return ingrediens5;
    }

    public void setIngrediens5(String ingrediens5) {
        this.ingrediens5 = ingrediens5;
    }

    public String getIngrediens6() {
        return ingrediens6;
    }

    public void setIngrediens6(String ingrediens6) {
        this.ingrediens6 = ingrediens6;
    }

    @Override
    public String toString() {
        if(ingrediens1 != "" && ingrediens2 != "" && ingrediens3 != "" && ingrediens3 != "" && ingrediens4 != "" && ingrediens5 != "" && ingrediens6 != "") {
            return "nummerP\u00e5Menu = " + nummerPåMenu + ", " + ingrediens1 + ", " + ingrediens2 + ", " + ingrediens3 + ", " + ingrediens4 + ", " + ingrediens5 + ", " + ingrediens6;
        }
        else if(ingrediens1 != "" && ingrediens2 != "" && ingrediens3 != "" && ingrediens3 != "" && ingrediens4 != "" && ingrediens5 != "") {
            return "nummerP\u00e5Menu = " + nummerPåMenu + ", " + ingrediens1 + ", " + ingrediens2 + ", " + ingrediens3 + ", " + ingrediens4 + ", " + ingrediens5;
        }
        else if(ingrediens1 != "" && ingrediens2 != "" && ingrediens3 != "" && ingrediens3 != "" && ingrediens4 != "") {
            return "nummerP\u00e5Menu = " + nummerPåMenu + ", " + ingrediens1 + ", " + ingrediens2 + ", " + ingrediens3 + ", " + ingrediens4;
        }
        else if(ingrediens1 != "" && ingrediens2 != "" && ingrediens3 != "" && ingrediens3 != "") {
            return "nummerP\u00e5Menu = " + nummerPåMenu + ", " + ingrediens1 + ", " + ingrediens2 + ", " + ingrediens3;
        }
        else if(ingrediens1 != "" && ingrediens2 != "") {
            return "nummerP\u00e5Menu = " + nummerPåMenu + ", " + ingrediens1 + ", " + ingrediens2;
        }
        else if(ingrediens1 != "") {
            return "nummerP\u00e5Menu = " + nummerPåMenu + ", " + ingrediens1;
        }
        else {
            return "pizzaTestData \n" + "nummerP\u00e5Menu = " + nummerPåMenu + "" + ingrediens1 + "" + ingrediens2 + "" + ingrediens3 + "" + ingrediens4 + "" + ingrediens5 + "" + ingrediens6;
        }
    }
    
    
    
}
