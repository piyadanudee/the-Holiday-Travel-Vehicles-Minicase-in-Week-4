public class TradeInVehicle {
    private String serialNumber;
    private String make;   // manufacturer/brand
    private String model;
    private int year;
    private double tradeInAllowance;

    public TradeInVehicle(String serialNumber, String make, String model, int year, double tradeInAllowance) {
        this.serialNumber = serialNumber;
        this.make = make;
        this.model = model;
        this.year = year;
        this.tradeInAllowance = tradeInAllowance;
    }
