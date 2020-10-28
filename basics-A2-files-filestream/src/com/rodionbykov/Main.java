package com.rodionbykov;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // try-catch-with-resources syntax for auto-closing resources
        try (
                FileInputStream fileInputStream = new FileInputStream("src/com/rodionbykov/input.txt");
                FileOutputStream fileOutputStream = new FileOutputStream("src/com/rodionbykov/output.txt")
        ) {
            byte[] buffer = new byte[fileInputStream.available()];

            // reads entire buffer.length of bytes from a file and place it into buffer variable
            fileInputStream.read(buffer);

            // writes chunk of buffer.length of bytes from buffer variable to a file
            fileOutputStream.write(buffer);

        }catch(IOException e){
            // have to catch 'checked exception' IOException when Java cannot find a file or cannot read it
            System.out.println(e.toString());
        }

        // old-school try-catch-finally block to close resource after read
        try {
            FileInputStream fileInputStream2 = new FileInputStream("src/com/rodionbykov/input.txt");

            try {
                int i = -1;
                while ((i = fileInputStream2.read()) != -1) {
                    // FileInputStream reads bytes from file, have to convert to Char before use
                    System.out.print((char) i);
                }
            }catch(Exception e){
                System.out.println(e.toString());
            }finally {
                fileInputStream2.close();
            }

        }catch(IOException e){
            System.out.println(e.toString());
        }

    }
}
