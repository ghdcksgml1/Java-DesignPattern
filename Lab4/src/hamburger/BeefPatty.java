package hamburger;

import java.awt.*;

public class BeefPatty extends HamburgerIngredient{
    public BeefPatty(Hamburger hamburger){
        super(hamburger);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" BeefPatty";
    }
    public void paintComponent(Graphics g){

    }
    @Override
    public double cost(){
        return super.cost() + 3000;
    }
}
