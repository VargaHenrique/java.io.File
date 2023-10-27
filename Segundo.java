/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade2610;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Username
 */
public class Segundo {
    public static void main(String[] args) {
        File arquivoTxt = new
            File("C\\AULACelso\\novoArquivo.txt");
        
        try{
        FileWriter escrever = new FileWriter
        ("C\\AULACelso\\novoArquivo.txt");        
          escrever.write("aaaa");
          escrever.close();
        }catch(IOException e){
            System.out.println("Arquivo não modificado");
        }
    }
}
