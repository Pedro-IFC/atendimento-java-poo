package Projeto;

public class Especialidade {

	private String area;

	public String getArea() {
		return area;
	}
	public Especialidade(String area) {
		this.setArea(area);
	}

	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Especialidade [area=");
		builder.append(area);
		builder.append("]");
		return builder.toString();
	}
}
