package Aufgabe5;

import java.util.Scanner;
import java.math.*;

public class VectorApp {

	
	public static void main(String[] args) {
		double y = 0;
		double ergebnis = 0;
		
		Scanner scanner = new Scanner(System.in);
		double[] vector = new double[10];
		// Eingabe der Dimension
		System.out.println("Dimension des Vektors eingeben!");
		int dim = scanner.nextInt();
		// Eingabe des Vektors
		for( int i = 0; i < dim; i++){
			System.out.println("Stelle " + i + " des Vektors eingeben");
			double element = scanner.nextDouble();
			vector[i] = element;
		} 
		
		//Berechnung Länge Vektor
		for(int i = 0; i < dim; i++){
			double x = vector[i]*vector[i];
			y = y + x;
			ergebnis = Math.sqrt(y);
			
		}
		System.out.printf("Länge des Vektors beträgt: %.3f \n", ergebnis);
		
		//Ausgabe
		System.out.println("Dimension: " + dim);
		//Vektor Ausgabe
		for(int i = 0; i < dim; i++){
			System.out.printf("Wert an Stelle %d : %.3f \n",i+1,  vector[i] );
		}	
		
	}
}
