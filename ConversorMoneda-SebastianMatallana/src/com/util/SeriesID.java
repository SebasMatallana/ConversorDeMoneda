/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.util;

import com.clases.divisa.IClavesDivisas;
import java.util.HashMap;
import java.util.Map;


public class SeriesID implements IClavesDivisas {

    public static Map getIdSerie() {
        Map map = new HashMap();
        map.put(CLAVE_DIVISA_USA, "SF346038");
        map.put(CLAVE_DIVISA_EUROPA, "SF346079");
        map.put(CLAVE_DIVISA_GRAN_BRETANA, "SF346042");
        map.put(CLAVE_DIVISA_YEN_JAPON, "SF346053");
        map.put(CLAVE_DIVISA_WON, "SF346030");
        return map;
    }
}
