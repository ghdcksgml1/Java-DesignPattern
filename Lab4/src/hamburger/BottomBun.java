package hamburger;

public class BottomBun extends Hamburger{
    @Override
    public String getDescription(){
        return "BottomBun";
    }
    @Override
    public double cost() {
        return 1000;
    }
}
