package com.ty;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ty.entity.Account;
import com.ty.entity.AccountPK;
import com.ty.repo.AccountRepository;

@SpringBootApplication
public class SpringDataJpaCompositeKeyProfile21Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt=SpringApplication.run(SpringDataJpaCompositeKeyProfile21Application.class, args);
		AccountRepository repo=cxt.getBean(AccountRepository.class);
		
		//Set Composite Key values
		AccountPK acpk= new AccountPK();
		acpk.setAccNum(1234567890l);
		acpk.setAccType("Saving");
//		
//		Set Entity Object 
//		Account ac= new Account();
//		ac.setBranch("SBI");
//		ac.setHolderName("Ryan");
//		ac.setAccountPK(acpk);
//		repo.save(ac);
		
		Optional<Account> list=repo.findById(acpk);
		if(list.isPresent()) {
			System.out.println(list.get());
		}
	}

}
