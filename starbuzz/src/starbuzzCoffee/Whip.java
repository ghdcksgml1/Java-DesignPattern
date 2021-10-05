package starbuzzCoffee;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return this.beverage.cost()+ .10;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " Whip";
    }
}
