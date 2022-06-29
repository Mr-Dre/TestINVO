package pojo;

public class LoginDateINVO {

    private  String yourFullName;
    private  String userName;
    private  String  eMail;
    private  String password;
    private  String repeatPassword ;

    public String getYourFullName() {
        return yourFullName;
    }

    public String getUserName() {
        return userName;
    }

    public String geteMail() {
        return eMail;
    }

    public void setYourFullName(String yourFullName) {
        this.yourFullName = yourFullName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public String getPassword() {
        return password;
    }


    public String getRepeatPassword() {
        return repeatPassword;
    }

    @Override
    public String toString() {
        return "LoginDateINVo{" +
                "yourFullName='" + yourFullName + '\'' +
                ", userName='" + userName + '\'' +
                ", eMail='" + eMail + '\'' +
                ", password='" + password + '\'' +
                ", repeatPassword='" + repeatPassword + '\'' +
                '}';
    }

}
