package Projeto;

public class Paciente extends Pessoa {
	
	private boolean planodeSaude;
	private boolean preferencial;
	private String cidadeDeMoradia;
	
	public boolean isPlanodeSaude() {
		return planodeSaude;
	}
	public void setPlanodeSaude(boolean planodeSaude) {
		this.planodeSaude = planodeSaude;
	}
	public boolean isPreferencial() {
		return preferencial;
	}
	public void setPreferencial(boolean preferencial) {
		this.preferencial = preferencial;
	}
	public String getCidadeDeMoradia() {
		return cidadeDeMoradia;
	}
	public void setCidadeDeMoradia(String cidadeDeMoradia) {
		this.cidadeDeMoradia = cidadeDeMoradia;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [planodeSaude=");
		builder.append(planodeSaude);
		builder.append(", preferencial=");
		builder.append(preferencial);
		builder.append(", cidadeDeMoradia=");
		builder.append(cidadeDeMoradia);
		builder.append("]");
		return builder.toString();
	}
}
