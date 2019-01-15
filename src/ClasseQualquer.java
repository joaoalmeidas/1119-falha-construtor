
public class ClasseQualquer {
	
	private int numero;
	private String nome;
	
	public ClasseQualquer(int numero, String nome) {
		super();
		
		if(numero <= 0) {
			
			throw new IllegalArgumentException("Numero deve ser > 0");
			
		}
		
		if(nome.equals("")) {
			
			throw new IllegalArgumentException("O nome não pode estar vazio.");
			
		}
		
		this.numero = numero;
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
