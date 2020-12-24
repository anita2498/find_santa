package findsanta;

import java.util.Scanner;

public class SantaFinder {
	public static void main (String[]args) {
		
		
		
		SantaSuspects santaSuspects = new SantaSuspects(10);
		santaSuspects.addSuspect("Bob@Bezenga.com");
		santaSuspects.addSuspect("Sally@Zimmers.com");
		santaSuspects.addSuspect("Peter@Pinkelton.com");
		santaSuspects.addSuspect("Rudolf@Rednose.com");
		santaSuspects.addSuspect("Bob@Ross.com");
		santaSuspects.addSuspect("Rachel@Green.com");
		santaSuspects.addSuspect("Kobe@Bryant.com");
		santaSuspects.addSuspect("Monica@Geller.com");
		santaSuspects.addSuspect("Consuela@BenanaHammock.com");
		santaSuspects.addSuspect("Joseph@Tribbiani.com");
		santaSuspects.addSuspect("Ted@Mosby.com");
		santaSuspects.addSuspect("Robin@Schebaski.com");
		santaSuspects.addSuspect("blab@blab.com");
		
		System.out.println("Provide a name to search for:");
		Scanner scanner = new Scanner(System.in);
		String searchFor=scanner.nextLine();
		
		boolean foundMatch = santaSuspects.foundMatch(searchFor);
		if (foundMatch) {
			System.out.println(searchFor + " is indeed a santa suspect");
		}
		else {
			System.out.println(searchFor + " is not a santa suspect");
			
		}
		
		//santaSuspects.printSuspects();
	}

}
