package org.example;

public interface EncryptionAlgorithm
{
    String encrypt(String data);
    String decrypt(String data);
}
