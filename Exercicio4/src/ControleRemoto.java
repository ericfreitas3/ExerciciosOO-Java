
public abstract class ControleRemoto {
	
	public abstract void volume(char c);
	public abstract void canal(char c);
	public abstract void setCanal(int canal);
	public void info(int canal, int volume){
		System.out.println("Canal: " + canal + "\nVolume: " + volume + "\n");
	}
}
