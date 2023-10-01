package Projeto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
		
		Paciente pac2 = new Paciente();
		pac2.setNome("Robertinho");
		pac2.setCidadeDeMoradia("sssss");
		pac2.setDataNascimento(formatter.parse("2022-12-20"));
		pac2.setPlanodeSaude(false);
		pac2.setPreferencial(false);	
		
		
		Entrada ent = new Entrada(LocalDateTime.now(), pac, true);
		ent.setDataHrFinal(LocalDateTime.now());
		System.out.println(ent);
		
		Atendimento at = new Atendimento(LocalDateTime.now(), pac, m);
		at.setDataHrFinal(LocalDateTime.now());
		System.out.println(at);
		Atendimento at2 = new Atendimento(LocalDateTime.now(), pac, m);
		Atendimento at3 = new Atendimento(LocalDateTime.now(), pac, m);
		at3.setPaciente(pac2);


		List<Atendimento> atendimentos = new ArrayList<>();
		atendimentos.add(at);
		atendimentos.add(at2);
		
		ListaAtendimento listat = new ListaAtendimento();
		listat.setAtendimentos(atendimentos);
		listat.removerAtendimento(at);
		System.out.println(listat.mostrarOrdem());
		System.out.println("=======================");
		listat.adicionarAtendimento(at3, 0);
		System.out.println(listat.mostrarOrdem());
		
		Atestado atest = new Atestado("ablublé",at);
		System.out.println(atest);		
	}
}
