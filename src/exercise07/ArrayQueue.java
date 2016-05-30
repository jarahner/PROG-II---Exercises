package exercise07;

public class ArrayQueue<T> implements Queue<T>{

	private int size;
	private T [] data;
	private int pointerLast=0;
	private int pointerFirst=0;
	
	public ArrayQueue(int groesse) {
		data = (T[]) new Object[groesse];
		this.size=groesse;
	}
	
	@Override
	public void enqueue(Object element) throws IllegalAccessException {
		if(nextEmpty()==true)
		{		
			data[pointerLast]=(T)element;
			
			if(pointerLast<size-1)
				pointerLast++;
			else
				pointerLast=0;
		}	
		else
			throw new IllegalAccessException();
	}

	@Override
	public T dequeue() {
		T speicher=data[pointerFirst];
		data[pointerFirst]=null;
	
		if(pointerFirst<size-1)
			pointerFirst++;
	
		else
			pointerFirst=0;

		return speicher;
	}

	@Override
	public T front() {
		return data[pointerFirst];
	}

	@Override
	public boolean empty() {
		boolean empty=true;
	
		for(int j=0;j<data.length;j++)
		{
			if(data[j]!=null)
				empty=false;
		}
		return empty;
	}
	
	public boolean nextEmpty()
	{
		if(data[pointerLast]==null)
			return true;
		
		else
			return false;
	}

}
