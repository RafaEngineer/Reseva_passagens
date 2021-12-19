/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Rafael
 */
class Passageiro {
    
    private String nome;
    private String cpf;

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

   
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void Passageiro(String a, String b){
        
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
