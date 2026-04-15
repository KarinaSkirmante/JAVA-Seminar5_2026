package lv.venta.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lv.venta.model.Product;
import lv.venta.model.ProductType;
import lv.venta.repo.IProductRepo;
import lv.venta.service.IProductCRUDService;

@Service
public class ProductCRUDServiceImpl implements IProductCRUDService{
	
	@Autowired
	private IProductRepo prodRepo;
	
	
	@Override
	public void create(String title, float price, int quantity, String description, ProductType type) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Product> retrieveAll() throws Exception {
		if(prodRepo.count()==0) {
			throw new Exception("produktu tabula DB ir tuksa");
		}
		
		ArrayList<Product> allProductsFromDB = (ArrayList<Product>) prodRepo.findAll();
		
		return allProductsFromDB;
	}

	@Override
	public Product retrieveById(long id) throws Exception {
		if(id <= 0) {
			throw new Exception("Id nevar but negatvis vai 0");
		}
		if(!prodRepo.existsById(id))
		{
			throw new Exception("Produkts ar id " + id + " neeksiste");
		}
		
		Product productFromDB = prodRepo.findById(id).get();
		
				
		return productFromDB;
	}

	@Override
	public void updateById(long id, String title, float price, int quantity, String description, ProductType type)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		Product productFromDb = retrieveById(id);
		prodRepo.delete(productFromDb);
		
	}

}
