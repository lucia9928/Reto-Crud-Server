/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.tartangalh.crud.ejb;

import eus.tartangalh.crud.create.Gestiona;
import excepciones.ActualizarException;
import excepciones.BorrarException;
import excepciones.CrearException;
import excepciones.LeerException;
import java.util.List;
import javax.ejb.Local;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author markel
 */
@Local
public interface GestionaInterfaz {

    public void crearGestion(Gestiona gestiona) throws CrearException;

    public void actualizarGestiona(Gestiona gestiona) throws ActualizarException;

    public Gestiona encontrarGestiona(@PathParam("id") PathSegment id) throws LeerException;

    public void borrarGestiona(@PathParam("id") Gestiona gestiona) throws BorrarException;

    public List<Gestiona> mostrarTodosGestiona() throws LeerException;

    public List<Gestiona> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) throws LeerException;

}
