public class CadastroPaciente {
	Paciente[] tabela = new Paciente[50];
	for(int i = 0; i < 50; i++) {
		tabela[i] = new Paciente();
	}
	int codigo;
	public void cadastro() {
		int j = 0;
		while(j < 50) {
			System.out.println("Codigo: ");
		   	Scanner scanner = new Scanner(System.in);
		   	codigo = scanner.nextInt();
		   	if (codigo < 0) {
		   		break;
		   	}
		   	tabela[j].setCodigo(codigo);
		   	System.out.println("Nome: ");
		   	tabela[j].setNome(scanner.nextLine());
		   	System.out.println("CPF: ");
		   	tabela[j].setCpf(scanner.nextLine());
		   	System.out.println("Telefone: ");
		   	tabela[j].setTelefone(scanner.nextLine());
		   	j++;
		}
	}
	public void Busca(int codigo) {
		int j = 0;
		while(j < 50) {
			if(tabela[j].getCodigo() == codigo) {
				tabela[j].Imprime();
				break;
			}
			else if(j == 49){
				System.out.println("Não encontrado!");
				j++;
			}
			else {
				j++;
			}
		}
	}
	public static void main(String[] args) {
		CadastroPaciente exe.CadastroPaciente();
	}
}
