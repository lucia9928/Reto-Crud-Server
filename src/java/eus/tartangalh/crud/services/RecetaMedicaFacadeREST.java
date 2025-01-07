/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.tartangalh.crud.services;

import eus.tartangalh.crud.create.RecetaMedica;
import eus.tartangalh.crud.ejb.RecetaMedicaInterface;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Melany
 *
 */
@Path("eus.tartangalh.crud.create.recetamedica")
public class RecetaMedicaFacadeREST {
 @EJB
    private RecetaMedicaInterface ejb;
 /**
     * Logger for this class.
     */
    private Logger LOGGER=Logger.getLogger(RecetaMedicaFacadeREST.class.getName());
   

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, RecetaMedica entity) {
      
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
     
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public RecetaMedica find(@PathParam("id") Integer id) {
     return null;
       
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<RecetaMedica> findAll() {
     return null;
       
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<RecetaMedica> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
     return null;
    
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
     return null;
        
    }
    private ExecutorService executorService = java.util.concurrent.Executors.newCachedThreadPool();

    @POST
    @Consumes(value = {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(@Suspended final AsyncResponse asyncResponse, final RecetaMedica entity) {
        executorService.submit(new Runnable() {
            public void run() {
                doCreate(entity);
                asyncResponse.resume(javax.ws.rs.core.Response.ok().build());
            }
        });
    }

    private void doCreate(RecetaMedica entity) {
    }
    
}
