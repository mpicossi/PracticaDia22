package demo;

public class PasswordIntermedia extends Password{

    public PasswordIntermedia(){
        //La contraseña debe tener al entre 8 y 16 caracteres, al menos un dígito, al menos una minúscula.
        super("^(?=\\w*\\d)(?=\\w*[a-z])\\S{8,16}$");
    }
}
