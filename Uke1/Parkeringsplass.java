public class Parkeringsplass<T>{
	private T element;

	public void settInnKjoretoy(T kjoretoy){
		if(element == null){
			element = kjoretoy;
			System.out.println("Kjoretoy med regNr " + kjoretoy + " ble satt inn" );
			return;
		}

		System.out.println("Det er fullt.");
	}
}