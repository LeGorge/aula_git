package models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Set<Conta> contas = new HashSet<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Conta> getContas() {
		return contas;
	}
	public void setContas(Set<Conta> contas) {
		this.contas = contas;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Cliente other = (Cliente) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
