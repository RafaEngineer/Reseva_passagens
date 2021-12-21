package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;


import models.Passageiro;
import models.Voo;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    
	      Voo voo = new Voo();
	      Passageiro pa;
	        pa = new Passageiro();

	      //List<Voo> v = new ArrayList<Voo>();

	       int opcao = 0;
	    do {
	        System.out.println("====Menu do sistema====");
	        System.out.println("1) Parametros do sistema");
	        System.out.println("2) Reserva de Passagens");
	        System.out.println("3) Sair");
	        System.out.println("Insira numero de registros");
	        int n = Integer.parseInt(sc.nextLine());
	        
	        try
	        {
	          opcao = sc.nextInt();
	            switch (opcao) { 
	                case 1: 
	                sc.nextLine();
	                for(int i=0; i<n; i++) {
	                	List<Voo> v = new ArrayList<Voo>();
	                System.out.println("Informe A Aeronave\n"); 
	                String aeronave = sc.nextLine();
	                
	                System.out.println("Informe o Data"); 
	                String data = sc.nextLine();
	                
	                System.out.println("Informe a Hora: "); 
	                String hora = sc.nextLine();
	                      
	                System.out.println("Informe o numero"); 
	                int nro = sc.nextInt();               
	            
	                break;
	                }
	                
	            case 2:
	            	sc.nextLine();
	                System.out.println("Informe o Nome\n"); 
	                String nome = sc.nextLine();
	                
	                System.out.println("Informe o CPF"); 
	                String cpf = sc.nextLine();
	                
	                pa = new Passageiro();
	                pa.setNome(nome);
	                pa.setCpf(cpf);
	                String Nome = pa.getNome();
	                String Cpf = pa.getCpf();
	                Optional<Passageiro> CC1 = Optional.ofNullable(pa);
	                if ( Optional.empty() != null ) {

	                    System.out.println("Cliente inserido!");
	                    System.out.println("Nome:" + pa.getNome());
	                    System.out.println("Cpf:" + pa.getCpf());
	                } else {
	                 
	                    System.out.println("Cliente inserido!");
	                }              
	                 break;
	            }
	            }
	        catch(Exception e){
	        	System.out.println("Ocorreu uma exceção ao executar o método"+e);
	        	break;
	        }

	    }while (opcao != 3); 
	    sc.close();
	}
}
