import java.util.ArrayList;
import java.util.Date;

public class Agenda {
		
	private ArrayList<Pessoa> agenda;
	private int tamanho;
	
	public Agenda(){
		this.agenda = new ArrayList<Pessoa>();
		this.tamanho = this.agenda == null ? 0 : this.agenda.size();
	}

	public void armazenaPessoa(Pessoa p){
		
		if(tamanho < 10){
			this.agenda.add(p);
			tamanho++;
		}
		else {
			System.out.println("Limite excedido");
			return;
		}	
	}
	
	public void removePessoa(String nome){
		if(tamanho > 0){
			int index = buscaPessoa(nome);
			this.agenda.remove(this.agenda.get(index));
			this.tamanho--;
		}
		else {
			System.out.println("Nenhuma pessoa na agenda");
			return;
		}
	}
	
	public int buscaPessoa(String nome){
		
		for(Pessoa pessoa : agenda){
			if(pessoa.getNome() == nome){
				return agenda.indexOf(pessoa);
			}
		}
		System.out.println("Pessoa não encontrada na agenda");
		return -1;//nenhum objeto encontrado
	}
	
	public void buscaPessoaByIdentificador(String CPF_CNPJ){

		for(Pessoa pessoa : agenda){
			if(pessoa instanceof PessoaFisica && pessoa.getCpf() == CPF_CNPJ){
				System.out.println("A pessoa de CPF: " + CPF_CNPJ + " está no indice: " + agenda.indexOf(pessoa));
			}
			else if(pessoa instanceof PessoaJuridica && pessoa.getCnpj() == CPF_CNPJ){
				System.out.println("A pessoa de CNPJ: " + CPF_CNPJ + " está no indice: " + agenda.indexOf(pessoa));
			}
		}
	}
	
	public void buscaPessoaByTipo(char F_J){
		for(Pessoa pessoa : agenda){
			if(pessoa instanceof PessoaFisica && F_J == 'F'){
				System.out.println("Pessoa Física: " + pessoa);	
			}
			else if(pessoa instanceof PessoaJuridica && F_J == 'J'){
				System.out.println("Pessoa Jurídica: " + pessoa);
			}
		}
		
	}
	
	public void imprimePessoaByData(Date diaCadastro){
		for(Pessoa pessoa : agenda){
			if(pessoa.getDiaCadastro() == diaCadastro){
				System.out.println(pessoa);
			}
		}
		
	}
	
	public void imprimePessoa(int index){
		for(Pessoa pessoa : agenda){
			if(agenda.indexOf(pessoa) == index){
				System.out.println("Posição: " + index + " -> " + pessoa);
			}
		}
	}
	
	public void imprimeAgenda(){
		int i = 0;
		while(i < tamanho){
			System.out.println(agenda.get(i).toString());
			i++;
		}
	}

}
