/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidad.Perro;
import Servicio.PerroService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lorenzo
 */
public class PerroServiceTest {
    
    public PerroServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void pruebaCargaRaza()
    {
        PerroService PS = new PerroService();
        
        
        PS.guardarRazas("Labrador");
        assertEquals(1, PS.listaDeRazas.size());
        
        PS.guardarRazas("Labrador");
        PS.guardarRazas("Ofshore");
        PS.guardarRazas("Emial");
        
        assertEquals(4, PS.listaDeRazas.size());
        assertNotEquals(17, PS.listaDeRazas.size());
        
       
                
               
        
    }
}
