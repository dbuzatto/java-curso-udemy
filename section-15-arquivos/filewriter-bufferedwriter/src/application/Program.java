package application;

import java.io.*;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "/Users/diogobuzatto/Downloads/out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { //o true no FileWriter serve para não recriar e sim acrescentar

            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
