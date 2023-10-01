package Projeto;
import java.util.Date;

public class Pessoa {
	
		private String nome;
		private Date dataNascimento;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			nome = nome;
		}
		public Date getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(Date dataNascimento) {
			dataNascimento = dataNascimento;			
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Pessoa [nome=");
			builder.append(nome);
			builder.append(", dataNascimento=");
			builder.append(dataNascimento);
			builder.append("]");
			return builder.toString();
		}		
}

