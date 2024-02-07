/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.util.Locale;

public class Main
{
	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
	   Scanner sc = new Scanner (System.in);
	

	


	System.out.println("--------- Cardapio --------");
	
System.out.println("Codigo  - Especificação    - Preço ");
System.out.println("   1    - Cachorro-Quente  - R$ 4,00");
System.out.println("   2    - X-Salada         - R$ 4,50");
System.out.println("   3    - X-Bacon          - R$ 5,00");
System.out.println("   4    - Torrada Simples  - R$ 2,00");
System.out.println("   5    - Refrigerante     - R$ 1,00");
	    System.out.println("Digite o codigo do produto desejado ?"); 
	 int codigo = sc.nextInt();
	 
	 System.out.println("Qual a Quantidade desejada?");
	 int quantidade = sc.nextInt();
	
	if (codigo == 1) {
	    double valor =  quantidade * 4.00 ;
	    
	    System.out.printf("Você Comprou " + quantidade + " Cachorros-Quentes O valor Total é R$ %.2f%n !", valor);
	} else if(codigo == 2){
	     
	     double valor =  quantidade * 4.50 ;
	    
	    System.out.printf("Você Comprou " + quantidade + " X-Saladas O valor Total é R$ %.2f%n !", valor);
	}
	else if(codigo == 3){  double valor =  quantidade * 5.00 ;
	    
	    System.out.printf("Você Comprou " + quantidade + " X-Bacons O valor Total é R$ %.2f%n !", valor);}
	else if( codigo == 4){ double valor =  quantidade * 2.00 ;
	    
	    System.out.printf("Você Comprou " + quantidade + " Torradas Simples O valor Total é R$ %.2f%n !", valor);}
	else if(codigo == 5){ double valor =  quantidade * 1.00 ;
	    
	    System.out.printf("Você Comprou " + quantidade + " Refrigerantes O valor Total é R$ %.2f !", valor," %n ");
	    
	}

   
   
    
   

  
}

}