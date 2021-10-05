package starbuzzCoffee;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return this.beverage.cost()+.15;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " Milk";
    }
}
