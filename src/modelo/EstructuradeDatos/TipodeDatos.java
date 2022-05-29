/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.EstructuradeDatos;

import controlador.tda.lista.ListaEnlazada;
import java.util.List;

/**
 *
 * @author Gigabyte
 */
public class TipodeDatos<E> {
//variables obtener informacion
    private String tipo;
    private E valor;
    private E valorMedido;
    private String unidadMedida;

//variables tipos de datos
 
    private byte var_byte;
    private short var_short;
    private int var_int;
    private float var_float;
    private double var_double;
    private boolean var_boolean;
    private String var_string;
    private long var_long;
    private char var_char;
    
//Arreglos;
    private byte[] arreglo_byte;
    private short[] arreglo_short;
    private int[] arreglo_int;
    private float[] arreglo_float;
    private double[] arreglo_double;
    private boolean[] arreglo_boolean;
    private String[] arreglo_string;
    private long[] arreglo_long;
    private char[] arreglo_char;
    
//Objetos lista
    private ListaEnlazada<E> listaEnlazada;
    private List listadeJava;

    //Getters and Setters de los tipos de Datos
    public byte getVar_byte() {
        return var_byte;
    }

    public void setVar_byte(byte var_byte) {
        this.var_byte = var_byte;
    }

    public short getVar_short() {
        return var_short;
    }

    public void setVar_short(short var_short) {
        this.var_short = var_short;
    }

    public int getVar_int() {
        return var_int;
    }

    public void setVar_int(int var_int) {
        this.var_int = var_int;
    }

    public float getVar_float() {
        return var_float;
    }

    public void setVar_float(float var_float) {
        this.var_float = var_float;
    }

    public double getVar_double() {
        return var_double;
    }

    public void setVar_double(double var_double) {
        this.var_double = var_double;
    }

    public boolean isVar_boolean() {
        return var_boolean;
    }

    public void setVar_boolean(boolean var_boolean) {
        this.var_boolean = var_boolean;
    }

    public String getVar_string() {
        return var_string;
    }

    public void setVar_string(String var_string) {
        this.var_string = var_string;
    }

    public long getVar_long() {
        return var_long;
    }

    public void setVar_long(long var_long) {
        this.var_long = var_long;
    }

    public char getVar_char() {
        return var_char;
    }

    public void setVar_char(char var_char) {
        this.var_char = var_char;
    }
// getters and setters arreglos

    public byte[] getArreglo_byte() {
        return arreglo_byte;
    }

    public void setArreglo_byte(byte[] arreglo_byte) {
        this.arreglo_byte = arreglo_byte;
    }

    public short[] getArreglo_short() {
        return arreglo_short;
    }

    public void setArreglo_short(short[] arreglo_short) {
        this.arreglo_short = arreglo_short;
    }

    public int[] getArreglo_int() {
        return arreglo_int;
    }

    public void setArreglo_int(int[] arreglo_int) {
        this.arreglo_int = arreglo_int;
    }

    public float[] getArreglo_float() {
        return arreglo_float;
    }

    public void setArreglo_float(float[] arreglo_float) {
        this.arreglo_float = arreglo_float;
    }

    public double[] getArreglo_double() {
        return arreglo_double;
    }

    public void setArreglo_double(double[] arreglo_double) {
        this.arreglo_double = arreglo_double;
    }

    public boolean[] getArreglo_boolean() {
        return arreglo_boolean;
    }

    public void setArreglo_boolean(boolean[] arreglo_boolean) {
        this.arreglo_boolean = arreglo_boolean;
    }

    public String[] getArreglo_string() {
        return arreglo_string;
    }

    public void setArreglo_string(String[] arreglo_string) {
        this.arreglo_string = arreglo_string;
    }

    public long[] getArreglo_long() {
        return arreglo_long;
    }

    public void setArreglo_long(long[] arreglo_long) {
        this.arreglo_long = arreglo_long;
    }

    public char[] getArreglo_char() {
        return arreglo_char;
    }

    public void setArreglo_char(char[] arreglo_char) {
        this.arreglo_char = arreglo_char;
    }  
 
//getters and setters Objetos lista
    public ListaEnlazada<E> getListaEnlazada() {
        return listaEnlazada;
    }

    public void setListaEnlazada(ListaEnlazada<E> listaEnlazada) {
        this.listaEnlazada = listaEnlazada;
    }

    public List getListadeJava() {
        return listadeJava;
    }

    public void setListadeJava(List listadeJava) {
        this.listadeJava = listadeJava;
    }

    //Getters and setters variables para obtener los datos
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public E getValor() {
        return valor;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }

    public E getValorMedido() {
        return valorMedido;
    }

    public void setValorMedido(E valorMedido) {
        this.valorMedido = valorMedido;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    //Constructores de la clase    
    public TipodeDatos(byte var_byte) {
        this.var_byte = var_byte;
    }

    public TipodeDatos(short var_short) {
        this.var_short = var_short;
    }

    public TipodeDatos(int var_int) {
        this.var_int = var_int;
    }

    public TipodeDatos(float var_float) {
        this.var_float = var_float;
    }

    public TipodeDatos(double var_double) {
        this.var_double = var_double;
    }

    public TipodeDatos(boolean var_boolean) {
        this.var_boolean = var_boolean;
    }

    public TipodeDatos(String var_string) {
        this.var_string = var_string;
    }

    public TipodeDatos(long var_long) {
        this.var_long = var_long;
    }

    public TipodeDatos(char var_char) {
        this.var_char = var_char;
    }

    public TipodeDatos(byte[] arreglo_byte) {
        this.arreglo_byte = arreglo_byte;
    }

    public TipodeDatos(short[] arreglo_short) {
        this.arreglo_short = arreglo_short;
    }

    public TipodeDatos(int[] arreglo_int) {
        this.arreglo_int = arreglo_int;
    }

    public TipodeDatos(float[] arreglo_float) {
        this.arreglo_float = arreglo_float;
    }

    public TipodeDatos(double[] arreglo_double) {
        this.arreglo_double = arreglo_double;
    }

    public TipodeDatos(boolean[] arreglo_boolean) {
        this.arreglo_boolean = arreglo_boolean;
    }

    public TipodeDatos(String[] arreglo_string) {
        this.arreglo_string = arreglo_string;
    }

    public TipodeDatos(long[] arreglo_long) {
        this.arreglo_long = arreglo_long;
    }

    public TipodeDatos(char[] arreglo_char) {
        this.arreglo_char = arreglo_char;
    }
        

    public TipodeDatos(ListaEnlazada<E> listaEnlazada) {
        this.listaEnlazada = listaEnlazada;
    }

    public TipodeDatos(List listadeJava) {
        this.listadeJava = listadeJava;
    }
    
    
//Constructor vacío
    public TipodeDatos() {
    }

    @Override
    public String toString() {
        return valor + " ";
    }

}
