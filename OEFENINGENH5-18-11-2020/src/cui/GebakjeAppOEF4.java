package cui;

import java.util.Arrays;
import java.util.Scanner;

import domein.Gebakje;

public class GebakjeAppOEF4 {

	public static void main(String[] args) {
		String[] namen = {"aardbeientaartje", "eclair", "miserable", "hoorntje"};
		double[] eenheidsprijzen = {2.75, 1.5, 2, 1.75};
		
		//1ste stap => geheugenruimte vrijmaken
		Gebakje[] gebakjes =  new Gebakje[namen.length];
		
		// 2de => ieder Gebakje-object gaan aanmaken
		for(int index = 0 ; index < gebakjes.length ; index++) {
			gebakjes[index] =  new Gebakje(namen[index], eenheidsprijzen[index]);
		}
		System.out.printf("assortiement taartjes: %s%n%n", Arrays.toString(gebakjes));
		
		//Bestellingen
		int[] bestellingen = new int[gebakjes.length];
		Scanner input = new Scanner(System.in);
		
		double teBetalen = 0;
		
		for(int i = 0 ; i < bestellingen.length ; i++) {
			System.out.printf("Geef aantal voor %s: " , gebakjes[i]);//toString()
			bestellingen[i] = input.nextInt();
			teBetalen+= bestellingen[i]*gebakjes[i].getPrijs();
		}
		
		if(teBetalen == 0)
			System.out.println("\nNiets Besteld.");
		else {
			System.out.println("\nDe Bestelling:");
			int index = 0;
			for(int aantal: bestellingen) {
				if(aantal != 0 )
					System.out.printf("%d x %s%n", aantal , gebakjes[index]);
				index++;
			}
			System.out.printf("kost $%.2f%n", teBetalen);
		}
	
	}
	

}
