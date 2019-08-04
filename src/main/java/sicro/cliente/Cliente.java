package sicro.cliente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Classe de modelagem do cliente
 * Ha algumas validacoes de regras juntamente com as definicoes do valores
 * 
 * @author grupo
 */
public class Cliente {
	/**
	 * ID do cliente
	 */
	private int id;
	
	/**
	 * Nome do cliente
	 */
	private String nome;
	
	/**
	 * Sexo do cliente
	 */
	private char sexo;
	
	/**
	 * Data de nascimento do cliente
	 */
	private LocalDate dataNascimento;
	
	/**
	 * CPF do cliente
	 */
	private String cpf;
	
	/**
	 * Nome da mae do cliente
	 */
	private String nomeMae;
	
	/**
	 * E-mail do cliente
	 */
	private String email;
	
	/**
	 * Telefone do cliente
	 */
	private String telefone;
	
	/**
	 * CEP do endereco do cliente
	 */
	private String cep;
	
	/**
	 * Rua do endereco do cliente
	 */
	private String rua;
	
	/**
	 * Numero do endereco do cliente
	 */
	private int numero;
	
	/**
	 * Complemento do endereco do cliente
	 */
	private String complemento;
	
	/**
	 * Propostas de emprestimo que o cliente possui
	 */
	private List<Proposta> propostas;
	
	/**
	 * Construtor com definicao dos valores
	 * 
	 * @param id
	 * @param nome
	 * @param sexo
	 * @param dataNascimento
	 * @param cpf
	 * @param nomeMae
	 * @param email
	 * @param telefone
	 * @param cep
	 * @param rua
	 * @param numero
	 * @param complemento
	 */
	public Cliente(	 int id,
	 String nome,
	 char sexo,
	 LocalDate dataNascimento,
	 String cpf,
	 String nomeMae,
	 String email,
	 String telefone,
	 String cep,
	 String rua,
	 int numero,
	 String complemento) {
		this.id=id;
		this.nome=nome;
		this.sexo=sexo;
		this.dataNascimento=dataNascimento;
		this.cpf=cpf;
		this.nomeMae=nomeMae;
		this.email=email;
		this.telefone=telefone;
		this.cep=cep;
		this.rua=rua;
		this.numero=numero;
		this.complemento=complemento;
		
		this.propostas = new ArrayList<Proposta>();
	}
	
	/**
	 * Construtor definindo o cpf
	 * 
	 * @param cpf
	 */
	public Cliente(String cpf) {
		this.cpf = cpf;
		this.propostas = new ArrayList<Proposta>();
	}
	
	/**
	 * Adiciona uma proposta a lista de proposta dos clientes
	 * Valida se possui 5 proposta e gera uma excecao de limite maximo
	 * 
	 * @param p
	 * @throws Exception
	 */
	public void addProposta(Proposta p) throws Exception {
		if (propostas.size() >= 5) {
			throw new Exception("Cliente atingiu máximo número de propostas");
		}
		
		if (p != null) {
			this.propostas.add(p);
		}
	}
	
	/**
	 * Retorna a lista de propostas do cliente
	 * 
	 * @return List
	 */
	public List<Proposta> getPropostas() {
		return propostas;
	}

	/**
	 * Seta uma lista de propostas
	 * 
	 * @param propostas
	 */
	public void setPropostas(List<Proposta> propostas) {
		this.propostas = propostas;
	}

	/**
	 * Retorna o ID do cliente
	 * 
	 * @return int
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Define o ID do cliente
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Retorna o nome do cliente
	 * 
	 * @return String
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Define o nome do cliente
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Retorna o sexo do cliente
	 * 
	 * @return char
	 */
	public char getSexo() {
		return sexo;
	}
	
	/**
	 * Define o sexo do cliente
	 * 
	 * @param sexo
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	/**
	 * Retorna a data de nascimento do cliente
	 * 
	 * @return LocalDate
	 */
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	/**
	 * Define a data de nascimento do cliente
	 * Valida se a idade do cliente esta entre 18 e 75 anos, gera uma excecao caso contrario
	 * 
	 * @param birthDate
	 * @throws Exception
	 */
	public void setDataNascimento(LocalDate birthDate) throws Exception {
		if (!isValidBirthday(birthDate)) {
			throw new Exception("Idade do cliente maior que o limite");
		}
		this.dataNascimento = birthDate;
	}
	
	/**
	 * Validacao da idade do cliente. Verifica se esta entre 18 e 75 anos, caso contrario retorna false
	 * 
	 * @param birthDate
	 * @return boolean
	 */
	private boolean isValidBirthday(LocalDate birthDate) {
		LocalDate currentDate = LocalDate.now();
		if ( ((currentDate.getYear() - birthDate.getYear()) > 75) ||
		     ((currentDate.getYear() - birthDate.getYear()) < 18) ) {
			return false;
		}
		
		return true;
	}

	/**
	 * Retorna o CPF do cliente
	 * 
	 * @return String
	 */
	public String getCpf() {
		return cpf;
	}
	
	/**
	 * Define o CPF do cliente
	 * 
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	/**
	 * Retorna o nome da mae do cliente
	 * 
	 * @return String
	 */
	public String getNomeMae() {
		return nomeMae;
	}
	
	/**
	 * Define o nome da mae do cliente
	 * 
	 * @param nomeMae
	 */
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	/**
	 * Retorna o e-mail do cliente
	 * 
	 * @return String
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Define o e-mail do cliente
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Retorna o telefone do cliente
	 * 
	 * @return String
	 */
	public String getTelefone() {
		return telefone;
	}
	
	/**
	 * Define o telefone do cliente
	 * 
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	/**
	 * Retorna o CEP do endereco do cliente
	 * 
	 * @return String
	 */
	public String getCep() {
		return cep;
	}
	
	/**
	 * Define o CEP do endereco do cliente
	 * 
	 * @param cep
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	/**
	 * Retorna a rua do endereco do cliente
	 * 
	 * @return String
	 */
	public String getRua() {
		return rua;
	}
	
	/**
	 * Define a rua do endereco do cliente
	 * 
	 * @param rua
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	/**
	 * Retorna o numero do cliente
	 * 
	 * @return int
	 */
	public int getNumero() {
		return numero;
	}
	
	/**
	 * Define o numero do endereco do cliente
	 * 
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	/**
	 * Retorna o complemento do endereco do cliente
	 * 
	 * @return String
	 */
	public String getComplemento() {
		return complemento;
	}
	
	/**
	 * Define o complemento do endereco do cliente
	 * 
	 * @param complemento
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
