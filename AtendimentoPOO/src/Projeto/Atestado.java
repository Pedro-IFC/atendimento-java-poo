package Projeto;

public class Atestado {
	
	private String texto;
	private Atendimento atendimento;
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Atendimento getAtendimento() {
		return atendimento;
	}
	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}
	
	public Atestado(String texto, Atendimento atendimento) {
		this.setAtendimento(atendimento);
		this.setTexto(texto);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atestado [texto=");
		builder.append(texto);
		builder.append(", atendimento=");
		builder.append(atendimento);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
