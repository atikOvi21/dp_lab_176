package org.example;

public class CaesarCipher implements EncryptionAlgorithm
{
    private  int Shift;

    public CaesarCipher(int shift)
    {
        this.Shift = shift;
    }


    public int getShift()
    {
        return Shift;
    }

    public void setShift(int shift)
    {
        Shift = shift;
    }

    public String encrypt(String data)
    {
        String x = null;
        return x;
    }

    public String decrypt(String data)
    {
        String x = null;
        return x;
    }
}
