/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ventanas;

import java.util.regex.Pattern;
import jdk.nashorn.internal.runtime.JSType;


public class ComprobarValorNumerico {

    public static boolean esNumerico(double cantidadDivisaUsuario) {
        return JSType.isNumber(cantidadDivisaUsuario);
    }
    
    public static boolean esValorDecimal(String valor) {
        String regex = "^([\\d]*(?:[\\.]?[\\d]+)+)$";
        Pattern pt = Pattern.compile(regex);
        java.util.regex.Matcher mat = pt.matcher(valor);
        return mat.find();
    }
    
    public static boolean esValorDecimalOpcionalNegativo(String valor) {
        String regex = "^([-]?[\\d]*(?:[\\.]?[\\d]+)+)$";
        Pattern pt = Pattern.compile(regex);
        java.util.regex.Matcher mat = pt.matcher(valor);
        return mat.find();
    }
}
