package sicro.cliente;

import java.util.Date;

/**
 * Classe de modelagem da proposta
 * Ha algumas validacoes de regras juntamente com as definicoes do valores
 * 
 * @author grupo
 */
public class Proposta {
	/**
	 * Id da proposta
	 */
	private int id;
	
	/**
	 * Valor do emprestimo que sera realizado
	 */
	private float valorEmprestimo;
	
	/**
	 * Status da proposta
	 */
	private String status;
	
	/**
	 * Data de emissao da proposta
	 */
	private Date dataEmissao;
	
	/**
	 * Convenio que sera utilizado
	 */
	private String convenio;
	
	/**
	 * Numero da matricula do convenio
	 */
	private int matriculaConvenio;
	
	/**
	 * Cliente que requisitou o emprestimo
	 */
	private Cliente cliente;
	
	/**
	 * Construtor se valores obrigatorios
	 */
	public Proposta() {
	}
	
	/**
	 * Construtor com valores obrigatorios
	 * 
	 * @param cliente
	 * @param valorEmprestimo
	 * @param convenio
	 * @param matriculaConvenio
	 */
	public Proposta(Cliente cliente, float valorEmprestimo, String convenio, int matriculaConvenio) {
		this.cliente = cliente;
		this.valorEmprestimo = valorEmprestimo;
		this.convenio = convenio;
		this.matriculaConvenio = matriculaConvenio;
	}
	
	/**
	 * Retorna ID da proposta
	 * 
	 * @return int
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Define o ID da proposta
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Retorna o valor do emprestimo
	 * 
	 * @return float
	 */
	public float getValorEmprestimo() {
		return valorEmprestimo;
	}
	
	/**
	 * Seta o valor do emprestimo
	 * Se o valor do emprestimo nao estiver de acordo, gera uma Exception
	 * 
	 * @param valorEmprestimo
	 * @throws Exception
	 */
	public void setValorEmprestimo(float valorEmprestimo) throws Exception {
		if (!isValidValorEmprestimo(valorEmprestimo)) {
			throw new Exception("Valor de empréstimo maior que o limite");
		}
		this.valorEmprestimo = valorEmprestimo;
	}
	
	/**
	 * Retorna o status da proposta
	 * 
	 * @return String
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * Define o status da proposta
	 * 
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * Retorna a data da emissao da proposta
	 * 
	 * @return Date
	 */
	public Date getDataEmissao() {
		return dataEmissao;
	}
	
	/**
	 * Define a data da emissao
	 * 
	 * @param dataEmissao
	 */
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	
	/**
	 * Retorna o convenio que sera utilizado
	 * 
	 * @return String
	 */
	public String getConvenio() {
		return convenio;
	}
	
	/**
	 * Define o convenio que sera utilizado
	 * 
	 * @param convenio
	 */
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	
	/**
	 * Retorna a matricula do convenio
	 * 
	 * @return int
	 */
	public int getMatriculaConvenio() {
		return matriculaConvenio;
	}
	
	/**
	 * Define a matricula do convenio
	 * 
	 * @param matriculaConvenio
	 */
	public void setMatriculaConvenio(int matriculaConvenio) {
		this.matriculaConvenio = matriculaConvenio;
	}

	/**
	 * Retorna o cliente da proposta
	 * 
	 * @return Cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * Define o cliente da proposta
	 * 
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	/**
	 * Valida se o valor do emprestimo esta no intervalo entre 6000 e 1000 para poder ser liberado
	 * 
	 * @param valor
	 * @return boolean
	 */
	private boolean isValidValorEmprestimo (float valor) {
		if (valor >= 60000 || valor <= 1000) {
			return false;
		}
		
		return true;
	}
}