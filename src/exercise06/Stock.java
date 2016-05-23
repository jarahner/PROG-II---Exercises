package exercise06;

public class Stock implements GoodsSource, GoodsSink{

	private int stock = 0;
	
	public Stock() {
		
	}

	@Override
	public void receive(int count) {
		stock += count;
		
	}

	@Override
	public boolean deliver(int count) {
		if(stock >= count)
			return true;
		else return false;
	}
	
	public String toString(){
		return "Stock";
	}

}
