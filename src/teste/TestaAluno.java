/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import aula_01.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.oening
 */
public class TestaAluno {
    
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
        String sobrenome = JOptionPane.showInputDialog("Digite o sobrenome do aluno");
        aluno.setNome(nome);
        aluno.setSobrenome(sobrenome);
        
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Sobrenome: " + aluno.getSobrenome());
         
        
//        aluno.sobrenome = JOptionPane.
//                showInputDialog("Digite o sobrenome do aluno");
//        aluno.idade = JOptionPane.showInputDialog("Digite a idade");
//        
//        String salario = JOptionPane.showInputDialog("Digite o salário");
//        aluno.salario = Float.parseFloat(salario);
//        
//        aluno.cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o cpf"));
        
//        JOptionPane.showMessageDialog(null, "Nome: " + aluno.nome +
//                "\nSobrenome: " + aluno.sobrenome + "\nIdade: " + aluno.idade +
//                "\nSalário: " + aluno.salario + "\nCPF: " + aluno.cpf);
        
        
        
        
        
        
        
        
        
        
    }
                
}
