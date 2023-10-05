package application;

import java.time.LocalDate;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		//Test
		Department obj = new Department(1, "Books");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", LocalDate.now(), 3000.00, obj);
		
		SellerDao sellerDao = DaoFactory.CreateSellerDao();
		
		System.out.println(obj);
		System.out.println(seller);

	}

}
