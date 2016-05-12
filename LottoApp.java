package Aufgabe5;

public class LottoApp {
	private static final int anzahlZahlen = 6;

	public static void main(String[] args) {
	int[] lottoZahlen = new int[anzahlZahlen];

	//check RandomNumbers
	for(int i = 0; i < anzahlZahlen; i++){
		int lottozahl = (int) (Math.random()*49)+1;
		lottoZahlen[i] = lottozahl;
		for(int j= 0; j < i; j++){
			if (lottoZahlen[i] == lottoZahlen[j])
			{
				lottoZahlen[i] = (int) (Math.random()*49)+1;
				i--;
				break;
			}
		}
	}
	
	for(int i = 0; i < anzahlZahlen; i++){
		System.out.println("Zahl= " + lottoZahlen[i]);
	}
	
		//Superzahl
		int superzahl = (int) (Math.random()*9);
		System.out.println("Superzahl: " + superzahl);
	}
}
