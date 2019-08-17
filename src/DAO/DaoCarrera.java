/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import Identidades.Carrera;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author jorge Alberto
 */
public class DaoCarrera extends Conexion implements CrudCarrera{
PreparedStatement ps;       //para sentencias sql
    ResultSet rs;               //para resultados que va a devolver
    Carrera c;                 //para crear productos
    int res;
    
    @Override
    public ArrayList<Carrera> mostrar() throws ClassNotFoundException, SQLException {
         ArrayList<Carrera> ar=new ArrayList<Carrera>();
        try {
            ps=super.con().prepareStatement("select * from carrera");
            rs=ps.executeQuery();
            while(rs.next()){
                c=new Carrera(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
                ar.add(c);
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
      
        }finally{
            super.con().close();
        }
        return ar;
    }

    @Override
    public int agrgarCarrera(Carrera c) throws ClassNotFoundException, SQLException {
        try {
            ps=super.con().prepareStatement("insert into carrera(nombre, cantidadMaterias, codigoFacultad) values(?,?,?)");
            ps.setString(1, c.getNombre());
            ps.setDouble(2, c.getCantidadMaterias());
            ps.setDouble(2, c.getCodigoFacultad());
            res=ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
            super.con().close();
        }
        return res;
    }

    @Override
    public int modificarCarrera(Carrera c) throws ClassNotFoundException, SQLException {
        try {
            ps=super.con().prepareStatement("update antidad set nombre=?,cantidadMaterias=?, codigoFacultad=? where id=?");
            
            ps.setString(1, c.getNombre());
            ps.setDouble(2, c.getCantidadMaterias());
            ps.setInt(3, c.getCodigoFacultad());
            ps.setInt(4, c.getCodigoCarrera());
            res=ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
            super.con().close();
        }
        return res;
    }

    @Override
    public int eliminarCarrera(Carrera c) throws ClassNotFoundException, SQLException {
        try {
            ps=super.con().prepareStatement("delete from carrera where id=?");
            
            ps.setInt(1, c.getCodigoCarrera());
            res=ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
            super.con().close();
        }
        return res;
    
    }
    
}