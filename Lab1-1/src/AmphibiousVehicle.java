// 수륙양용차
public class AmphibiousVehicle extends Vehicle {
    private Status status;
    private MoveBehavior driveInLand;
    private MoveBehavior floatOnWater;



    public AmphibiousVehicle(MoveBehavior driveInLand, MoveBehavior floatOnWater){
        super(driveInLand);
        this.driveInLand = driveInLand;
        this.floatOnWater = floatOnWater;
        this.status = Status.LAND;
    }

    // getter & setter
    public Status getStatus(){
        return status;
    }
    public void setStatus(Status status){
        this.status = status;
        if(this.status == Status.LAND){
            setMoveBehavior(driveInLand);
        }
        else if(this.status == Status.WATER){
            setMoveBehavior(floatOnWater);
        }
    }
    public MoveBehavior getDriveInLand() {
        return driveInLand;
    }

    public MoveBehavior getFloatOnWater() {
        return floatOnWater;
    }

    public void setDriveInLand(MoveBehavior driveInLand) {
        this.driveInLand = driveInLand;
    }

    public void setFloatOnWater(MoveBehavior floatOnWater) {
        this.floatOnWater = floatOnWater;
    }
    /****************/

    @Override
    public String name() {
        return "AmphibiousVehicle";
    }


}
