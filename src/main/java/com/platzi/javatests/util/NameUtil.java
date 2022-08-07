package com.platzi.javatests.util;
/**
 * Función para la validació del tipo de nombre que se inserta.
 * Mayuscula, Minuscula y Mixto
 */
public class NameUtil {

    final static String messageOption = "Your name is ";
    public enum nameOptions{
        LOGGER, UPPER, MIXER, NOT_NAME
    }

    public static String setTypeName (String name){
        if(name.matches("[a-z]+")){
            return messageOption + nameOptions.LOGGER;
        }
        else if(name.matches("[A-Z]+")){
            return messageOption + nameOptions.UPPER;
        }
        else if(name.matches("[a-zA-z]+")){
            return messageOption + nameOptions.MIXER;
        }
        else {
            return messageOption + nameOptions.NOT_NAME;
        }
    }
}
