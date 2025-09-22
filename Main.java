public class Main {
    public static void main(String[] args) {
        Customer c = new Customer("Alice", "123 Main St", "090-000-0000");
        SalesPerson s = new SalesPerson("Bob", 501);

        Vehicle v = new Vehicle("SN-001", "Sedan X", "X1", 2025, "ACME", 450000);
        TradeInVehicle t = new TradeInVehicle("OLD-777", "BYD", "City", 2018, 120000);

        DealerOption tint = new DealerOption("OPT-10", "Window Tint", 5000);
        DealerOption dashcam = new DealerOption("OPT-20", "Dash Cam", 3500);

        Invoice invoice = c.purchaseVehicle(
                s, v,
                430000,   // negotiatedPrice
                21000,    // taxes
                3500,     // licenseFees
                List.of(tint, dashcam),
                t         // trade-in
        );

        System.out.println(invoice);
        System.out.println("Grand total: " + invoice.calculateTotal());
