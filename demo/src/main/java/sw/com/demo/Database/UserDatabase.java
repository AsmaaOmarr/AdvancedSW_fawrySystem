package sw.com.demo.Database;

import org.springframework.stereotype.Service;
import sw.com.demo.model.User;

import java.util.ArrayList;
@Service
public class UserDatabase {

    public ArrayList<User> UserDB =new ArrayList<User>();

    public UserDatabase() {
        this.UserDB= new ArrayList<User>();

    }

    public ArrayList<User> getUserDB() {
        return UserDB;
    }

    public void setUserDB(ArrayList<User> userDB) {
        UserDB = userDB;
    }
}
