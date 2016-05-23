package exercise06;

public class Customer extends Partner implements GoodsSink {

	private int received = 0;
	public Customer(String name, String city) {
		super(name, city);
	}

	@Override
	public void receive(int count) {
		received += count;
		
	}
	
	public String toString()
	{
		return "Customer: " + super.toString();
	}
	
	public void sendInvoice() {
		System.out.println("Invoice: " + toString() + " - Received: "  + received);
		received = 0;
	}

}
