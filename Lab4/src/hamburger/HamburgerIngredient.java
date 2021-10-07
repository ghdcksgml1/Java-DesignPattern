package hamburger;

public abstract class HamburgerIngredient extends Hamburger{
    private Hamburger hamburger;

    public String getDescription(){
        return hamburger.getDescription();
    }

    public HamburgerIngredient(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public double cost() {
        return hamburger.cost();
    }
}
