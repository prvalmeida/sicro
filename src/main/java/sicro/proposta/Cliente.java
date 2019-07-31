package sicro.proposta;

import java.util.Date;

public class Cliente {
	private int id;
	private String nome;
	private char sexo;
	private Date dataNascimento;
	private String cpf;
	private String nomeMae;
	private String email;
	private String telefone;
	private String cep;
	private String rua;
	private int numero;
	private String complemento;
	
	public Cliente(	 int id,
	 String nome,
	 char sexo,
	 Date dataNascimento,
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
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
