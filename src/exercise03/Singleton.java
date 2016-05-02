package exercise03;

/******* AUFGABE FERTIG BEARBEITET *******/ 


// Die nachfolgende Klasse soll genau einmal instanziiert werden koennen.
// Dazu kann der Trick angewendet werden, den Konstruktor private zu machen
// und fuer die Generierung der Instanz eine eigene Methode getInstance
// vorzusehen.

public class Singleton {

	// Diese Variable soll spaeter die *eine* Instanz aufnehmen
	private static Singleton mySingleton = null;

	// Diese Variable dient dazu, die korrekte Funktion zu ueberpruefen
	private int i = 3;


	// *******************************************************************
	// Hier fehlen der Konstruktor und die Methode getInstance
	//

	
	// Aufgabe a) private Constructor
	private Singleton(){
		
	}//end constructor
	
	
	// Aufgabe b) getInstance
	public static Singleton getInstance(){
		if(mySingleton == null){
			mySingleton = new Singleton();
		}
		return mySingleton;
	}//end Singleton getInstance



	// *******************************************************************


	// Mit Hilfe der nachfolgenden main-Methode koennen Sie ueberpruefen,
	// ob Ihre Implementierung funktioniert. 

	// Hinweis: Anfangs kompiliert nachfolgener Code nicht.
	// Sie muessen zunaechst die fehlenden Methoden implementieren!

	public static void main(String[] args)
	{

		System.out.println("Start der Tests...");

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		if (s1 == null)
		{
			System.out.println ("Fehler: getInstance liefert beim ersten Aufruf null zurueck.");
			return;
		}

		if (s2 == null)
		{
			System.out.println ("Fehler: getInstance liefert beim zweiten Aufruf null zurueck.");
			return;
		}

		s1.i = 17;

		if (s2.i == 17)
			System.out.println ("Ihre Singleton-Implementierung ist korrekt.");
		else
			System.out.println ("Ihre Singleton-Implementierung ist fehlerhaft.");

		System.out.println("Testende");
	}
	
	
} 
