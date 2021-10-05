package hamburger;

import java.awt.*;

public class OnionTopping extends HamburgerIngredient{
    public OnionTopping(Hamburger hamburger){super(hamburger);}
    @Override
    public String getDescription() {
        return super.getDescription()+" OnionTopping";
    }
    public void paintComponent(Graphics g){

    }
    @Override
    public double cost(){
        return super.cost() + 500;
    }
}
