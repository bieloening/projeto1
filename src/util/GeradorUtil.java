/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author gabriel.oening
 */
public class GeradorUtil {
  
  public double gerarSalario(){
       int numero = (int) (Math.random() * 100000);
      return numero;
  } 
  
    public static void main(String[] args) {
       GeradorUtil objetoDessaClasse = new GeradorUtil();
       System.out.println("salário: " + objetoDessaClasse.gerarSalario());
    
    }
}
