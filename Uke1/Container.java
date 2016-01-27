public class Container<E>{
	private E element;

	public void put(E e){
		if(element == null){
			element = e;
		}
		
	}

	public E take(){
		E temp = element;
		element = null;
		return temp;
	}
}