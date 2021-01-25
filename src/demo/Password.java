package demo;

import java.util.regex.Pattern;

public class Password {
    private String value;
    private final String regex;

    public Password(String regex) {
        this.regex = regex;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String pwd) {
        if(isPwdValid(pwd)){
            this.value = pwd;
        }
        else{
            throw new RuntimeException("La contraseña ingresada no cumple con la politica.");
        }
    }
    private boolean isPwdValid(String pwd){

        return Pattern.matches(this.regex,pwd);
    }
}
