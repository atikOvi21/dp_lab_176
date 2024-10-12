package org.example;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Algo+!");
        System.out.println("Please enter the any number: 1.AES; 2.DES; 3.CaesarCipher");
        int num1 = scanner.nextInt();

        int shift=0;
        if(num1==3)
        {
            System.out.println("Enter a shift number!");
            shift = scanner.nextInt();
        }
        else if( num1!=1 || num1!=2 )
        {
            System.out.println("Invalid Choice!");

        }
        EncryptionAlgorithm encryption = EncryptionFactory.getEncryptionAlgorithm(num1,shift);



        System.out.println("Please enter the File path:");
        String path = scanner.nextLine();

        System.out.println("Enter output file path:");
        String outputFilePath = scanner.nextLine();


        String inputFile = FileHandler.readFile(path);
        String encryptedContent = encryption.encrypt(inputFile);

        //result
        FileHandler.writeFile(outputFilePath, encryptedContent);

        System.out.println("Saved to " + outputFilePath);


        scanner.close();

    }
}