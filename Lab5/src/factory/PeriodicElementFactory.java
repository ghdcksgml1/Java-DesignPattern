package factory;

public class PeriodicElementFactory {
    public static PeriodicElement getInstance(int number,String name,String symbol,double weight,int period, int group,
                                              State state, String type){
        switch(state){
            case gas:
                return new GasPeriodicElement(number,name,symbol,weight,period,group,state,type);
            case solid:
                return new SolidPeriodicElement(number,name,symbol,weight,period,group,state,type);
            case liq:
                return new LiquidPeriodicElement(number,name,symbol,weight,period,group,state,type);
            case artificial:
                return new UnknownPeriodicElement(number,name,symbol,weight,period,group,state,type);
            default:
                return null;
        }
    }
}
