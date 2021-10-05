package hamburger;

import java.awt.*;

public class TopBun extends HamburgerIngredient{
    public TopBun(Hamburger hamburger){super(hamburger);}
    @Override
    public String getDescription() {
        return super.getDescription()+" TopBun";
    }
    public void paintComponent(Graphics g){

    }
    @Override
    public double cost(){
        return super.cost() + 1000;
    }
}
