/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.tartangalh.crud.ejb;

import eus.tartangalh.crud.create.Almacen;
import eus.tartangalh.crud.create.ProductoFarmaceutico;
import excepciones.ActualizarException;
import excepciones.BorrarException;
import excepciones.CrearException;
import excepciones.LeerException;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Andoni
 */
@Local
public interface AlmacenInterface {

    /**
     * Este método crea un nuevo almacén en el sistema.
     *
     * @param almacen El objeto de la entidad Almacen que contiene los datos del
     * nuevo almacén.
     * @throws CrearException Lanzada cuando ocurre un error o excepción durante
     * la creación.
     */
    public void crearAlmacen(Almacen almacen) throws CrearException;

    /**
     * Este método lee un almacén del sistema.
     *
     * @param id El objeto de la entidad Almacen que se desea leer.
     * @throws LeerException Lanzada cuando ocurre un error o excepción durante
     * la lectura.
     */
    public Almacen encontrarAlmacen(Integer id) throws LeerException;

    /**
     * Este método actualiza los datos de un almacén existente en el sistema.
     *
     * @param almacen El objeto de la entidad Almacen que contiene los datos
     * modificados del almacén.
     * @throws ActualizarException Lanzada cuando ocurre un error o excepción
     * durante la actualización.
     */
    public List<Almacen> encontrarAlmacenPorPais(String pais) throws LeerException;

    public List<Almacen> encontrarAlmacenPorCiudad(String ciudad) throws LeerException;

    public void actualizarAlmacen(Almacen almacen) throws ActualizarException;

    /**
     * Este método elimina un almacén del sistema.
     *
     * @param almacen El objeto de la entidad Almacen que se desea eliminar.
     * @throws BorrarException Lanzada cuando ocurre un error o excepción
     * durante la eliminación.
     */
    public void borrarAlmacen(Almacen almacen) throws BorrarException;

    public List<Almacen> encontrarTodosAlmacenes() throws LeerException;

    public List<Almacen> encontrarAlmacenPorFecha(Date fechaLimite) throws LeerException;

    public List<Almacen> encontrarAlmacenPorFechaDesdeHasta(Date fechaInicio, Date fechaFin) throws LeerException;

}
