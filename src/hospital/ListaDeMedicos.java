package hospital;

import java.util.ArrayList;

public class ListaDeMedicos {
	private ArrayList<Medico> lista = new ArrayList<Medico>();
	
	public void cadastrar(Medico medico) {
		if(medico != null) {
			lista.add(medico);
		}
	}
	
	public void remover(Medico medico) {
		lista.removeIf((elemento)->elemento.getNomeCompleto().equalsIgnoreCase(medico.getNomeCompleto()));			
	}
	
	public Medico buscar(Medico medico) {
		for(Medico elemento : lista) {
			if(elemento.getNomeCompleto().equalsIgnoreCase(medico.getNomeCompleto())) {
				return elemento;
			}
		}
		return null;
	}
	
	public void editar(Medico newMedico) {
		int indice = lista.indexOf(this.buscar(newMedico));
		if(indice != -1) {
			lista.set(indice, newMedico);
		}
	}
	
	public String listar() {
		StringBuilder builder = new StringBuilder();
		for(Medico medico : this.lista) {
			builder.append("Nome Completo do médico(a): "+medico.getNomeCompleto()+"\nCRM do médico: "+medico.getCrm()+"\nTelefone para contato: "+medico.getTelefone()+"\n\n");
		}
		return builder.toString();
	}
}
