import java.util.List;

public class Customer {
    private String name;
    private String address;
    private String phoneNumber;

    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
     public Invoice purchaseVehicle(
            SalesPerson sales,
            Vehicle vehicle,
            double negotiatedPrice,
            double taxes,
            double licenseFees,
            List<DealerOption> options,
            TradeInVehicle tradeIn
    ) {
        return sales.createInvoice(this, vehicle, negotiatedPrice, taxes, licenseFees, options, tradeIn);
    }
