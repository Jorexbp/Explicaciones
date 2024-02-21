package windowbuilder;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botones extends JFrame {
    public Botones() {
        setTitle("Ejemplo del JButton");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton button = new JButton("Pínchame!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.out.println("Boton pinchado");
            }
        });

        JPanel panel = new JPanel();
        panel.add(button);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
       Botones frame = new Botones();
    }
}
