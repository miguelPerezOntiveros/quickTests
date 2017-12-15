import java.util.Scanner;

public class añosbisiestos {

	public static void main(String[] args) {
		
        System.out.println ("Introduce el año inicial");
        int añoinicial;
        Scanner entradaEscaner = new Scanner (System.in); 
        añoinicial = entradaEscaner.nextInt();
        
        System.out.println ("Introduce el año final");
        int añofinal;
        Scanner entradaEscaner2 = new Scanner (System.in);
        añofinal = entradaEscaner2.nextInt();
        
        if(añoinicial < añofinal){
			System.out.println("Los años bisiestos son: ");
        	 for(int a=0; a<=3000; a+=4) {
        		if(a>=añoinicial && a<=añofinal) {
	        				if(a%400!=0 && a%100==0 && a%4==0);
	        				else
	        						System.out.println("-> "+a+", ");

        		}		
        	}
        	
        }
        else
        	System.out.print("El año de incio es mayor al año final");
		        

	
	}

}