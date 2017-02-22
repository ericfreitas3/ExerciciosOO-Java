import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aplicacao {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		PessoaFisica p0 = null;
		PessoaJuridica p1 = null;
		PessoaFisica p2 = null;
		PessoaJuridica p3 = null;
		
		Date date = null;
		Date date2 = null;
		try {
			date = sdf.parse("15/02/2017");
			date2 = sdf.parse("18/02/2017");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		p0 = new PessoaFisica("Eric","88651785",date,"321456789");
		p1 = new PessoaJuridica("Berg","88651785",date,"321456783");
		p2 = new PessoaFisica("Pablo","88651785",date2,"321456389");
		p3 = new PessoaJuridica("Daniel","88651785",date,"3214561239");
		//System.out.println(p);
		
		agenda.armazenaPessoa(p0);
		agenda.armazenaPessoa(p1);
		agenda.armazenaPessoa(p2);
		agenda.armazenaPessoa(p3);
		int a = agenda.buscaPessoa("zulu");
		System.out.println(a);
		agenda.imprimeAgenda();
		agenda.buscaPessoaByIdentificador("321456783");
		agenda.buscaPessoaByTipo('F');
		agenda.buscaPessoaByTipo('J');
		agenda.imprimePessoaByData(date);
		agenda.imprimePessoa(2);
		agenda.removePessoa("Daniel");
		agenda.imprimeAgenda();
		

	}

}
