Package com.tutorial;

class User{
    private String  username;
    private String password;

    User(String username, String password){
        this.username = username;
        this.username = password;

    }

    // method getter
    public String getUsername(){
        return this.username;
    }

    // method Setter untuk ganti password
    public void getPassword(){
        this.Password = password;
    }
}

public class Main {
    public static void main(String[] args) {
        // instansiasi atau buat objek
        User person_1 = new User("undikma","jayajayajaya");

        // get username
        Systerm.out.println(person_1.getUsername());
        System.out.println(person_1.getUsrename());

        person_1.Setpassword("sukses");

        System.out.printrln("Password Baru : " + person_1.getpassword());
         

         
    }
}
