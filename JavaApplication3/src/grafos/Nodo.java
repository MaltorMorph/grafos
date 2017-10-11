/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author mateu
 */
public class Nodo {
   
    
    
   class Incidencia
	{
		String nodo;  // referência ao nodo adjacente
		int peso;   // valor da aresta
	}
	List<Incidencia> incidencias;

    public Nodo(List<Incidencia> incidencias) {
        this.incidencias = incidencias;
    }

    public List<Incidencia> getIncidencias() {
        return incidencias;
    }

    public void setIncidencias(List<Incidencia> incidencias) {
        this.incidencias = incidencias;
    }    
//    public void adiciona(String nome,int peso){
//        this.setIncidencias();
//        
//    }
        
    public void showNodos(){
        System.out.println(this.incidencias);
    }
        
}

    
        

