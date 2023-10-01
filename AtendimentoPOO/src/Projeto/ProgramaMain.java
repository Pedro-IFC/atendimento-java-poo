package Projeto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class ProgramaMain {

	public static void main(String[] args) throws ParseException {
	

		Especialidade esp = new Especialidade("Podologo");	
		System.out.println(esp);
		
		Medico m = new Medico();
		m.setNome("Jaiminho");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		m.setDataNascimento(formatter.parse("1980-12-20"));
		m.addListEspecialidades(esp);
		System.out.println(m);
		
		Paciente pac = new Paciente();
		pac.setNome("Robertinho");
		pac.setCidadeDeMoradia("Sul do Rio");
		pac.setDataNascimento(formatter.parse("1980-12-20"));
		pac.setPlanodeSaude(false);
		pac.setPreferencial(false);	
		System.out.println(pac);
		
		Entrada ent = new Entrada(LocalDateTime.now(), pac, true);
		ent.setDataHrFinal(LocalDateTime.now());
		System.out.println(ent);
		
		Atendimento at = new Atendimento(LocalDateTime.now(), pac, m);
		at.setDataHrFinal(LocalDateTime.now());
		System.out.println(at);
			
		ListaAtendimento listat = new ListaAtendimento();
		listat.setAtendimento(null);
		
		Atestado atest = new Atestado("ablublé",at);
		System.out.println(atest);		
	}
}
