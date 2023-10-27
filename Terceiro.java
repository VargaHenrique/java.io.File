/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade2610;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Username
 */
public class Terceiro {
    public static void main(String[] args) {
        File arquivoTxt = new
        File("C\\AULACelso\\novoArquivo.txt");
        
         try {
            Scanner leitorArquivo = new Scanner(arquivoTxt);
            
            if (arquivoTxt.exists()) {
                while (leitorArquivo.hasNextLine()) {
                    String linhaArquivo = leitorArquivo.nextLine();
                    System.out.println(linhaArquivo);
                }
                leitorArquivo.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao ler o arquivo. Arquivo não encontrado.");
        } catch (Exception e) {
            System.out.println("Erro desconhecido: " + e.getMessage());
        }
    }
}


