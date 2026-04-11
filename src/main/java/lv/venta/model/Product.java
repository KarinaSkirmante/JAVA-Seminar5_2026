package lv.venta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "ProductTable")
@Entity
public class Product {
	//1. mainigie
	@Setter(value = AccessLevel.NONE)
	@Column(name = "Id")
	@Id //ka primara atslega
	@GeneratedValue(strategy = GenerationType.AUTO)//tiks glabat DB automatiska pec ato increament algoritma
	private long id;
	
	@Column(name = "Title")
	private String title;
	
	@Column(name = "Price")
	private float price;
	
	@Column(name = "Quantity")
	private int quantity;
	
	@Column(name = "Description")
	private String description;
	
	@Column(name = "ProductType")
	private ProductType productType;
	
	
	//2. getters - nak no lombok bibliotekas
	//3. setters - nak no lombok bibliotekas
	//4. abi konstruktori - bez argumenata konstruktors nak no lombok bibliotekas
	
	public Product(String inputTitle, float inputPrice, int inputQuantity, String inputdescription,
			ProductType inputProductType) {
		setTitle(inputTitle);
		setDescription(inputdescription);
		setPrice(inputPrice);
		setQuantity(inputQuantity);
		setProductType(inputProductType);
		
	}
	//5. toString - nak no lombok bibliotekas
	//6. parejas funkcijas

}
