/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.tda.lista.ListaEnlazada;
import controlador.tda.lista.ListaEnlazadaServices;
import controlador.tda.lista.exception.PosicionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.EstructuradeDatos.TipodeDatos;
import memoria.MemoryUtil;

//import org.github.jamm.*;
/**
 *
 * @author Gigabyte
 */
public class ControladorDatos<E> {

    private TipodeDatos datos;
    private ListaEnlazadaServices<TipodeDatos> listaDatos = new ListaEnlazadaServices<TipodeDatos>();

    public ListaEnlazadaServices<TipodeDatos> getListaDatos() {
        return listaDatos;
    }

    public void setListaDatos(ListaEnlazadaServices<TipodeDatos> listaDatos) {
        this.listaDatos = listaDatos;
    }

    public TipodeDatos getDatos() {
        return datos;
    }

    public void setDatos(TipodeDatos datos) {
        this.datos = datos;
    }

    public void guardarDatoByte(Byte var) {
        TipodeDatos nuevo = new TipodeDatos(var);
        nuevo.setTipo("byte");
        nuevo.setValor(var);
        nuevo.setValorMedido(MemoryUtil.deepSizeOf(var));
        nuevo.setUnidadMedida("bits");
        datos = nuevo;
        listaDatos.insertarAlFinal(nuevo);
        System.out.println("byte --- " + var + " Tamaño: " + MemoryUtil.deepSizeOf(var) + " bits");
    }

    public void guardarDatoBoolean(boolean var) {
        TipodeDatos nuevo = new TipodeDatos(var);
        nuevo.setTipo("boolean");
        nuevo.setValor(var);
        nuevo.setValorMedido(MemoryUtil.deepSizeOf(var));
        nuevo.setUnidadMedida("logico");
        datos = nuevo;
        listaDatos.insertarAlFinal(nuevo);
        System.out.println("boolean --- " + var + " Tamaño: " + MemoryUtil.deepSizeOf(var) + " bits");
    }

    public void guardarDatoChar(char var) {
        TipodeDatos nuevo = new TipodeDatos(var);
        nuevo.setTipo("char");
        nuevo.setValor(var);
        nuevo.setValorMedido(MemoryUtil.deepSizeOf(var));
        nuevo.setUnidadMedida("bits");
        datos = nuevo;
        listaDatos.insertarAlFinal(nuevo);
        System.out.println("char --- " + var + " Tamaño: " + MemoryUtil.deepSizeOf(var) + " bits");
    }

    public void guardarDatoDouble(double var) {
        TipodeDatos nuevo = new TipodeDatos(var);
        nuevo.setTipo("double");
        nuevo.setValor(var);
        nuevo.setValorMedido(MemoryUtil.deepSizeOf(var));
        nuevo.setUnidadMedida("bits");
        datos = nuevo;
        listaDatos.insertarAlFinal(nuevo);
        System.out.println("double --- " + var + " Tamaño: " + MemoryUtil.deepSizeOf(var) + " bits");
    }

    public void guardarDatofloat(float var) {
        TipodeDatos nuevo = new TipodeDatos(var);
        nuevo.setTipo("float");
        nuevo.setValor(var);
        nuevo.setValorMedido(MemoryUtil.deepSizeOf(var));
        nuevo.setUnidadMedida("bits");
        datos = nuevo;
        System.out.println("float --- " + var + " Tamaño: " + MemoryUtil.deepSizeOf(var) + " bits");
    }

    public void guardarDatoInt(int var) {
        TipodeDatos nuevo = new TipodeDatos(var);
        nuevo.setTipo("int");
        nuevo.setValor(var);
        nuevo.setValorMedido(MemoryUtil.deepSizeOf(var));
        nuevo.setUnidadMedida("bits");
        datos = nuevo;
        listaDatos.insertarAlFinal(nuevo);
        System.out.println("int --- " + var + " Tamaño: " + MemoryUtil.deepSizeOf(var) + " bits");
    }

    public void guardarDatoLong(long var) {
        TipodeDatos nuevo = new TipodeDatos(var);
        nuevo.setTipo("long");
        nuevo.setValor(var);
        nuevo.setValorMedido(MemoryUtil.deepSizeOf(var));
        nuevo.setUnidadMedida("bits");
        datos = nuevo;
        listaDatos.insertarAlFinal(nuevo);
        System.out.println("long --- " + var + " Tamaño: " + MemoryUtil.deepSizeOf(var) + " bits");
    }

    public void guardarDatoShort(short var) {
        TipodeDatos nuevo = new TipodeDatos(var);
        nuevo.setTipo("short");
        nuevo.setValor(var);
        nuevo.setValorMedido(MemoryUtil.deepSizeOf(var));
        nuevo.setUnidadMedida("bits");
        datos = nuevo;
        listaDatos.insertarAlFinal(nuevo);
        System.out.println("short --- " + var + " Tamaño: " + MemoryUtil.deepSizeOf(var) + " bits");
    }

    public void guardarDatoString(String var) {
        TipodeDatos nuevo = new TipodeDatos(var);
        nuevo.setTipo("string");
        nuevo.setValor(var);
        nuevo.setValorMedido(MemoryUtil.deepSizeOf(var));
        nuevo.setUnidadMedida("bits");
        datos = nuevo;
        listaDatos.insertarAlFinal(nuevo);
        System.out.println("String --- " + var + " Tamaño: " + MemoryUtil.deepSizeOf(var) + " bits");
    }

    //Metodo Guardar Arreglos de datos
    public void guardarDatoArregloByte(byte[] var, String tipo) {
        TipodeDatos nuevo = new TipodeDatos(var);
        nuevo.setTipo(tipo);
        nuevo.setValor(var);
        nuevo.setValorMedido(MemoryUtil.deepSizeOf(var));
        nuevo.setUnidadMedida("bits");
        datos = nuevo;
        listaDatos.insertarAlFinal(nuevo);
        System.out.println("Arreglo de tipo " + tipo);
//        System.out.println("Valores");
//        listar();
        System.out.println("Tamaño en memoria: " + MemoryUtil.deepSizeOf(var) + " bits");
    }

    public void guardarDatoArregloShort(short[] var, String tipo) {
        TipodeDatos nuevo = new TipodeDatos(var);
        nuevo.setTipo(tipo);
        nuevo.setValor(var);
        nuevo.setValorMedido(MemoryUtil.deepSizeOf(var));
        nuevo.setUnidadMedida("bits");
        datos = nuevo;
        listaDatos.insertarAlFinal(nuevo);
        System.out.println("Arreglo de tipo " + tipo);
//        System.out.println("Valores");
//        listar();
        System.out.println("Tamaño en memoria: " + MemoryUtil.deepSizeOf(var) + " bits");

    }

    public void guardarDatoArregloInt(int[] var, String tipo) {
        TipodeDatos nuevo = new TipodeDatos(var);
        nuevo.setTipo(tipo);
        nuevo.setValor(var);
        nuevo.setValorMedido(MemoryUtil.deepSizeOf(var));
        nuevo.setUnidadMedida("bits");
        datos = nuevo;
        listaDatos.insertarAlFinal(nuevo);
        System.out.println("Arreglo de tipo " + tipo);
//        System.out.println("Valores");
//        listar();
        System.out.println("Tamaño en memoria: " + MemoryUtil.deepSizeOf(var) + " bits");

    }

    public void guardarDatoArreglofloat(float[] var, String tipo) {
        TipodeDatos nuevo = new TipodeDatos(var);
        nuevo.setTipo(tipo);
        nuevo.setValor(var);
        nuevo.setValorMedido(MemoryUtil.deepSizeOf(var));
        nuevo.setUnidadMedida("bits");
        datos = nuevo;
        listaDatos.insertarAlFinal(nuevo);
        System.out.println("Arreglo de tipo " + tipo);
//        System.out.println("Valores");
//        listar();
        System.out.println("Tamaño en memoria: " + MemoryUtil.deepSizeOf(var) + " bits");

    }

    public void guardarDatoArregloDouble(double[] var, String tipo) {
        TipodeDatos nuevo = new TipodeDatos(var);
        nuevo.setTipo(tipo);
        nuevo.setValor(var);
        nuevo.setValorMedido(MemoryUtil.deepSizeOf(var));
        nuevo.setUnidadMedida("bits");
        datos = nuevo;
        listaDatos.insertarAlFinal(nuevo);
        System.out.println("Arreglo de tipo " + tipo);
//        System.out.println("Valores");
//        listar();
        System.out.println("Tamaño en memoria: " + MemoryUtil.deepSizeOf(var) + " bits");

    }

    public void guardarDatoArregloBoolean(boolean[] var, String tipo) {
        TipodeDatos nuevo = new TipodeDatos(var);
        nuevo.setTipo(tipo);
        nuevo.setValor(var);
        nuevo.setValorMedido(MemoryUtil.deepSizeOf(var));
        nuevo.setUnidadMedida("bits");
        datos = nuevo;
        listaDatos.insertarAlFinal(nuevo);
        System.out.println("Arreglo de tipo " + tipo);
//        System.out.println("Valores");
//        listar();
        System.out.println("Tamaño en memoria: " + MemoryUtil.deepSizeOf(var) + " bits");
    }

    public void guardarDatoArregloString(String[] var, String tipo) {
        TipodeDatos nuevo = new TipodeDatos(var);
        nuevo.setTipo(tipo);
        nuevo.setValor(var);
        nuevo.setValorMedido(MemoryUtil.deepSizeOf(var));
        nuevo.setUnidadMedida("bits");
        datos = nuevo;
        listaDatos.insertarAlFinal(nuevo);
        System.out.println("Arreglo de tipo " + tipo);
//        System.out.println("Valores");
//        listar();
        System.out.println("Tamaño en memoria: " + MemoryUtil.deepSizeOf(var) + " bits");

    }

    public void guardarDatoArregloLong(long[] var, String tipo) {
        TipodeDatos nuevo = new TipodeDatos(var);
        nuevo.setTipo(tipo);
        nuevo.setValor(var);
        nuevo.setValorMedido(MemoryUtil.deepSizeOf(var));
        nuevo.setUnidadMedida("bits");
        datos = nuevo;
        listaDatos.insertarAlFinal(nuevo);
        System.out.println("Arreglo de tipo " + tipo);
//        System.out.println("Valores");
//        listar();
        System.out.println("Tamaño en memoria: " + MemoryUtil.deepSizeOf(var) + " bits");

    }

    public void guardarDatoArregloChar(char[] var, String tipo) {
        TipodeDatos nuevo = new TipodeDatos(var);
        nuevo.setTipo(tipo);
        nuevo.setValor(var);
        nuevo.setValorMedido(MemoryUtil.deepSizeOf(var));
        nuevo.setUnidadMedida("bits");
        datos = nuevo;
        listaDatos.insertarAlFinal(nuevo);
        System.out.println("Arreglo de tipo " + tipo);
//        System.out.println("Valores");
//        listar();
        System.out.println("Tamaño en memoria: " + MemoryUtil.deepSizeOf(var) + " bits");

    }
//
//    public void listar() {
//        for (int i = 0; i < listaDatos.getSize(); i++) {
////            System.out.print(listaDatos.obtenerDato(i).toString() + "\t");
//            try {
//                listaDatos.getLista().obtenerDato(i).getArreglo_string();
//                listaDatos.getLista().imprimir();
//            } catch (PosicionException ex) {
//                Logger.getLogger(ControladorDatos.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//        }
//        System.out.println("");
//
//    }

    public static void main(String args) {
        ControladorDatos cdp = new ControladorDatos();
        //cdp.guardarDatoInt(0);
        String[] cadena = new String[1];
        cdp.guardarDatoArregloString(cadena, "String");
        System.out.println(MemoryUtil.deepSizeOf(cdp.getDatos().getArreglo_string()));
        cadena[0] = "Hola";
//        cadena[1] = "Mundo";
        cdp.guardarDatoArregloString(cadena, "String");
        System.out.println(MemoryUtil.deepSizeOf(cdp.getDatos().getArreglo_string()));

    }

//    public void guardarDatoArreglo(byte[] arreglo, Object selectedItem) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
