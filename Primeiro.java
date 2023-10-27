/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade2610;

import java.io.File;

/**
 *
 * @author Username
 */
public class Primeiro {
    
    public static void main(String[] args) {
        File arquivoTxt = new
        File("C\\AULACelso\\novoArquivo.txt"); 
        
        try{
        if(arquivoTxt.createNewFile() ){
            System.out.println("Arquivo criado");
        }else{
            System.out.println("Arquivo não criado");
        }
        
        }catch(Exception e){
            System.out.println("Item com erro"); 
        }
    }
}
