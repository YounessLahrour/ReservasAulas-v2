/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesalandalus.programacion.reservasaulas.modelo.dominio.permanencia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 *
 * @author Youness
 */
abstract class Permanencia {
    protected LocalDate dia;
    protected static final DateTimeFormatter FORMATO_DIA=DateTimeFormatter.ofPattern("dd/MM/uuuu");
    
    
    protected Permanencia(){
        
    }
    protected Permanencia(LocalDate dia){
        setDia(dia);
    }
    protected Permanencia(String dia){
        setDia(dia);
    }

    public LocalDate getDia() {
        return dia;
    }

    protected void setDia(LocalDate dia)throws IllegalArgumentException {
        if(dia==null){
            throw new IllegalArgumentException("El día de una permanencia no puede ser nulo.");
        } else{
            this.dia = dia;
        }
    }
    
    protected void setDia(String dia)throws IllegalArgumentException{
        if(dia==null){
            throw new IllegalArgumentException("El día de una permanencia no puede ser nulo.");
        }
        String diaParseado=String.format(dia, FORMATO_DIA);
        this.dia=LocalDate.parse(diaParseado, FORMATO_DIA);
  
    }
    
    public abstract int getPuntos();

    @Override
    public abstract String toString();

    @Override
    public abstract int hashCode();

    @Override
    public abstract boolean equals(Object obj);
    
    
    
    
            
        
    
    
    
    
    
    
    
    
}
