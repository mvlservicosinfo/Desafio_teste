package com.teste.desafio.pessoa;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name="tab_Pessoa")

public class Pessoa extends AbstractPersistable<Long>{
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name="nome")
	private String Nome;
	
	@NotNull
	@Column(name="cpf")
	private	String CPF;
	
	@Column(name="cnpj")
	private String CNPJ;
	
	@NotNull
	@Column(name="endereco")
	private String endereco;
	
	@NotNull
	@Column(name="numero")
	private int numero;
	
	@NotNull
	@Column(name="complemento")
	private String complemento;
	
	@NotNull
	@Column(name="bairro")
	private String bairro;
	
	@NotNull
	@Column(name="cidade")
	private String cidade;
	
	@NotNull
	@Column(name="UF")
	private char UF;
	
	@NotNull
	@Column(name="cep")
	private String CEP;
	
	@NotNull
	@Column(name="idconta")
	private Float idContas;
	
	@NotNull
	@Column(name="tp_Pessoa")	
	private char Tipo_Pessoa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public char getUF() {
		return UF;
	}

	public void setUF(char uF) {
		UF = uF;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public Float getIdContas() {
		return idContas;
	}

	public void setIdContas(Float idContas) {
		this.idContas = idContas;
	}

	public char getTipo_Pessoa() {
		return Tipo_Pessoa;
	}

	public void setTipo_Pessoa(char tipo_Pessoa) {
		Tipo_Pessoa = tipo_Pessoa;
	}

}
