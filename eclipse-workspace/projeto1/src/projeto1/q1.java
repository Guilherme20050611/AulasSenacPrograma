package projeto1;

import java.util.Scanner;

public class q1 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
	System.out.println("O primeiro macaco sorri?");
	String mcc1 = teclado.nextLine();
	System.out.println("O segundo macaco sorri?");
	String mcc2 = teclado.nextLine();
	if(mcc1.equals("sim") || mcc2.equals("sim")) {
		System.out.println("corra");
	}if(mcc1.equals("sim") && mcc2.equals("não")) {
		System.out.println("Esta tudo tranquilo, fique tranquilo");
	}if(mcc1.equals("não") || mcc2.equals("não")){
		System.out.println("corra");
	}else{
		System.out.println("Reinicie o programa e responda com sim ou não");
	}
	}
}
