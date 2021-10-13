package factory;

public abstract class PeriodicElement {
    private int number;
    private String symbol;
    private String name;
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
}
