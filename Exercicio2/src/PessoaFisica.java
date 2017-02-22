import java.util.Date;

public class PessoaFisica extends Pessoa {


	protected String cpf;
	
	public PessoaFisica(String nome, String telefone, Date diaCadastro, String cpf) {
		super(nome, telefone, diaCadastro);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
}
