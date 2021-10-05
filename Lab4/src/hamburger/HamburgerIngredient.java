package hamburger;

import java.awt.*;

public abstract class HamburgerIngredient extends Hamburger{
    private Hamburger hamburger;
    private Image image;

    public abstract String getDescription();

    public HamburgerIngredient(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public double cost() {
        return 0;
    }
}
