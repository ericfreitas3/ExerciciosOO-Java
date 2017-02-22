
public class Aplicacao {

	public static void main(String[] args) {
		Elevador elevador = Elevador.Inicializa();
		
		elevador.Entra(1);
		elevador.Entra(2);
		elevador.Entra(1);
		elevador.Entra(2);
		elevador.Entra(1);
		elevador.Entra(1);
		elevador.Entra(1);
		elevador.Entra(1);
		elevador.Entra(1);
		elevador.Entra(1);
		elevador.Entra(2);// n acrescenta +
		
		elevador.Sai(1);
		elevador.Sai(2);
		elevador.Sai(3);
		elevador.Sai(1);
		elevador.Sai(3);
		elevador.Sai(4);
		elevador.Sai(5);
		elevador.Sai(4);
		elevador.Sai(3);
		elevador.Sai(2);
		elevador.Sai(4);
		elevador.Sai(0);// n remove +
		
		elevador.Sobe(elevador.getAndarAtual());
		elevador.Sobe(elevador.getAndarAtual());
		elevador.Sobe(elevador.getAndarAtual());
		elevador.Sobe(elevador.getAndarAtual());
		elevador.Sobe(elevador.getAndarAtual());
		elevador.Sobe(elevador.getAndarAtual());// n sobe +
		
		elevador.Desce(elevador.getAndarAtual());
		elevador.Desce(elevador.getAndarAtual());
		elevador.Desce(elevador.getAndarAtual());
		elevador.Desce(elevador.getAndarAtual());
		elevador.Desce(elevador.getAndarAtual());
		elevador.Desce(elevador.getAndarAtual()); // n desce +
		
	}

}
