package Projeto;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ProgramaMain {

	public static void main(String[] args) throws ParseException {

		Entrada e = new Entrada();
		
		
		Especialidade esp = new Especialidade("Podologo");		
		
		
		Medico m = new Medico();
		m.setNome("Jaiminho");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		m.setDataNascimento(formatter.parse("1980-12-20"));
		m.addListEspecialidades(esp);
		System.out.println(m);
		
		Paciente pac = new Paciente();
		
		
		Pessoa pes = new Pessoa();
		
		
		
	}

}
