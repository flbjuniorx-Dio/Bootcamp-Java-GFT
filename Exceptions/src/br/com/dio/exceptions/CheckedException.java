package br.com.dio.exceptions;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        
        String nomeDoArquivo = "romance-blake-crouch.txt";

        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado! Entre em contato com o suporte! " + e.getCause(), "Erro inesperado");
            e.printStackTrace();
        }

    }

    public static void imprimirArquivoNoConsole() {
        File file = new file(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));

    }
}