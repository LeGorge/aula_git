package models;

import java.io.Serializable;

public class Operacao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String conta1;
	private String conta2;
	private Double valor;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getConta1() {
		return conta1;
	}
	public void setConta1(String conta1) {
		this.conta1 = conta1;
	}
	public String getConta2() {
		return conta2;
	}
	public void setConta2(String conta2) {
		this.conta2 = conta2;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Operacao other = (Operacao) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
