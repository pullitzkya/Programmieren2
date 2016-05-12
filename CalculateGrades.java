package Aufgabe5;

public class CalculateGrades {

	public static void main(String[] args) {
		int erg = 0;
		double average;
		//int n = Integer.parseInt("4711");
		
		if(args.length == 0){
			System.out.println("usage:: java CalculateGrades " + "<grade1 grade2 ...>");
			System.exit(0);
		}
		else
		{
			for(int i = 0; i < args.length; i++){
				int n = Integer.parseInt(args[i]);
				erg += n; 		
			}
			average = (double)erg/(double)args.length;
			System.out.println("Durchschnitt= " + average);
		}
	}
}
