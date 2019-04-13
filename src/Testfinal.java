import java.util.Scanner;

public class Testfinal {

	  public static void main(String[] args){
		  Scanner in = new Scanner(System.in);
		  TestInterfaccia test= new TestInterfaccia();
		  
		  int benzina;
		  System.out.println("Quanto vuoi erogare");
		  benzina = in.nextInt();
		  Distributore d1 = new Distributore("TE","Luca",0,benzina,5);
		  Distributore d2= new Distributore("Ip","Claudio",0,benzina,4);
		  
		  d1.erogazione(benzina);
		  d2.erogazione(benzina);
		  
		  test.compare(d1,d2);
		  
		  
		  System.out.println(d1.toString());
		  System.out.println(d2.toString());
		  
		  
		  
	  }
}
