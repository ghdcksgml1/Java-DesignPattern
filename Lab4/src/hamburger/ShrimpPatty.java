package hamburger;

import java.awt.*;

public class ShrimpPatty extends HamburgerIngredient{
    // set its image
    public ShrimpPatty(Hamburger hamburger){
        super(hamburger);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" ShrimpPatty";
    }
    public void paintComponent(Graphics g){

    }
    @Override
    public double cost(){
        return super.cost() + 900;
    }
}
