package com.platzi.javatests.util;

public class PasswordUtil {

    //Enum es una "clase" especial que representa un grupo de constantes
    public enum SecurityLevel{
        WEAK, MEDIUM, STRONG
    }

    public static SecurityLevel assessPassword(String password){
        if(password.length() < 8){
            return SecurityLevel.WEAK;
        }
        // Expresion Regular.
            //Con los corchetes puedo estudiar si la password tiene ciertos caracteres.
                //[a-z] -> Letras de la a - z
                // [a-zA-Z] -> Obtiene letras de la a-z en mayusculas.
                // Indica que es varias veces.
        if(password.matches("[a-zA-Z]+")){
            return SecurityLevel.WEAK;
        }
        //Password que tenga varias veces letras o numeros.
        if(password.matches("[a-zA-Z0-9]+")){
            return SecurityLevel.MEDIUM;
        }
        return SecurityLevel.STRONG;
    }
}
