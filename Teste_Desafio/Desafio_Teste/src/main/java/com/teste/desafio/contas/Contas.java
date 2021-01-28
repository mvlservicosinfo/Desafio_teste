package com.teste.desafio.contas;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.sun.istack.NotNull;
import com.teste.desafio.pessoa.Pessoa;

import javax.persistence.*;

@Entity
@Table(name="tab_contas")
public class Contas extends AbstractPersistable<Long>{

	@Id
	@NotNull
	@OneToMany( targetEntity=Pessoa.class )
	private int idContas;
	
	@Column(name="mov_credito")
	@NotNull
	private Long mov_credito;
	
	@Column(name="mov_debito")
	@NotNull
	private Long mov_débito;
	
	@Column(name="total_mov")
	@NotNull
	private Long total_mov;
	
	@Column(name="valor_pago_mov")
	@NotNull
	private Long valor_pago_mov;
	
	@Column(name="saldo_inicial")
	@NotNull
	private Long saldo_inicial;
	
	@Column(name="saldo_atual")
	@NotNull
	private Long saldo_atual;

	public int getIdContas() {
		return idContas;
	}

	public void setIdContas(int idContas) {
		this.idContas = idContas;
	}

	public Long getMov_credito() {
		return mov_credito;
	}

	public void setMov_credito(Long mov_credito) {
		this.mov_credito = mov_credito;
	}

	public Long getMov_debito() {
		return mov_débito;
	}

	public void setMov_debito(Long mov_débito) {
		this.mov_débito = mov_débito;
	}

	public Long getTotal_mov() {
		return total_mov;
	}

	public void setTotal_mov(Long total_mov) {
		this.total_mov = total_mov;
	}

	public Long getValor_pago_mov() {
		return valor_pago_mov;
	}

	public void setValor_pago_mov(Long valor_pago_mov) {
		this.valor_pago_mov = valor_pago_mov;
	}

	public Long getSaldo_inicial() {
		return saldo_inicial;
	}

	public void setSaldo_inicial(Long saldo_inicial) {
		this.saldo_inicial = saldo_inicial;
	}

	public Long getSaldo_atual() {
		return saldo_atual;
	}

	public void setSaldo_atual(Long saldo_atual) {
		this.saldo_atual = saldo_atual;
	}

}
