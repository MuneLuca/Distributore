
public class TestInterfaccia implements DistributoreInterface {

	

	public void compare(Distributore a, Distributore b) {
		System.out.println("Comparazione tra " + a.getPropietario() + "e " + b.getPropietario());
		if(a.getPrezzo()<b.getPrezzo()) {
			System.out.println("Ti costa di meno fare benzina nel distributore di " + a.getPropietario());
			
		}else {
			System.out.println("Ti costa di meno fare benzina nel distributore di " + b.getPropietario());
		}
	}
	

	
	
	
	
}
