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
public class Grafo {
    List<Nodo> nodos;  // todos os vértices do grafo

    public Grafo() {
    }

    public Grafo(List<Nodo> nodos) {
        this.nodos = nodos;
    }

    public List<Nodo> getNodos() {
        return nodos;
    }

    public void setNodos(List<Nodo> nodos) {
        this.nodos = nodos;
    }

}
