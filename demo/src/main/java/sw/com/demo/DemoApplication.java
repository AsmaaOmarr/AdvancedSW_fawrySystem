package sw.com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sw.com.demo.BSL.TransactionBsl;
import sw.com.demo.BSL.UserBsl;
import sw.com.demo.model.Transaction;
import sw.com.demo.model.User;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		/*UserBsl u = new UserBsl();
		User u1 = new User("safa", 222, "email");
		u.signup(u1);
		System.out.println(u.UserDB);
		System.out.println("kmlkmlmlm;l");*/

		//Transaction t1 = new Transaction("cach","rana","we","mobile",true);
		//TransactionBsl tb1 = new TransactionBsl();
		//tb1.addTransaction(t1);
		//tb1.display();
		//System.out.println("rana gaballah");



	}

}
