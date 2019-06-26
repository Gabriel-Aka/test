package com.sistemabancario.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Manoel Campos da Silva Filho
 */
public class MovimentacaoTest {
    private Movimentacao instancia = new Movimentacao();
    
   // @Before
    //public void setup(){
    //    instancia.setValor(10);
    //}
    
    @Test
    public void setTipo() {
        final char esperado = 'C';
        instancia.setTipo(esperado);
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
       
    }
    @Test 
    public void setValorNegativo() {
        final double invalido = -100;
        try{
        instancia.setValor(invalido);
        }catch(IllegalArgumentException e){}
        final double obtido = instancia.getValor();
        assertNotEquals(invalido, obtido,0.0001);
        
    }
    @Test 
    public void setValorPositivo() {
        final double esperado = 100;
        instancia.setValor(esperado);
        final double obtido = instancia.getValor();
        assertEquals(esperado, obtido,0.0001);
        
    }
    
    @Test
     public void setTipoMinusclo() {
        final char esperado = 'c';
        instancia.setTipo(esperado);
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
               instancia.setConfirmada(true);
        
    }
     
     @Test(expected = IllegalArgumentException.class)
    public void setTipoInvalidoExecao() {
        final char invalido = 'x';
        instancia.setTipo(invalido);
  
    }
    
    @Test
    public void instanciarMovimentacaocomoNaoConfirmada() {
        assertFalse(instancia.isConfirmada());
    }
    
    public static void main(String[] args){
        MovimentacaoTest movimentacaoTest= new MovimentacaoTest();
        movimentacaoTest.setTipoMinusclo();
        movimentacaoTest.instanciarMovimentacaocomoNaoConfirmada();
    }
}