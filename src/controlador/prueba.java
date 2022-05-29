/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import memoria.MemoryUtil;
import org.github.jamm.MemoryMeter;

/**
 *
 * @author Gigabyte
 */
public class prueba {
    public static void main(String[] args) {
//        MemoryMeter a = MemoryMeter.builder().build();
        
        String var = "";
        System.out.println(MemoryUtil.deepSizeOf(var));
//        System.out.println(a.measureDeep(var));
    }
}
