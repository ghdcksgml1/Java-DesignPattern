package hamburger;

import java.awt.*;

public class CheeseTopping extends HamburgerIngredient{
    public CheeseTopping(Hamburger hamburger){super(hamburger);}
    @Override
    public String getDescription() {
        return super.getDescription()+" CheeseTopping";
    }
    public void paintComponent(Graphics g){

    }
    @Override
    public double cost(){
        return super.cost() + 1000;
    }
}
