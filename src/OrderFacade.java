
public class OrderFacade {
	private Inventory inventory;
    private PaymentProcessor paymentProcessor;
    private ShippingService shippingService;

    public OrderFacade() {
        inventory = new Inventory();
        paymentProcessor = new PaymentProcessor();
        shippingService = new ShippingService();
    }

    public void placeOrder(String item, String address, String paymentMethod, double amount) {
        System.out.println("Iniciando o processo de pedido...");

        inventory.checkInventory(item);
        paymentProcessor.processPayment(paymentMethod, amount);
        shippingService.shipOrder(item, address);

        System.out.println("Pedido concluído com sucesso!");
    }
}
