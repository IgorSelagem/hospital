package hospital;

public class Medico {
	private String crm;
	private String nomeCompleto;
	private String telefone;
	private Endereco endereco;
	
	public Medico(String crm, String nomeCompleto, String telefone) {
		this.crm = crm;
		this.nomeCompleto = nomeCompleto;
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getCrm() {
		return crm;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	@Override
	public String toString() {
		return String.format("CRM: %s\tNome: %s\tTelefone: %s\tEndereço: %s",this.crm,this.nomeCompleto,this.telefone,this.endereco.toString());
	}
}