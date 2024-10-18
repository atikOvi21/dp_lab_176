package org.example;

public class EncryptionFactory
{
    public static EncryptionAlgorithm getEncryptionAlgorithm(int algorithm ,int shift) throws Exception
    {
        switch (algorithm)
        {
            case 1:
                return new AES();
            case 2:
                return new DES();
            case 3:

                return new CaesarCipher(shift);

            default:
                throw new IllegalArgumentException("Invalid encryption algorithm selected.");
        }
    }
}
