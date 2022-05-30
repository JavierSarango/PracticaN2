/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.tda.lista.ListaEnlazadaServices;
import java.util.ArrayList;
import java.util.List;
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
        ;
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

        System.out.println("Tamaño en memoria: " + MemoryUtil.deepSizeOf(var) + " bits");
       
    }

    public void guardarListaEnlazada(ListaEnlazadaServices<E> lista, String tipo) {

        TipodeDatos nuevo = new TipodeDatos(lista);
        nuevo.setTipo(tipo);
        nuevo.setValor(lista.getLista());
        nuevo.setValorMedido(MemoryUtil.deepSizeOf(lista));
        nuevo.setUnidadMedida("bits");
        datos = nuevo;
//        listaDatos.insertarAlFinal(nuevo);
        System.out.print("ListaEnlazada de tipo " + tipo + " || ");
        System.out.println("Tamaño en memoria ListaEnlazada: " + MemoryUtil.deepSizeOf(lista) + " bits");

    }

    public void guardarListadeJava(List listado) {
        TipodeDatos nuevo = new TipodeDatos(listado);
        nuevo.setTipo("No tiene tipo definido");
        for (int i = 0; i < listado.size(); i++) {
            nuevo.setValor(listado.get(i));
        }

        nuevo.setValorMedido(MemoryUtil.deepSizeOf(listado));
        nuevo.setUnidadMedida("bits");
        datos = nuevo;

        System.out.print("Lista de Java || ");
        System.out.println("Tamaño en memoria List: " + MemoryUtil.deepSizeOf(listado) + " bits");

    }

    public String mensajeListaEnlazada(ListaEnlazadaServices<E> lista, String tipo) {
        String cadena1 = "ListaEnlazada de tipo: " + tipo +" || ";
        String cadena2 = "Tamaño en Memoria ListaEnlazada " + MemoryUtil.deepSizeOf(lista) + " bits";
        String cadenaFinal = cadena1.concat(cadena2);
        return cadenaFinal;
    }
      public String mensajeList(List lista) {
        String cadena1 = "List de Java || ";
        String cadena2 = "Tamaño en Memoria List " + MemoryUtil.deepSizeOf(lista) + " bits";
        String cadenaFinal = cadena1.concat(cadena2);
        return cadenaFinal;
    }
//
//    public static void main(String[] args) {
//        ControladorDatos cdp = new ControladorDatos();
//        ListaEnlazadaServices<Integer> lista;
//        
//        List lis = new ArrayList();
////        System.out.println("***************Lista Enlazada declarada ***************");
////        lista = new ListaEnlazadaServices<>();
////        cdp.guardarListaEnlazada(lista, "Integer");
////        System.out.println(MemoryUtil.deepSizeOf(cdp.getDatos().getListaEnlazada()));
//        System.out.println("***************Lista Enlazada Inicializada con tamaño ***************");
//        lista = new ListaEnlazadaServices<>();
//        System.out.println(lista.getSize());
//        cdp.guardarListaEnlazada(lista, "Integer");
//        System.out.println(MemoryUtil.deepSizeOf(cdp.getDatos().getListaEnlazada()));
////        System.out.println("***************Lista Enlazada Inicializada con valores ***************");
////        lista.insertar(2, 0);
////        cdp.guardarListaEnlazada(lista, "Integer");
////        System.out.println(MemoryUtil.deepSizeOf(cdp.getDatos().getListaEnlazada()));
////
////        System.out.println("***************Lista de Java declarada ***************");
////        cdp.guardarListadeJava(lis);
////        System.out.println(MemoryUtil.deepSizeOf(cdp.getDatos().getListadeJava()));
////        System.out.println("***************Lista Enlazada Inicializada con valores ***************");
////        lis.add(2);
////        lis.add(1);
////        lis.add("Macario");
////        lis.add("9232131");
////        cdp.guardarListadeJava(lis);
////        System.out.println(MemoryUtil.deepSizeOf(cdp.getDatos().getListadeJava()));
//
//    }

}
