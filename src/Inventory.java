
public class Inventory {
	public void checkInventory(String item) {
        System.out.println("Verificando estoque de " + item);
    }
}
class PaymentProcessor {
    public void processPayment(String paymentMethod, double amount) {
        System.out.println("Processando pagamento de " + paymentMethod + " no valor de R$" + amount);
    }
}

class ShippingService {
    public void shipOrder(String item, String address) {
        System.out.println("Enviando " + item + " para o endereço " + address);
    }
}