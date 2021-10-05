package hamburger;

import java.awt.*;

public class TomatoTopping extends HamburgerIngredient{
    public TomatoTopping(Hamburger hamburger){super(hamburger);}
    @Override
    public String getDescription() {
        return super.getDescription()+" TomatoTopping";
    }
    public void paintComponent(Graphics g){

    }
    @Override
    public double cost(){
        return super.cost() + 500;
    }
}
