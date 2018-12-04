import javax.swing.*;

public class Aufruf
{
    public static void main (String[]args)
    {
        Vehicle karre1 = new Vehicle();
        karre1.power = 11;
        karre1.weight =  1000;
        karre1.name = "VW Polo";

        Vehicle karre2 = new Vehicle();
        karre2.power = 17;
        karre2.weight =  1800;
        karre2.name = "Fiat Multipla";

        JOptionPane.showMessageDialog(null, karre1.printName());
        JOptionPane.showMessageDialog(null, karre2.printName());

        karre1.calculatePower();
        karre2.calculatePower();
    }
}
