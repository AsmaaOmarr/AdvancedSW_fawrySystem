package sw.com.demo.controller;

import org.springframework.web.bind.annotation.*;
import sw.com.demo.BSL.UserBsl;
import sw.com.demo.Database.UserDatabase;
import sw.com.demo.model.User;

@RestController
public class RegistrationController {
    private UserBsl userBsl ;
    UserDatabase userDatabase;

    public RegistrationController(UserBsl userBsl, UserDatabase userDatabase) {
        this.userBsl = userBsl;
        this.userDatabase = userDatabase;
    }

    public UserDatabase getUserDatabase() {
        return userDatabase;
    }

    public void setUserDatabase(UserDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }

    public UserBsl getUserBsl() {
        return userBsl;
    }

    public void setUserBsl(UserBsl userBsl) {
        this.userBsl = userBsl;
    }

    @PostMapping(value = "/User/Signup")
    public String singup(@RequestBody User user) {
        return userBsl.signup(user);
    }
    @RequestMapping(path = "/User/Signin/{email}/{Password}",method = RequestMethod.GET)
    public String  signin(@PathVariable("email") String email,@PathVariable("Password") String Password) {
        return userBsl.signin(email,Password);
    }

}
