package pessoa;
public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("122121212","Vinicius");
		
		//definimos o endereço de marcos
		marcos.setEndereco("RUA DAS MARIAS");
		
		//e como definir o nome e cpf do marcos ?
		
		//imprimindo o marcos sem o nome e cpf
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}

