package Aufgabe5;

import java.util.*;



public class MatrixApp {

	private static final double Minimum = 0.5;
	private static final double Maximum = 0.5;
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Zeilenangabe");
		int x1 = scanner.nextInt();
		System.out.println("Spaltenangabe");
		int x2 = scanner.nextInt();
		double[][] matrixA = new double[x1][x2];
		double[][] matrixB = new double[x1][x2];
		double[][] matrixC = new double[x1][x2];
		System.out.printf("Matrix A");
		for(int i = 0; i < x2; i++){
			System.out.printf("\t\t");
		}
		System.out.printf("Matrix B");
		for(int i = 0; i < x2; i++){
			System.out.printf("\t\t");
		}
		System.out.printf("Matrix C");
		System.out.println("");
		
		for (int i = 0; i < matrixA.length; i++) { // Iteriere ueber "Zeilen"
			for (int j = 0; j < matrixA[i].length; j++){ // Laufe nun uber (hier: unterschiedlich lange!) "Spalten"
				Random rand = new Random();
				double digit = (rand.nextDouble()*Maximum)+Minimum;
				matrixA[i][j] = digit;
				System.out.printf("A= %.2f\t", digit);
			}
			System.out.printf("\t\t\t");
			for (int j = 0; j < matrixB[i].length; j++){ // Laufe nun uber (hier: unterschiedlich lange!) "Spalten"
				Random rand = new Random();
				double digit = (rand.nextDouble()*Maximum)+Minimum;
				matrixB[i][j] = digit;
				System.out.printf("B= %.2f\t", digit);
			}
			System.out.printf("\t\t\t");
			for(int j = 0; j< matrixC[i].length;j++){
				matrixC[i][j] = matrixA[i][j]+matrixB[i][j];
				System.out.printf("C= %.2f\t", matrixC[i][j]);
			}
		System.out.println();
		}
			System.out.println();
		}
	
}
