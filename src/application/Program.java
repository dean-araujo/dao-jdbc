package application;

import java.time.LocalDate;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		//Test

		SellerDao sellerDao = DaoFactory.CreateSellerDao();
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

	}

}
