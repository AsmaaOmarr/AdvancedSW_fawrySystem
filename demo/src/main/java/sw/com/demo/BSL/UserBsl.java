package sw.com.demo.BSL;

import org.springframework.stereotype.Service;
import sw.com.demo.Database.UserDatabase;
import sw.com.demo.model.User;

@Service
public class UserBsl {


    public UserDatabase userDatabase = new UserDatabase();

    public UserBsl() {
        this.userDatabase = userDatabase;
    }

    public UserDatabase getUserDatabase() {
        return userDatabase;
    }

    public void setUserDatabase(UserDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }

    public String signup(User user) {
        /*for (int i = 0; i < UserDB.size(); i++) {
            UserDB.add(user);
            return UserDB.get(i);
        }
        return null;*/
        for(User i:userDatabase.UserDB){

            if((i.getPassword().equals(user.getPassword()))&&(i.getEmail().equals(user.getEmail())))
            {
                return "This Email Already Exist";
            }

        }
        userDatabase.UserDB.add(user);
        return "Signed Up Successfully";

    }
    public String signin(String email,String Password) {

        for(User i:userDatabase.UserDB){
            if((i.getPassword().equals(Password))&&(i.getEmail().equals(email)))
            {
                return "signed In Successfully";
            }
        }
        return "Incorrect email Or Password";


    }


}
