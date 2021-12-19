
package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Voo;
import model.Passageiro;


public class main {
    
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
    
      Voo voo = new Voo();
      Passageiro pa = new Passageiro();

      List<Voo> v = new ArrayList<Voo>();

 
    do {
        System.out.println("====Menu do sistema====");
        System.out.println("1) Parametros do sistema");
        System.out.println("2) Reserva de Passagens");
        System.out.println("3) Sair");
        
          int opcao = sc.nextInt();
            switch (opcao) { 
                case 1: 
                System.out.println("Informe A Aeronave"); 
                String aeronave = sc.nextLine();
                
                System.out.println("Informe o Data"); 
                String data = sc.nextLine();
                
                System.out.println("Informe a Hora: "); 
                String hora = sc.nextLine();
                        
                System.out.println("Informe o numero"); 
                int nro = sc.nextInt();
            //}
            /*    
                c = new Cliente();
            if (c.SetCodigo(codigo) && c.SetNome(nome) && c.SetCpf(cpf)) { clientes.Add(c);
                Console.WriteLine("Cliente inserido!"); codigo++;
 
                }*/
                break;
            case 2:
                System.out.println("Informe o Nome"); 
                String nome = sc.nextLine();
                
                System.out.println("Informe o CPF"); 
                String cpf = sc.nextLine();
                
                p = new Passageiro();
                if ( p.SetNome(nome) && p.SetCpf(cpf)) {
                pa.Add(p);
                }
                System.out.println("Cliente inserido!"); 
                                
                 break;
            
        } 

   }
    
