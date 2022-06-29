package pojo;

public class LoginDate {


     private  String email;
     private  String  name;
     private String password;


     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setPassword(String  password) {
          this.password = password;
     }

     public String getName() {
          return name;
     }

     public String getPassword() {
          return password;
     }



     @Override
     public String toString() {
          return "LoginDate{" +
                  "email='" + email + '\'' +
                  ", name='" + name + '\'' +
                  ", password=" + password +
                  '}';
     }
}
