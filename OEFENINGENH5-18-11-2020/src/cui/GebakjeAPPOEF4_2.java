package cui;

import java.util.Arrays;
import java.util.Scanner;

import domein.Gebakje;

public class GebakjeAPPOEF4_2 {

	public static void main(String[] args) {
		String[] namen = {"aardbeientaartje", "eclair", "miserable", "hoorntje" , "Buttcake"};
		double[] eenheidsprijzen = {2.75, 1.5, 2, 1.75 , 33.66};
		
		//1ste stap => geheugenruimte vrijmaken
		Gebakje[] gebakjes =  new Gebakje[namen.length];
		
		// 2de => ieder Gebakje-object gaan aanmaken
		for(int index = 0 ; index < gebakjes.length ; index++) {
			gebakjes[index] =  new Gebakje(namen[index], eenheidsprijzen[index]);
		}
		System.out.printf("assortiement taartjes: %s%n%n", Arrays.toString(gebakjes));
		
		//Bestellingen
		int[][] bestellingen = new int[3][gebakjes.length];
		Scanner input = new Scanner(System.in);
		
		for(int rij = 0 ; rij < bestellingen.length ; rij++ )/*elke rij*/ {
			
				System.out.printf("Geef bestelling klant %d:   %n", rij+1);
				
				for(int i = 0 ; i < bestellingen[rij].length  ; i++) {
					System.out.printf("Geef aantal voor %s: " , gebakjes[i]);//toString()
					bestellingen[rij][i]= input.nextInt() ;
			}
		
		}
		 System.out.printf("\n Totaal te bakken: \n");
	        for (int kol = 0; kol < gebakjes.length; kol++) {
	            int aantal = 0;
	            for (int rij = 0; rij < bestellingen.length; rij++)
	                aantal += bestellingen[rij][kol];

	            if (aantal != 0)
	                System.out.printf("%d x %s\n", aantal, gebakjes[kol].toString());
	        }
			
	}
	
	
}


