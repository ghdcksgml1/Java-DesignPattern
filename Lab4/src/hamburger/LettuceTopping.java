package hamburger;

import java.awt.*;

public class LettuceTopping extends HamburgerIngredient{
    public LettuceTopping(Hamburger hamburger){super(hamburger);}
    @Override
    public String getDescription() {
        return super.getDescription()+" LettuceTopping";
    }
    public void paintComponent(Graphics g){

    }
    @Override
    public double cost(){
        return super.cost() + 500;
    }
}
