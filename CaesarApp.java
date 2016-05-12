package Aufgabe5;

public class CaesarApp {

	public static void main(String[] args) {

		if(args[1].equals("encrypt"))
		{
			for(int i = 0; i < args[2].length();i++){
				
				int n = (int)(args[2].charAt(i));
				if(n >= 97){
					int var = n+Integer.parseInt(args[0]);
					if(var>122){
						n = var-26;
						System.out.print((char)n);
					}else {
					n = var;
					System.out.print((char)n);
					}
				
				}
				else{
					System.out.print(args[2].charAt(i));
				}
			}
		}
		else if(args[1].equals("decrypt")){
			for(int i = 0; i < args[2].length();i++){
				int n = (int)(args[2].charAt(i));
				if(n >= 97){
					int var = n-Integer.parseInt(args[0]);
					if(var<97){
						n = var+26;
						System.out.print((char)n);
					}else {
					n = var;
					System.out.print((char)n);
					}
				
				}
				else{
					System.out.print(args[2].charAt(i));
				}
			}
		}
		else
		{
			System.err.println("Fehler");
		}
	}

}
