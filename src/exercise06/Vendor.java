package exercise06;

public class Vendor extends Partner implements GoodsSource {

	public Vendor(String name, String city) {
		super(name, city);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString()
	{
		return "Vendor: " + super.toString();
	}

	@Override
	public boolean deliver(int count) {
		return true;
	}

}
