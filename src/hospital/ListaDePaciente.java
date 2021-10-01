package hospital;

import java.util.ArrayList;

public class ListaDePaciente {
	private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
	
	public void cadastrar(Paciente paciente) {
		if(paciente != null) {
			pacientes.add(paciente);
		}
	}
	
	public void remover(Paciente paciente) {
		pacientes.removeIf(
			(elemento)->elemento.getCpf().equalsIgnoreCase(paciente.getCpf())
		);
	}
	
	public Paciente buscar(Paciente paciente) {
		for(Paciente elemento : this.pacientes) {
			if(elemento.getCpf().equalsIgnoreCase(paciente.getCpf())) {
				return elemento;
			}
		}
		return null;
	}
	
	public void editar(Paciente newPaciente) {
		int indice = pacientes.indexOf(this.buscar(newPaciente));
		if(indice != -1) {
			pacientes.set(indice, newPaciente);
		}
	}
	
	public String listar() {
		StringBuilder builder = new StringBuilder();
		for(Paciente paciente : this.pacientes) {
			builder.append(paciente.toString());
		}
		return builder.toString();
	}
}
