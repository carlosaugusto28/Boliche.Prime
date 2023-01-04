package ProvaPoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BolichePrime {

public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in); 

		
		List<String> lista = new ArrayList<>(List.of("Taxa de serviço")); //lista de nomes
		List<Double> listaPreco = new ArrayList<>();//lista de preços
		listaPreco.add(5.0);//taxa de serviço
		
		double soma = listaPreco.get(0);
		
		Entretenimento Pista = new Entretenimento();
		
		Pista.setNome("Pista Executiva");
		Pista.setPreço(80.00);
		Pista.setId(0);

		Entretenimento Pista2 = new Entretenimento();
		
		Pista2.setNome("Pista Kids");
		Pista2.setPreço(30.00);
		Pista2.setId(1);
		
		Entretenimento Pista3 = new Entretenimento();
		
		Pista3.setNome("Pista Confra");
		Pista3.setPreço(50.00);
		Pista3.setId(2);
	
		Alimento Coxinha = new Alimento();
		
		Coxinha.setNome("Coxinha");
		Coxinha.setPreço(5.00);
		Coxinha.setQntd(3);
		
		Alimento Pizza = new Alimento();
		
		Pizza.setNome("Pizza");
		Pizza.setPreço(30.00);
		Pizza.setQntd(5);
		
		Alimento Lasanha = new Alimento();
		
		Lasanha.setNome("Lasanha");
		Lasanha.setPreço(50.00);
		Lasanha.setQntd(2);
	
		Alimento Lagosta = new Alimento();
		
		Lagosta.setNome("Lagosta");
		Lagosta.setPreço(100.00);
		Lagosta.setQntd(2);
		
		Alimento CocaCola = new Alimento();
		
		CocaCola.setNome("Coca-Cola");
		CocaCola.setPreço(6.00);
		CocaCola.setQntd(7);
		
		Alimento Agua = new Alimento();
	
		Agua.setNome("Agua");
		Agua.setPreço(3.00);
		Agua.setQntd(10);
		
		Alimento Suco = new Alimento();
		
		Suco.setNome("Suco");
		Suco.setPreço(4.00);
		Suco.setQntd(7);
		
		Alimento Whisky = new Alimento();
		
		Whisky.setNome("Whisky Escocês (Shot)");
		Whisky.setPreço(120.00);
		Whisky.setQntd(3);
		
		
		
		System.out.println("Bem vindo ao Boliche prime,nós somos uma empresa focada \nna sua diversão e alegria então? vamos continuar? ");
		System.out.println("[1] Sim\n[2] Não ");
		int ResEntrada = entrada.nextInt();
		
		if(ResEntrada==1) {
			String Nome;
			System.out.println("Qual o seu nome?");
			Nome=entrada.next();
		
			System.out.println("Bem vindo " + Nome + " Qual pista você deseja?");
			
			System.out.println("[1] " + Pista.getNome() + " valor por hr: " + Pista.getPreço()+ "\n" +
					"[2] " + Pista2.getNome() + " valor por hr: " + Pista2.getPreço() + "\n" +
					"[3] " + Pista3.getNome() + " valor por hr: " + Pista3.getPreço()+ "\n") ;
			
			int ResPista = entrada.nextInt();
			while(ResPista<1 || ResPista >3) {
				System.out.println("Numero invalido, tente novamente!");
				System.out.println("Coloque uma opção valida");
				System.out.println("[1] " + Pista.getNome() + " valor por hr: " + Pista.getPreço()+ "\n" +
								"[2] " + Pista2.getNome() + " valor por hr: " + Pista2.getPreço() + "\n" +
								"[3] " + Pista3.getNome() + " valor por hr: " + Pista3.getPreço()+ "\n") ;
				ResPista = entrada.nextInt();
				
			}
			
			switch (ResPista) {
			case 1-> {
				lista.add("Pista Executiva");
				listaPreco.add(80.00);
				soma+=80.00;
			}case 2->{
				
				lista.add("Pista Kids");
				listaPreco.add(30.00);
				soma+=30.00;
			}case 3 ->{
				
				lista.add("Pisca Confra");
				listaPreco.add(50.00);
				soma+=50.00;
			
			
			}
			}
			
			//ALIMENTO
			//Pistas normais
			if(ResPista == 2 || ResPista == 3) {
				System.out.println("Perfeito! , escolha o cardapio!");
				
				System.out.println("[1] " + Coxinha.getNome() + " valor: " + Coxinha.getPreço() + "\n" +
								"[2] " + Lasanha.getNome() + " valor: " + Lasanha.getPreço() + "\n" + 
								"[3] " + Pizza.getNome() + " valor: " + Lasanha.getPreço()+ "\n" + 
								"[4] " + "CANCELAR" );		
				 int ResAlimento = entrada.nextInt();
				
					
				while (ResAlimento <= 0 || ResAlimento >= 5){
					
					System.out.println("Número invalido, tente novamente!");
					System.out.println("Coloque uma opção valida! ");
					System.out.println("[1] " + Coxinha.getNome() + " valor: " + Coxinha.getPreço() + "\n" +
							"[2] " + Lasanha.getNome() + " valor: " + Lasanha.getPreço() + "\n" + 
							"[3] " + Pizza.getNome() + " valor: " + Pizza.getPreço()+ "\n" + 
							"[4] " + "CANCELAR");
					 ResAlimento = entrada.nextInt();
				}
				switch (ResAlimento) {
				case 1-> {
					lista.add("Coxinha");
					listaPreco.add(5.00);
					soma+=5.00;
				}case 2->{
					
					lista.add("Lasanha");
					listaPreco.add(30.00);
					soma+=50.00;
				}case 3 ->{
					
					lista.add("Pizza");
					listaPreco.add(30.00);
					soma+=50.00;
				}case 4 ->{
					
					lista.add ("NADA");
					listaPreco.add(0.00);
					soma+=0.00;
				}
				}
			
			 for (int x = 0 ; x>0 || x<3; ) {
				 System.out.println("Deseja pedir mais alguma coisa?");
				 System.out.println("[1] " + Coxinha.getNome() + " valor: " + Coxinha.getPreço() + "\n" +
							"[2] " + Lasanha.getNome() + " valor: " + Lasanha.getPreço() + "\n" + 
							"[3] " + Pizza.getNome() + " valor: " + Pizza.getPreço()+ "\n" + 
							"[4] " + "CANCELAR" );		
				 break;
			 }
			 int ResAlimento2 = entrada.nextInt();
				 while(ResAlimento2 <= 0 || ResAlimento2 >=5) {

						System.out.println("Número invalido, tente novamente!");
						System.out.println("Coloque uma opção valida! ");
						System.out.println("[1] " + Coxinha.getNome() + " valor: " + Coxinha.getPreço() + "\n" +
								"[2] " + Lasanha.getNome() + " valor: " + Lasanha.getPreço() + "\n" + 
								"[3] " + Pizza.getNome() + " valor: " + Pizza.getPreço()+ "\n" + 
								"[4] " + "CANCELAR");
						 ResAlimento2 = entrada.nextInt();
					}
				 switch (ResAlimento2) {
					case 1-> {
						lista.add("Coxinha");
						listaPreco.add(5.00);
						soma+=5.00;
					}case 2->{
						
						lista.add("Lasanha");
						listaPreco.add(30.00);
						soma+=50.00;
					}case 3 ->{
						
						lista.add("Pizza");
						listaPreco.add(30.00);
						soma+=50.00;
					}case 4 ->{
						
						lista.add ("NADA");
						listaPreco.add(0.00);
						soma+=0.00;
					}
					}
					 
				//Pista executiva  
			}else if (ResPista == 1) {
				System.out.println("Otima escolha!, agora vamos ao cardapio!");
				System.out.println("[1] " + Coxinha.getNome() + " valor: " + Coxinha.getPreço() + "\n" +
						"[2] " + Lasanha.getNome() + " valor: " + Lasanha.getPreço() + "\n" + 
						"[3] " + Pizza.getNome() + " valor: " + Pizza.getPreço()+ "\n" + 
						"[4] " + Lagosta.getNome() + " valor: " + Lagosta.getPreço() + "\n" + 
						"[5] " + "CANCELAR");	
				int ResAlimento = entrada.nextInt();
				
				while (ResAlimento <= 0 || ResAlimento >= 6){
					
					System.out.println("Número invalido, tente novamente!");
					System.out.println("Coloque uma opção valida! ");
					System.out.println("[1] " + Coxinha.getNome() + " valor: " + Coxinha.getPreço() + "\n" +
							"[2] " + Lasanha.getNome() + " valor: " + Lasanha.getPreço() + "\n" + 
							"[3] " + Pizza.getNome() + " valor: " + Pizza.getPreço()+ "\n" + 
							"[4] " + Lagosta.getNome() + " valor: " + Lagosta.getPreço() + "\n" + 
							"[5] " + "CANCELAR");
					 ResAlimento = entrada.nextInt();
				}
				switch (ResAlimento) {
				case 1-> {
					lista.add("Coxinha");
					listaPreco.add(5.00);
					soma+=5.00;
				}case 2->{
					
					lista.add("Lasanha");
					listaPreco.add(30.00);
					soma+=50.00;
				}case 3 ->{
					
					lista.add("Pizza");
					listaPreco.add(30.00);
					soma+=50.00;
				}case 4 ->{
					
					lista.add ("Lagosta");
					listaPreco.add(100.00);
					soma+=100.00;
				}case 5 ->{
					
					lista.add("NADA");
					listaPreco.add(0.00);
					soma+= 0.00;
					
				}
				}
				 for (int x = 0 ; x>0 || x<5; ) {
					 System.out.println("Deseja pedir mais alguma coisa?");
					 System.out.println("[1] " + Coxinha.getNome() + " valor: " + Coxinha.getPreço() + "\n" +
								"[2] " + Lasanha.getNome() + " valor: " + Lasanha.getPreço() + "\n" + 
								"[3] " + Pizza.getNome() + " valor: " + Pizza.getPreço()+ "\n" + 
								"[4] " + Lagosta.getNome() + " valor: " + Lagosta.getPreço() + "\n" + 
								"[5] " + "CANCELAR");	
					 break;
				} 
				 int ResAlimento2 = entrada.nextInt();
				
				 while (ResAlimento2 <= 0 || ResAlimento2 >= 6  ) {
					 System.out.println("Número invalido, tente novamente!");
						System.out.println("Coloque uma opção valida! ");
						System.out.println("[1] " + Coxinha.getNome() + " valor: " + Coxinha.getPreço() + "\n" +
								"[2] " + Lasanha.getNome() + " valor: " + Lasanha.getPreço() + "\n" + 
								"[3] " + Pizza.getNome() + " valor: " + Pizza.getPreço()+ "\n" + 
								"[4] " + Lagosta.getNome() + " valor: " + Lagosta.getPreço() + "\n" + 
								"[5] " + "CANCELAR");
						ResAlimento2 = entrada.nextInt();
					 
				 }
				 switch (ResAlimento2) {
					case 1-> {
						lista.add("Coxinha");
						listaPreco.add(5.00);
						soma+=5.00;
					}case 2->{
						
						lista.add("Lasanha");
						listaPreco.add(30.00);
						soma+=50.00;
					}case 3 ->{
						
						lista.add("Pizza");
						listaPreco.add(30.00);
						soma+=50.00;
					}case 4 ->{
						
						lista.add ("Lagosta");
						listaPreco.add(100.00);
						soma+=100.00;
					}case 5 ->{
						
						lista.add("NADA");
						listaPreco.add(0.00);
						soma+= 0.00;
						
					}
					}
				 }
			
			System.out.println("Otima escolha!\n"
					+ "O que você vai beber?");
			
			//BEBIDA
			//Pista normal
			if(ResPista == 2|| ResPista==3) {
				System.out.println("[1] " + CocaCola.getNome() + " Valor: " + CocaCola.getPreço() + "\n" + 
									"[2] " + Agua.getNome() + " Valor: " +Agua.getPreço()+ "\n" + 
									"[3] " + Suco.getNome() + " Valor: " + Suco.getPreço() + "\n" +
									"[4] " + "CANCELAR");
				int ResBebida = entrada.nextInt();
				
				while ( ResBebida <= 0 || ResBebida >= 5 ) {
					System.out.println("Número invalido!" + "/n" + "Tente novamente");
					System.out.println("[1] " + CocaCola.getNome() + " Valor: " + CocaCola.getPreço() + "\n" + 
							"[2] " + Agua.getNome() + " Valor: " +Agua.getPreço()+ "\n" + 
							"[3] " + Suco.getNome() + " Valor: " + Suco.getPreço() + "\n" +
							"[4] " + "CANCELAR");
					 ResBebida = entrada.nextInt();
					
				}
				switch (ResBebida) {
				case 1-> {
					lista.add("Coca-Cola");
					listaPreco.add(6.00);
					soma+=6.00;
				}case 2->{
					
					lista.add("Agua");
					listaPreco.add(3.00);
					soma+=3.00;
				}case 3 ->{
					
					lista.add("Suco");
					listaPreco.add(4.00);
					soma+=4.00;
				}case 4 ->{
					
					lista.add ("NADA");
					listaPreco.add(0.00);
					soma+=0.00;
					
				}
				}
				for(int x = 0 ; x>0 || x<4;) {
					System.out.println("Deseja pedir outra bebida?");
					System.out.println("[1] " + CocaCola.getNome() + " Valor: " + CocaCola.getPreço() + "\n" + 
							"[2] " + Agua.getNome() + " Valor: " +Agua.getPreço()+ "\n" + 
							"[3] " + Suco.getNome() + " Valor: " + Suco.getPreço() + "\n" +
							"[4] " + "CANCELAR");
					break;
				}
				int ResBebida2 = entrada.nextInt();
				
				while (ResBebida2 <= 0 || ResBebida2 >= 5) {
					System.out.println("Número invalido!" + "/n" + 
				"Tente novamente!");
					System.out.println("[1] " + CocaCola.getNome() + " Valor: " + CocaCola.getPreço() + "\n" + 
							"[2] " + Agua.getNome() + " Valor: " +Agua.getPreço()+ "\n" + 
							"[3] " + Suco.getNome() + " Valor: " + Suco.getPreço() + "\n" +
							"[4] " + "CANCELAR");
					ResBebida2= entrada.nextInt();
				}
				switch (ResBebida2) {
				case 1-> {
					lista.add("Coca-Cola");
					listaPreco.add(6.00);
					soma+=6.00;
				}case 2->{
					
					lista.add("Agua");
					listaPreco.add(3.00);
					soma+=3.00;
				}case 3 ->{
					
					lista.add("Suco");
					listaPreco.add(4.00);
					soma+=4.00;
				}case 4 ->{
					
					lista.add ("NADA");
					listaPreco.add(0.00);
					soma+=0.00;
					
				}
				}
				 //Bebida executiva
			}else if (ResPista ==1 ) {
				System.out.println("[1] " + CocaCola.getNome() + " Valor: " + CocaCola.getPreço() + "\n" + 
						"[2] " + Agua.getNome() + " Valor: " +Agua.getPreço()+ "\n" + 
						"[3] " + Suco.getNome() + " Valor: " + Suco.getPreço()+ "\n" +
						"[4] " + Whisky.getNome() + " Valor: " + Whisky.getPreço()+ "\n" +
						"[5] " + "CANCELAR");
				int ResBebida = entrada.nextInt();
				
				while ( ResBebida <= 0 || ResBebida >= 6) {
					System.out.println("Número invalido!" + "/n" + 
				"Tente novamente!");
					System.out.println("[1] " + CocaCola.getNome() + " Valor: " + CocaCola.getPreço() + "\n" + 
							"[2] " + Agua.getNome() + " Valor: " +Agua.getPreço()+ "\n" + 
							"[3] " + Suco.getNome() + " Valor: " + Suco.getPreço()+ "\n" +
							"[4] " + Whisky.getNome() + " Valor: " + Whisky.getPreço()+ "\n" +
							"[5] " + "CANCELAR");
							ResBebida = entrada.nextInt();
					
				}
				switch (ResBebida) {
				case 1-> {
					lista.add("Coca-Cola");
					listaPreco.add(6.00);
					soma+=6.00;
				}case 2->{
					
					lista.add("Agua");
					listaPreco.add(3.00);
					soma+=3.00;
				}case 3 ->{
					
					lista.add("Suco");
					listaPreco.add(4.00);
					soma+=4.00;
				}case 4 ->{
					
					lista.add ("Whisky Escocês (Shot)");
					listaPreco.add(120.00);
					soma+=120.00;
					
				}case 5 -> {
					
					lista.add("NADA");
					listaPreco.add(0.00);
					soma+= 0.00;
				}
				}
				for(int x =0; x>0||x<5;) {
					System.out.println("Deseja pedir outra bebida?");
					System.out.println("[1] " + CocaCola.getNome() + " Valor: " + CocaCola.getPreço() + "\n" + 
							"[2] " + Agua.getNome() + " Valor: " +Agua.getPreço()+ "\n" + 
							"[3] " + Suco.getNome() + " Valor: " + Suco.getPreço()+ "\n" +
							"[4] " + Whisky.getNome() + " Valor: " + Whisky.getPreço()+ "\n" +
							"[5] " + "CANCELAR");
					break;
				}
				int ResBebida2 = entrada.nextInt();
				
				while(ResBebida2 <=0 || ResBebida2 >= 6) {
					
					System.out.println("Número invalido!" + "/n" + 
					"Tente novamente!");
					System.out.println("[1] " + CocaCola.getNome() + " Valor: " + CocaCola.getPreço() + "\n" + 
							"[2] " + Agua.getNome() + " Valor: " +Agua.getPreço()+ "\n" + 
							"[3] " + Suco.getNome() + " Valor: " + Suco.getPreço()+ "\n" +
							"[4] " + Whisky.getNome() + " Valor: " + Whisky.getPreço()+ "\n" +
							"[5] " + "CANCELAR");
							ResBebida2 = entrada.nextInt();
					
				}
				switch (ResBebida2) {
				case 1-> {
					lista.add("Coca-Cola");
					listaPreco.add(6.00);
					soma+=6.00;
				}case 2->{
					
					lista.add("Agua");
					listaPreco.add(3.00);
					soma+=3.00;
				}case 3 ->{
					
					lista.add("Suco");
					listaPreco.add(4.00);
					soma+=4.00;
				}case 4 ->{
					
					lista.add ("Whisky Escocês (Shot)");
					listaPreco.add(120.00);
					soma+=120.00;
					
				}case 5 -> {
					
					lista.add("NADA");
					listaPreco.add(0.00);
					soma+= 0.00;
				}
				}
			}
			
			//----------------------------------------------------------------------------
			System.out.println("Voce escolheu: "+ lista.get(1));
			System.out.println("Valor:" + listaPreco.get(1));
			System.out.println("----------------------------------------------");
			System.out.println("Para comer voce escolheu: "+lista.get(2));
			System.out.println("Valor: "+ listaPreco.get(2));
			System.out.println("----------------------------------------------");
			System.out.println("Seu segundo pedido foi: "+lista.get(3));
			System.out.println("Valor: "+listaPreco.get(3));
			System.out.println("----------------------------------------------");
			System.out.println("Sua bebida foi: "+lista.get(4));
			System.out.println("Valor: " + listaPreco.get(4));
			System.out.println("----------------------------------------------");			
			System.out.println("Sua segunda bebida foi: " + lista.get(5));
			System.out.println("Valor: " + listaPreco.get(5));
			System.out.println("----------------------------------------------");			
			
			System.out.println("Valor da taxa: "+listaPreco.get(0));
			System.out.println("Valor total: "+soma);
			System.out.println("Obrigado por escolher a gente e até a proxima!!");
			
			
			entrada.close();
			
			}else if (ResEntrada==2) {
				System.out.println("Obrigado pela sua atenção e desculpe não poder te atender ");
			
			}else {
				
				System.out.println("Número invalido, tente novamente");
				
				
			}
		
	}	
				
			
			
			
				
			
	
}

