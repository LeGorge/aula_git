package models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Conta implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String numero;
	private Double saldo;
	private Set<Operacao> operacoes = new HashSet<>();
	
	public  String getNumero() {
		return numero;
	}
	public  void setNumero(String numero) {
		this.numero = numero;
	}
	public  Double getSaldo() {
		return saldo;
	}
	public  void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Set<Operacao> getOperacoes() {
		return operacoes;
	}
	public void setOperacoes(Set<Operacao> operacoes) {
		this.operacoes = operacoes;
	}
	
}
