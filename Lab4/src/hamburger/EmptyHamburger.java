package hamburger;

public class EmptyHamburger extends Hamburger{
    @Override
    public String getDescription(){
        return null;
    }
    @Override
    public double cost() {
        return 0;
    }
}
