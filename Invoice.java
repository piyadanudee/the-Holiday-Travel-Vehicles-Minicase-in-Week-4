import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Invoice {
    private int invoiceID;
    private String nameOfCustomer;
    private Date date;
    private Vehicle vehicle;          
    private double negotiatedPrice;
    private double taxes;
    private double licenseFees;
    private String customerSignature;
    private TradeInVehicle tradeInVehicle;
    private final List<DealerOption> options = new ArrayList<>();

 public Invoice(int invoiceID, String nameOfCustomer,Vehicle vehicle,double negotiatedPrice,double taxes,double licenseFees,TradeInVehicle tradeInVehicle) {
        this.invoiceID = invoiceID;
        this.nameOfCustomer = nameOfCustomer;
        this.vehicle = vehicle;
        this.negotiatedPrice = negotiatedPrice;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
        this.tradeInVehicle = tradeInVehicle;
        this.date = new Date();
    }
public void addOptionToInvoice(DealerOption option) {
        if (option != null) options.add(option);
    }
public double calculateTotal() {
        double optionsTotal = options.stream().mapToDouble(DealerOption::getPrice).sum();
        double tradeInAllowance = tradeInVehicle != null ? tradeInVehicle.getTradeInAllowance() : 0.0;
        return negotiatedPrice + taxes + licenseFees + optionsTotal - tradeInAllowance;
    }
}
