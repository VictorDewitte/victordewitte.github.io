package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GebakjeApp {

	public static void main(String[] args) {
		List<String> posEig, negEig;
		posEig = new ArrayList<>();
		negEig = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		String omschrijving;
		
		int keuze;
		
		for(int i = 1 ; i<=3 ; i++){
			do {
				System.out.print("Is het eem positieve(=1) of een negatieve(=2) eigenschap? ");
				keuze = input.nextInt();
			}while(keuze!=1 && keuze!=2);
			
			input.nextLine();//newline word weggehaald
			
			System.out.print("Omschrijf deze eigenschap: ");
			omschrijving = input.nextLine();
			
			if(keuze == 1 )
				posEig.add(omschrijving);
			else
				negEig.add(omschrijving);
		}
		
		
	}

}
