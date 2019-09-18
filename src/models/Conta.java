package models;

import java.util.Set;

public class Conta {

	private String numero;
	private Double saldo;
	private Set<Operacao> operacoes;
	
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
