package Projeto;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Entrada {

	private LocalDateTime dataHrInicio;
	private LocalDateTime dataHrFinal;
	private Paciente paciente;
	private boolean samu;
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
	public boolean isSamu() {
		return samu;
	}
	public void setSamu(boolean samu) {
		this.samu = samu;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Entrada [dataHrInicio=");
		builder.append(dataHrInicio);
		builder.append(", dataHrFinal=");
		builder.append(dataHrFinal);
		builder.append(", paciente=");
		builder.append(paciente);
		builder.append(", samu=");
		builder.append(samu);
		builder.append("]");
		return builder.toString();
	}
}
