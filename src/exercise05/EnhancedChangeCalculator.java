package exercise05;

/***** AUFGABE FERTIG BEARBEITET *****/

// Ihre Aufgabe ist es, in der nachfolgenden Klasse die geerbte
// Methode getChange zu ueberschreiben. Natuerlich muss der
// Softwarevertrag der Oberklasse eingehalten werden. Ihre
// Spezialisierung soll aber darueber hinaus sicherstellen,
// dass die Anzahl der ausgegeben Muenzen minimal ist.

public class EnhancedChangeCalculator extends SimpleChangeCalculator 
{
	
	// Hier fehlt Ihre Implementierung
	public int[] getChange(int euros, int cent){
		int rest = euros*100 + cent;
		int r�ckgabe[] = new int[Coin.availableCoins.length];
		for (int i=0; i<Coin.availableCoins.length; i++)
			r�ckgabe[i] = 0;
		
		// VERSION 1
		/** int i = Coin.availableCoins.length-1;
		do{
			r�ckgabe[i] = rest / Coin.availableCoins[i].getValue();
			rest %= Coin.availableCoins[i].getValue();
			i--;
		} while(rest > 0);
		**/
		
		// VERSION 2
		for(int i = Coin.availableCoins.length-1; rest>0 && i>=0; i--){
			r�ckgabe[i] = rest / Coin.availableCoins[i].getValue();
			rest %= Coin.availableCoins[i].getValue();
		}
		
		return r�ckgabe;
	}
	
	
	
	
	
	// Die nachfolgende main-Methode kann genutzt werden, um das
	// Ergebnis zu ueberpruefen.
	public static void main(String[] args)
	{
		
		int j = 0;
		EnhancedChangeCalculator calc = new EnhancedChangeCalculator();
		
		System.out.println("\nZuerst ein simpler Fall: Es sollen 1 Euro und 70 Cent Wechselgeld zur�ckgegeben werden:");
		int[] result = calc.getChange(1,70);
		
		System.out.println("\nDer Automat gibt folgende Muenzen zurueck:");
		j = 0;
		for (int i=0; i<Coin.availableCoins.length; i++)
		{
			System.out.println(result[i] + " x " + Coin.availableCoins[i].getName());
			j += result[i];
		}//endfor
		System.out.println("Anzahl der M�nzen: " + j);
		
		System.out.println("\nJetzt ein bi�chen schwieriger: Es sollen 3 Euro und 88 Cent Wechselgeld zur�ckgegeben werden:");
		result = calc.getChange(3,88);
		
		System.out.println("\nDer Automat gibt folgende Muenzen zurueck:");
		j = 0;
		for (int i=0; i<Coin.availableCoins.length; i++)
		{
			System.out.println(result[i] + " x " + Coin.availableCoins[i].getName());
			j += result[i];
		}//endfor
		System.out.println("Anzahl der M�nzen: " + j);
		
		
		System.out.println("\nPassend gezahlt. Kein Wechselgeld:");
		result = calc.getChange(0,0);
		
		System.out.println("\nDer Automat gibt folgende Muenzen zurueck:");
		j = 0;
		for (int i=0; i<Coin.availableCoins.length; i++)
		{
			System.out.println(result[i] + " x " + Coin.availableCoins[i].getName());
			j += result[i];
		}//endfor
		System.out.println("Anzahl der M�nzen: " + j);
	}//endmethod main
	
}//endclass EnhancedChangeCalculator
