package classes.intfc;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Shop sh = new Shop();
		Scanner sc = new Scanner(System.in);
		String tempName, tempId, tempType;
		double tempCost, tempCash;
		int op;
		
		do {
			System.out.println("1 - Cadastrar usuário");
			System.out.println("2 - Cadastrar jogo");
			System.out.println("3 - Vender jogo");
			System.out.println("4 - Inserir créditos");
			System.out.println("5 - Imprimir informações");
			System.out.println("6 - Registrar jogada");
			System.out.println("0 - Sair");
			
			op = sc.nextInt();
			
			switch(op){
				case 1:
					System.out.println("Digite o nome do usuário: ");
					tempName = sc.next();
					sc.nextLine();
					System.out.println("Digite o id do usuário: ");
					tempId = sc.next();
					sc.nextLine();
					System.out.println("Digite o tipo (Noob ou Veteran): ");
					tempType = sc.next();
					sc.nextLine();
					
					try {
						sh.addUser(tempName, tempId, tempType);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					break;
					
				case 2:
					System.out.println("Digite o nome do jogo: ");
					tempName = sc.next();
					sc.nextLine();
					System.out.println("Digite o custo do jogo: ");
					tempCost = sc.nextDouble();
					sc.nextLine();
					System.out.println("Digite o tipo (RPG, Luta ou Plataforma): ");
					tempType = sc.next();
					sc.nextLine();
					
					try {
						sh.addGame(tempName, tempCost, tempType);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					break;
					
				case 3:
					System.out.println("Digite o id do usuário: ");
					tempId = sc.next();
					sc.nextLine();
					System.out.println("Digite o nome do jogo: ");
					tempName = sc.next();
					sc.nextLine();
					
					try {
						sh.sellGame(tempId, tempName);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					break;
					
				case 4:
					System.out.println("Digite o id do usuário");
					tempId = sc.next();
					sc.nextLine();
					System.out.println("Digite a quantidade de créditos a serem adicionados: ");
					tempCash = sc.nextDouble();
					sc.nextLine();
					
					try {
						sh.addCashToUser(tempId, tempCash);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					break;
					
				case 5:
					System.out.println("Imprimir informações");
					break;
					
				case 6:
					System.out.println("Registrar jogada");
					break;
					
				case 0:
					System.out.println("Até logo");
					break;
					
				default:
					System.out.println("Opção inválida");
					break;
			}
			
		} while(op != 0);
		
		sc.close();
	}
}
