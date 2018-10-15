/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.objeto.movie;

/**
 *
 * @author kelvi
 */
public class Movie {
    private String name;
    private String diretor;
    public Movie(final String name, final String diretor){
        this.name = name;
        this.diretor = diretor;
    }
    public Movie(){
        }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(final String diretor) {
        this.diretor = diretor;
    }
}
