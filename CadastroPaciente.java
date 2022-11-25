import java.util.Scanner;
public class CadastroPaciente {
	public static void main(String[] args) {
		Paciente[] tabela = new Paciente[50];
		int valor = 0;
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
			System.out.print("Nome: ");
			tabela[j].setNome(sc.nextLine());
			System.out.print("\n");
			System.out.println("CPF: ");
			tabela[j].setCpf(sc.nextLine());
			System.out.println("Telefone: ");
			tabela[j].setTelefone(sc.nextLine());
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
