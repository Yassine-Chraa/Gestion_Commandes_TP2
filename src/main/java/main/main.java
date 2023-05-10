package main;

import dao.ClientDao;
import model.Client;

public class main {
	public static void main(String[] args) {
		ClientDao newDao =new ClientDao();
		Client newClient =new Client();
		for(Client client :  newDao.findAll()) {
			System.out.println(client.getId());
		}
	}
}
