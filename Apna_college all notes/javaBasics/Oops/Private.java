package Oops;

class Bankaccount {
    public String username;
    public String password;

    // public void Setpassword(String pwd) {
    // password = pwd;
    // }

}

public class Private {
    public static void main(String[] args) {
        Bankaccount Myacc = new Bankaccount();
        Myacc.username = "Asjad";
        System.out.println(Myacc.username);
        Myacc.password = "Absds";
        System.out.println(Myacc.password);

    }

}