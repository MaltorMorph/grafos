/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.List;

/**
 *
 * @author mateu
 */
public class Nodo {
    class Incidencia
	{
		Nodo nodo;  // referência ao nodo adjacente
		int peso;   // valor da aresta
	}
	List<Incidencia> incidencias;

    public Nodo(List<Incidencia> incidencias) {
        this.incidencias = incidencias;
    }

    public Nodo() {
    }

    public List<Incidencia> getIncidencias() {
        return incidencias;
    }

    public void setIncidencias(List<Incidencia> incidencias) {
        this.incidencias = incidencias;
    }

        
}
