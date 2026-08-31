package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int capacidade = 3;
		String [] nomes = new String[capacidade];
        String [] celulares = new String[capacidade];
        String [] emails = new String[capacidade];
        int quantidade = 0;
        
        boolean continuar = true;
		
		System.out.println("==========================");
        System.out.println("     AGENDA DE CONTATOS    ");
        System.out.println("          v0.0.0           ");
        System.out.println("==========================");

        //System.out.println("Bem-vindo!");
        
        while (continuar) {
        	System.out.println();
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contato");
            System.out.println("3 - Procurar contato");
            System.out.println("4 - Excluir contato");
            System.out.println("5 - Sair");
            System.out.println();

            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();
            
            switch (opcao) {
    	        case 1:
    	        	System.out.println("\n--- ADICIONAR CONTATO ---");

                    System.out.print("Nome: ");
                    nomes[quantidade] = sc.nextLine();

                    System.out.print("Celular: ");
                    celulares[quantidade] = sc.nextLine();

                    System.out.print("E-mail: ");
                    emails[quantidade] = sc.nextLine();

                    quantidade ++;
                    
                    System.out.println("Contato salvo com sucesso!");
                    break;
    	        case 2:
    	        	System.out.println("\n--- LISTAR CONTATO ---");

                    if (quantidade == 0) {

                        System.out.println("Nenhum contato cadastrado.");

                    } else {

                        for(int i = 0; i < quantidade; i ++) {
                        	System.out.println("\nContato " + (i + 1));
                        	System.out.println("Nome: " + nomes[i]);
                        	System.out.println("Celular: " + celulares[i]);
                        	System.out.println("E-mails " + emails[i]);
                        }
                    }
                    break;
    	        case 3:
    	        	System.out.println("\n--- PROCURAR CONTATO ---");

    	            if (nomes[quantidade].isEmpty()) {

    	                System.out.println("Nenhum contato cadastrado.");

    	            } else {

    	                System.out.print("Digite o nome que deseja procurar: ");
    	                String nomeBusca = sc.nextLine();

    	                if (nomes[quantidade].equalsIgnoreCase(nomeBusca)) {

    	                    System.out.println("Contato encontrado!");
    	                    System.out.println("Nome: " + nomes);
    	                    System.out.println("Celular: " + celulares);
    	                    System.out.println("E-mail: " + emails);

    	                } else {

    	                    System.out.println("Contato não encontrado.");
    	                }
    	            }

    	            break;
    	        case 4:
    	        	System.out.println("\n--- EXCLUIR CONTATO ---");

                    if (nomes[quantidade].isEmpty()) {

                        System.out.println("Nenhum contato cadastrado.");

                    } else {

                        String nomes = "";
                        String celulares = "";
                        String emails = "";

                        System.out.println("Contato excluído com sucesso!");
                    }
                    break;

    	        case 5:
    	        	System.out.println("Saindo...");
                    continuar = false;
                    break;
    	        default:
    	            System.out.println("Opção inválida!");
    	    }
        }
        

	}

}