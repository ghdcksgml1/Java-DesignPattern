package starbuzzCoffee;

public class Soy extends  CondimentDecorator{
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return this.beverage.cost() + .18;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+" Soy";
    }
}
