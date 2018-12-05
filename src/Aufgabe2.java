import javax.swing.*;

public class Aufgabe2
{

    public static void main(String[]args)
    {
        {
            partialString(JOptionPane.showInputDialog("Geben Sie ein Wort ein"));
        }

        //Aufgabe 3
        System.out.println(Taschenrechner.addition(8,4));
        System.out.println(Taschenrechner.subtraktion(6,2));
        System.out.println(Taschenrechner.division(4, 2));
        System.out.println(Taschenrechner.multiplikation(5, 3));

        System.out.println(Taschenrechner.addition(15, 5.5));
        System.out.println(Taschenrechner.subtraktion(10,4.5));
        System.out.println(Taschenrechner.division(5, 2.5));
        System.out.println(Taschenrechner.multiplikation(3, 2.5));
    }


    private static void partialString(String a)
    {
       if (a.length() < 3)
       {
           System.err.println("Zu wenig Zeichen");
       }
       else
       {
           System.out.println(a.substring(a.length()/2));
       }
    }




}
