package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;
import static java.awt.Toolkit.getDefaultToolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        Toolkit tk = getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do seu sistema é: "+d.width +" X "+d.height);
    }   
}