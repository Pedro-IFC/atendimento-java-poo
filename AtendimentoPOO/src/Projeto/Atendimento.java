package Projeto;
import java.time.LocalDateTime;

public class Atendimento {
	
	private LocalDateTime dataHrInicio;
	private LocalDateTime dataHrFinal;
	private Paciente paciente;
	private Medico medico;
	
	public Atendimento(LocalDateTime dataHrInicio, Paciente paciente, Medico medico) {
		this.setDataHrInicio(dataHrInicio);
		this.setMedico(medico);
		this.setPaciente(paciente);
	}
	
	public LocalDateTime getDataHrInicio() {
		return dataHrInicio;
	}
	public void setDataHrInicio(LocalDateTime dataHrInicio) {
		this.dataHrInicio = dataHrInicio;
	}
	public LocalDateTime getDataHrFinal() {
		return dataHrFinal;
	}
	public void setDataHrFinal(LocalDateTime dataHrFinal) {
		this.dataHrFinal = dataHrFinal;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atendimento [dataHrInicio=");
		builder.append(dataHrInicio);
		builder.append(", dataHrFinal=");
		builder.append(dataHrFinal);
		builder.append(", paciente=");
		builder.append(paciente);
		builder.append(", medico=");
		builder.append(medico);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
