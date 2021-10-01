package hospital;

public class Paciente {
	
	private String nomeCompleto;
	private String rg;
	private String cpf;
	private String telefoneContato;
	private Endereco endereco;
	
	public Paciente(String nomeCompleto, String cpf, String rg, String telefoneContato, String endereco) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.telefoneContato = telefoneContato;
	}
	
	public String getTelefone() {
		return telefoneContato;
	}
	public void setTelefone(String telefone) {
		this.telefoneContato = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public String getRg() {
		return rg;
	}
	public String getCpf() {
		return cpf;
	}
	
	@Override
	public String toString() {
		return String.format("Nome completo: %s\nTelefone: %s\nRG: %s\nCPF: %s\n\n",this.nomeCompleto, this.telefoneContato, this.rg, this.cpf.toString());
	}
}
