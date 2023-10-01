package Projeto;

import java.util.ArrayList;
import java.util.List;

public class ListaAtendimento {
	
	private List<Atendimento> atendimento = new ArrayList<>();

	public List<Atendimento> getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(List<Atendimento> atendimento) {
		this.atendimento = atendimento;
	}
	
	public void adicionarAtendimento(Atendimento atendimento, int prioridade) {
		
	}
	
	public void removerAtendimento(Atendimento atendimento) {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListaAtendimento [atendimento=");
		builder.append(atendimento);
		builder.append("]");
		return builder.toString();
	}	
}
