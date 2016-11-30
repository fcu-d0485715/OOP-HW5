package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM {

	public static void fight(Pokemon p1,Pokemon p2){
		
		Random num = new Random();
		int Win = num.nextInt(2);
		
		if(Win == 0){
			System.out.println("\"Winner is ["+p1.GetterName()+"].\"");
				p1.SetterCP(p1.GetterCP()+500);
			}
		
		else{
			System.out.println("\"Winner is ["+p2.GetterName()+"].\"");
				p2.SetterCP(p2.GetterCP()+500);
		}
	}
}
