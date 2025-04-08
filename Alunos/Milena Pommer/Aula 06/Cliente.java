package atividadeAula06Objetos;

public class Cliente {

	private String nome;
	private int idade;
	private String cidade;
	private String bairro;
	private String rua;
	
	public Cliente(String nome, int idade, String cidade, String bairro, String rua) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
	}
	
	public void apresentarse() {
		
		System.out.println("Nome do Cliente: "+ nome +", idade: "+ idade);
	}
}
