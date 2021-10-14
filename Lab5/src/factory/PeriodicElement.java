package factory;

public abstract class PeriodicElement {
    private int number;
    private String name;
    private String symbol;
    private double weight;
    private int period;
    private int group;
    private State state;
    private String type;
    public PeriodicElement(int number,String name,String symbol,double weight,int period, int group,
                           State state, String type){
        this.number = number;
        this.name = name;
        this.symbol = symbol;
        this.weight = weight;
        this.period = period;
        this.group = group;
        this.state = state;
        this.type = type;
    }
    public int getNumber() {
        return number;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getPeriod() {
        return period;
    }

    public int getGroup() {
        return group;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return  "number=" + number +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", weight=" + weight +
                ", period=" + period +
                ", group=" + group +
                ", state=" + state +
                ", type='" + type + '\'';
    }
}
