package sicro.proposta;

import java.util.Date;

public class Proposta {
	private int id;
	private float valorEmprestimo;
	private String status;
	private Date dataEmissao;
	private String convenio;
	private int matriculaConvenio;
	private Cliente cliente;
	
	public Proposta() {
		// TODO Auto-generated constructor stub
	}
	
	public Proposta(float valorEmprestimo, String convenio, int matriculaConvenio) {
		this.valorEmprestimo = valorEmprestimo;
		this.convenio = convenio;
		this.matriculaConvenio = matriculaConvenio;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getValorEmprestimo() {
		return valorEmprestimo;
	}
	public void setValorEmprestimo(float valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	public int getMatriculaConvenio() {
		return matriculaConvenio;
	}
	public void setMatriculaConvenio(int matriculaConvenio) {
		this.matriculaConvenio = matriculaConvenio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}