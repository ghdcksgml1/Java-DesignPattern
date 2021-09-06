public abstract class Vehicle {
    private MoveBehavior moveBehavior;

    public Vehicle(MoveBehavior moveBehavior){
        this.moveBehavior = moveBehavior;
    }


//    public Vehicle(MoveBehavior moveBehavior) {
//        this.moveBehavior = moveBehavior;
//    }

    public void move(){
        moveBehavior.move();
    }

    public void fillGas(Gas gas){
        System.out.println("fill "+gas.getClass().getName());
    }
    public abstract String name();

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public MoveBehavior getMoveBehavior() {
        return moveBehavior;
    }
}
