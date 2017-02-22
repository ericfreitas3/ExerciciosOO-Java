import java.util.Date;

public class PessoaJuridica extends Pessoa{

	protected String cnpj;
	
	public PessoaJuridica(String nome, String telefone, Date diaCadastro, String cnpj) {
		super(nome, telefone, diaCadastro);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	
}
