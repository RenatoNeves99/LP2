import java.util.Scanner;
public class CadastroPaciente {
	public static void main(String[] args) {
		Paciente[] tabela = new Paciente[50];
		int valor = 0;
		String name;
		int cpf;
		String phone;
		for(int i = 0; i < 50; i++) {
			tabela[i] = new Paciente();
		}
		int j = 0;
		while(j < 50) {
			System.out.print("Codigo: ");
			Scanner sc = new Scanner(System.in);
			valor = sc.nextInt();
			if (valor < 0) {
				break;
			}
			tabela[j].setCodigo(valor);
			System.out.println("CPF: ");
			cpf = sc.nextInt();
			tabela[j].setCpf(cpf);
			System.out.println("Nome: ");
			name = sc.nextLine();
			tabela[j].setNome(name);
			System.out.println("Telefone: ");
			phone = sc.nextLine();
			tabela[j].setTelefone(phone);
			j++;
		}
		j = 0;
		while(j < 50) {
			System.out.print("Codigo: ");
			Scanner sc = new Scanner(System.in);
			valor = sc.nextInt();
			if(tabela[j].getCodigo() == valor) {
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
}
