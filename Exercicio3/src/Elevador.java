
public class Elevador {
	
	private int andarAtual;
	public static final int capacidade = 5;
	public static final int totalAndares = 5;
	private int pessoasDentro;
	
	public Elevador(){
		
		this.andarAtual = 0;
		this.pessoasDentro = 0;
		
	}
	
	public int getAndarAtual() {
		return andarAtual;
	}

	
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	
	public int getTotalAndares() {
		return totalAndares;
	}
	

	public int getCapacidade() {
		return capacidade;
	}


	public int getPessoasDentro() {
		return pessoasDentro;
	}


	public void setPessoasDentro(int pessoasDentro) {
		this.pessoasDentro = pessoasDentro;
	}

	//Métodos

	public static Elevador Inicializa(){
		return new Elevador();
	}
	
	public void Entra(int qntdPessoa){
		System.out.println("Quantidade de pessoas dentro antes: " + this.pessoasDentro + "\nCapacidade: " + capacidade);
		if(pessoasDentro == capacidade)
			return;
		else{
			int total = this.pessoasDentro + qntdPessoa;
			if(total <= capacidade){
				this.pessoasDentro = total;
				System.out.println(qntdPessoa + " entraram");
			}else{
				System.out.println(capacidade - this.pessoasDentro + " entraram e " + (total - capacidade) + " ficaram fora");
				this.pessoasDentro = capacidade;
			}
		}	
		System.out.println("Quantidade de pessoas dentro depois: " + this.pessoasDentro + "\nCapacidade: " + capacidade);
	}
	
	public void Sai(int qntdPessoa){
		try { testaValorEntrada(qntdPessoa, 'c'); } catch(IllegalArgumentException e) {e.printStackTrace(); return;}
		System.out.println("Quantidade de pessoas dentro antes: " + this.pessoasDentro + "\nCapacidade: " + capacidade);
		if(this.pessoasDentro <= 0)
			return;
		else
			if(this.pessoasDentro >= qntdPessoa){
				this.pessoasDentro -= qntdPessoa;
				System.out.println(qntdPessoa + " sairam");
			}
			else{ 
				this.pessoasDentro = 0;
				System.out.println("Elevador vazio");
			}
		System.out.println("Quantidade de pessoas dentro: " + this.pessoasDentro + "\nCapacidade: " + capacidade);
	}
	
	public void Sobe(int andarAtual){
		try { testaValorEntrada(andarAtual, 'a'); } catch(IllegalArgumentException e) {e.printStackTrace(); return;}
		if(andarAtual == totalAndares)
			return;
		else
			this.andarAtual++;
		System.out.println("Andar atual: " + this.andarAtual);
	}
	
	public void Desce(int andarAtual){
		try { testaValorEntrada(andarAtual, 'a'); } catch(IllegalArgumentException e) {e.printStackTrace(); return;}
		if(this.andarAtual <= 0)
			return;
		else
			this.andarAtual--;
		System.out.println("Andar atual: " + this.andarAtual);
	}
	
	public void testaValorEntrada(int valorTestado, char tipo) throws IllegalArgumentException{
		switch(tipo){
			case 'c':
				if(valorTestado >= 0 && valorTestado <= capacidade ){
					return;
				}
				break;
			case 'a':
				if(valorTestado >= 0 && valorTestado <= totalAndares ){
					return;
				}
				break;
		}
		throw new IllegalArgumentException("Dados de entrada inválidos");
	}
}
