package sw.com.demo.model;

import jdk.dynalink.beans.StaticClass;
import lombok.*;
import org.springframework.stereotype.Service;


public class User {

        public String userName;
        public String email;
        public String password;

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setPassword(String password) {
            this.password = password;
        }


        public void setEmail(String email) {
            this.email = email;
        }

        public String getUserName() {
            return userName;
        }

        public String getPassword() {
            return password;
        }


        public String getEmail() {
            return email;
        }
    }