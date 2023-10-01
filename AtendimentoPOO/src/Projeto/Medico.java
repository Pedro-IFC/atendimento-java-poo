package Projeto;
import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa {
	
	private List<Especialidade> listaEspecialidades = new ArrayList<>();

	public void addListEspecialidades(Especialidade especialidade) {
		this.getListaEspecialidades().add(especialidade);
	}
	
	public List<Especialidade> getListaEspecialidades() {
		return listaEspecialidades;
	}

	public void setListaEspecialidades(List<Especialidade> listaEspecialidades) {
		this.listaEspecialidades = listaEspecialidades;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medico [listaEspecialidades=");
		builder.append(listaEspecialidades);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}	
}
