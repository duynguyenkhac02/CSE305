/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental_management;
import java.util.*;
/**
 *
 * @author Duy
 */
public class User {
    public static void main(String[] args) {
        UserInfo user = new UserInfo("abcd", "123", "abcd@gmail.com", "admin");
        user.createUser();
        user.resetPassword();

    }

    public static class UserInfo {

        private String userID;
        private String password;
        private String email;
        private String userType;

        public UserInfo(String userID, String password, String email, String userType) {
            this.userID = userID;
            this.password = password;
            this.email = email;
            this.userType = userType;
        }

       
        public void createUser() {
            
            System.out.println("User created successfully!");
        }

        public void resetPassword() {
          
            System.out.println("Password reset successful!");
        }

        public String getUserID() {
            return userID;
        }

        public void setUserID(String userID) {
            this.userID = userID;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getUserType() {
            return userType;
        }

        public void setUserType(String userType) {
            this.userType = userType;
        }
    }
}

