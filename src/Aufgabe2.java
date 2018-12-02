import javax.swing.*;

public class Aufgabe2
{


    public static void partialString(String a)
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


    public static void main(String[]args)
    {
        {
        partialString(JOptionPane.showInputDialog("Geben Sie ein Wort ein"));
        }

    }

}
