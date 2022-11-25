public class Paciente {
	private int codigo;
	private String nome;
	private int cpf;
	private String telefone;
	public Paciente() {
		super();
	}
	public Paciente(int codigo, String nome, int cpf, String telefone) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void Imprime() {
		System.out.println("Codigo: " + this.codigo + "\nNome: " + this.nome + "\nCPF: " + this.cpf + "\nTelefone: " + this.telefone);
	}
	public void Repetida(int codigo) {
		if (codigo == this.codigo) {
			System.out.println("Codigo Igual");
		}
		else {
			System.out.println("Codigo Diferente");
		}
	}
}
