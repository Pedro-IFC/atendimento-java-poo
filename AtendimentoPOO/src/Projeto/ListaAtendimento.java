package Projeto;

import java.util.ArrayList;
import java.util.List;

public class ListaAtendimento {
	
	private List<Atendimento> atendimentos = new ArrayList<>();

	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(List<Atendimento> atendimentos) {
		this.atendimentos = atendimentos;
	}
	
	public void adicionarAtendimento(Atendimento atendimento, int prioridade) {
		List<Atendimento> atendimentos_new = new ArrayList<>();
	    for (int i =0; i< this.atendimentos.size(); i++) {
    	  atendimentos_new.add(atendimentos.get(i));
	      if(i==prioridade) {
	    	  atendimentos_new.add(atendimento);
	      }
	    }
	    this.setAtendimentos(atendimentos_new);
	}
	
	public void removerAtendimento(Atendimento atendimento) {
		int removedId=-1;
	    for (int i =0; i< this.atendimentos.size(); i++) {
	      if(this.atendimentos.get(i)==atendimento) {
	    	  this.atendimentos.remove(i);
	    	  removedId=i;
	      }
	    }
	    if(removedId>=0) {
	    	for (int i =removedId; i< this.atendimentos.size(); i++) {
	    		if(this.atendimentos.size()> i+1) {
	    			this.atendimentos.set(i, this.atendimentos.get(i+1));
	    		}
	  	    }	
	    }
	}
	public String mostrarOrdem() {
		StringBuilder builder = new StringBuilder();
	    for (int i =0; i< this.atendimentos.size(); i++) {
			builder.append("Atendimento prioridade: ");
			builder.append(i);
			builder.append("\nMédico responsável: ");
			builder.append(atendimentos.get(i).getMedico().getNome());
			builder.append("Paciente: ");
			builder.append(atendimentos.get(i).getPaciente().getNome());
			builder.append("\n");
	    }
		return builder.toString();
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListaAtendimento [atendimento=");
		builder.append(atendimentos);
		builder.append("]");
		return builder.toString();
	}	
}
