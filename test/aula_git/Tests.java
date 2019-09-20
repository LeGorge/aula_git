package aula_git;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import dao.Dao;
import exceptions.ClienteNaoEncontradoException;
import models.Cliente;
import models.Conta;

public class Tests {

	@Test(expected = ClienteNaoEncontradoException.class)
	public void testClienteNaoEncontrado() throws ClienteNaoEncontradoException {
		Dao dao = new Dao();
		dao.getByNome("nao");
	}
	
	@Test
	public void testDao() throws ClienteNaoEncontradoException {
		Dao dao = new Dao();
		Cliente c = new Cliente();
		Cliente c2 = new Cliente();
		c.setNome("teste");
		c2.setNome("teste2");
		
		dao.saveClient(c);
		dao.saveClient(c2);
		
		assertTrue(dao.getAll().size() == 2);
		assertTrue(dao.getByNome("teste").getContas().isEmpty());
		
		Cliente c3 = new Cliente();
		c3.setNome("teste");
		
		Set<Conta> contas = new HashSet<>();
		Conta conta = new Conta();
		conta.setNumero("1");
		conta.setSaldo(0.0);
		contas.add(conta);
		
		c3.setContas(contas);
		
		dao.saveClient(c3);
		assertTrue(dao.getAll().size() == 2);
		assertFalse(dao.getByNome("teste").getContas().isEmpty());
	}
}
