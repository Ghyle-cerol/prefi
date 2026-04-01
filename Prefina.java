import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prefina extends JFrame{
    private JTextField Debtor;
    private JTextField ADD;
    private JTextField MOB;
    private JTextField EMA;
    private JTextField OC;
    private JButton proceedButton;
    private JTextField CIV;
    private JTextField POS;
    private JTextField MON;
    private JTextField CRED;
    private JPanel Pan;

    public Prefina() {
        setContentPane(Pan);
        setTitle("LOAN MANAGEMENT SYSTEM ");
        setSize(900, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        proceedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CalcuLoan().setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Prefina();
    }
}
