package demo;

public class PasswordSimple extends Password{

    public PasswordSimple(){
        //La contraseña debe tener al entre 6 y 12 caracteres, al menos un dígito.
        super("^(?=\\w*\\d)\\S{6,12}$");
    }
}
