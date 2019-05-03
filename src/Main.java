import javax.swing.*;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) throws Exception {
        JFrame a = new JFrame();

        a.setSize(800, 600);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        a.add(new Frame(300,300,10,300));


    }
}
