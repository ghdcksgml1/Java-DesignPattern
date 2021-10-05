package hamburger;

import java.awt.*;

public class ChickenPatty extends HamburgerIngredient{
    public ChickenPatty(Hamburger hamburger){
        super(hamburger);
    }
    @Override
    public String getDescription() {
        return super.getDescription()+" ChickenPatty";
    }
    public void paintComponent(Graphics g){

    }
    @Override
    public double cost(){
        return super.cost() + 3000;
    }
}
