package objetos;

public class pizza {

	public String sabor;
	public String tamanho;
	public pizza(String sabor, String tamanho) {
		
		this.sabor = sabor;
		this.tamanho = tamanho;
	}
	
	
	public String toString() {
		return (" sabor : ") + sabor + (" || tamanho :  ") + tamanho ;
		
	}
}
