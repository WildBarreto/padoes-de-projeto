
public class main {
	public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();

        String item = "Produto A";
        String address = "123 Rua Principal";
        String paymentMethod = "Cartão de Crédito";
        double amount = 100.0;

        orderFacade.placeOrder(item, address, paymentMethod, amount);
    }
}
