package lv.venta.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//git checkout master
//git pull origin master
//gir branch 
//git merge ritvars
//git add . 
//git commit -m
//git push ...
@Getter
@Setter
@NoArgsConstructor
@ToString
public class MyAuthority {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ida;
	
	private String title;
}
