/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.ModeloTabla;

import controlador.tda.lista.ListaEnlazada;
import controlador.tda.lista.exception.PosicionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import modelo.EstructuradeDatos.TipodeDatos;

/**
 *
 * @author Gigabyte
 */
public class ModeloTablaDatos extends AbstractTableModel {
    private ListaEnlazada<TipodeDatos> lista;

    public ListaEnlazada<TipodeDatos> getLista() {
        return lista;
    }

    public void setLista(ListaEnlazada<TipodeDatos> lista) {
        this.lista = lista;
    }
    
    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public int getRowCount() {
        return lista.getSize();
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0: return "Tipo";
            case 1: return "Valor";
            case 2: return "Tamaño";
            case 3: return "UMedida";
            default: return null;
        }
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            TipodeDatos dp = lista.obtenerDato(rowIndex);
             
            switch (columnIndex) {
                case 0: return dp.getTipo();
                case 1: return dp.getValor().toString();
                case 2: return dp.getValorMedido();
                case 3: return dp.getUnidadMedida();                
                    
                default: return null;
            }
        } catch (PosicionException ex) {
            Logger.getLogger(ModeloTablaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
