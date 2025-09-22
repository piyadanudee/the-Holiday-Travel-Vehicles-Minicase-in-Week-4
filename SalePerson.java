public class SalesPerson {
    private String name;
    private int saleID;

    public SalesPerson(String name, int saleID) {
        this.name = name;
        this.saleID = saleID;
    }
        public Invoice createInvoice(
            Customer customer,
            Vehicle vehicle,
            double negotiatedPrice,
            double taxes,
            double licenseFees,
            List<DealerOption> options,
            TradeInVehicle tradeIn
    ) {
        Invoice inv = new Invoice(
                Ids.nextInvoiceId(),
                customer.getName(),
                vehicle,
                negotiatedPrice,
                taxes,
                licenseFees,
                tradeIn
        );
        if (options != null) {
            for (DealerOption opt : options) inv.addOptionToInvoice(opt);
        }
        return inv;
    }

