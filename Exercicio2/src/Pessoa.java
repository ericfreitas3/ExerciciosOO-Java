import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
	
	
	private String nome;
	private String telefone;
	private Date diaCadastro;
	private String cpf;
	private String cnpj;
	
	public Pessoa(String nome, String telefone, Date diaCadastro) {
		
		this.nome = nome;
		this.telefone = telefone;
		this.diaCadastro = diaCadastro;
	}
	
	public String getCpf(){
		
		return cpf;	
	}
	
	public String getCnpj(){
		
		return cnpj;	
	}
	
	public String getNome() {
		
		return nome;
	}
	
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	
	public String getTelefone() {
		
		return telefone;
	}
	
	
	public void setTelefone(String telefone) {
		
		this.telefone = telefone;
	}
	
	
	public Date getDiaCadastro() {
		
		return diaCadastro;
	}
	
	
	public void setDiaCadastro(Date diaCadastro) {
		
		this.diaCadastro = diaCadastro;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		return "Pessoa [nome=" + nome + ", telefone=" + telefone + ", diaCadastro=" + sdf.format(diaCadastro) + "]";
	}	
}
