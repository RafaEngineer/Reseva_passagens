/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Voo {
    
    private Aviao Aeronave;
    private int nro;
    private String data;
    private String hora;

    public Voo(Aviao Aeronave, int nro, String data, String hora) {
        this.Aeronave = Aeronave;
        this.nro = nro;
        this.data = data;
        this.hora = hora;
    }    

     
    public int getNro() {
        return nro;
    }

 
    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }
    
//    public void Voos(Aviao a,int i, String a, String a){
        
 //   }
}
