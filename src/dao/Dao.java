package dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

import exceptions.ClienteNaoEncontradoException;
import models.Cliente;

public class Dao {

	private static Set<Cliente> allClients = new HashSet<>();
	
	public Dao(){
		if(Dao.allClients.isEmpty()) {
			load();
		}
	}
	
	public Cliente getByNome(String nome) throws ClienteNaoEncontradoException {
		return Dao.allClients.stream().filter(c->c.getNome().equals(nome)).findFirst()
				.orElseThrow(ClienteNaoEncontradoException::new);
	}
	
	public void saveClient(Cliente c) {
		if(!Dao.allClients.add(c)) {
			Dao.allClients.remove(c);
			Dao.allClients.add(c);
		}
		save();
	}
	
	public Set<Cliente> getAll(){
		return Dao.allClients;
	}

	private void save(){
		try{
	         FileOutputStream fileOut = new FileOutputStream("clients.db");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         
	         out.writeObject(Dao.allClients);
	         
	         out.close();
	         fileOut.close();
	         
	      }catch(IOException i){
	          i.printStackTrace();
	      }
	}
	private void load(){
	      try{
	         FileInputStream fileIn = new FileInputStream("clients.db");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         
	         Dao.allClients = ((Set<Cliente>) in.readObject());
	         
	         in.close();
	         fileIn.close();
	         
	      }catch(IOException i){
	         System.out.println("Database initiated");
	      }catch(ClassNotFoundException c){
	         c.printStackTrace();
	      }
	}
	
}
