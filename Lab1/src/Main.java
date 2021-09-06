public class Main {
    public static void main(String[] args){
        AmphibiousVehicle ab = new AmphibiousVehicle(Status.WATER);

        ab.move();
        System.out.println(ab.name());
        ab.fillGas(new Gas());

        ab.setStatus(Status.LAND);
        System.out.println(ab.getStatus());
        ab.move();
    }
}
