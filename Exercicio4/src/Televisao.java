
public class Televisao extends ControleRemoto{

	private int volume;
	private int canal;
	
	public Televisao(){
		this.canal = 0;
		this.volume = 10;
	}
	
	public void volume(char c){
		switch (c){
		case '+': 
			this.volume++; 
			break; 
		case '-': 
			if(this.volume > 0)
				this.volume--;
			else
				this.volume = 0;
			break;
		}
		info(this.canal, this.volume);
	}
	
	public void canal(char c){
		switch (c){
			case '+': 
				this.canal++; 
				break; 
			case '-': 
				if(this.canal > 0)
					this.canal--;
				else
					this.canal = 0;
				break;
		}
		info(this.canal, this.volume);
	}

	public int getCanal() {
		return canal;
	}
	

	public int getVolume() {
		return volume;
	}

	public void setCanal(int canal) {
		this.canal = canal;
		info(this.canal, this.volume);
	}
}
