package sicro.cliente;

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
	
	public Proposta(Cliente cliente, float valorEmprestimo, String convenio, int matriculaConvenio) {
		this.cliente = cliente;
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
	public void setValorEmprestimo(float valorEmprestimo) throws Exception {
		if (checkValorEmprestimo (valorEmprestimo)) {
			throw new Exception("Valor de empréstimo maior que o limite");
		}
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
	
	private boolean checkValorEmprestimo (float valor) {
		if (valor > 60000 || valor < 1000) {
			return false;
		}
		
		return true;
	}
}