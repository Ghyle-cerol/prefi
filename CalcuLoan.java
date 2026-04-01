import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcuLoan extends JFrame  {
    private JTextField Tras;
    private JTextField Amout;
    private JTextField ADD;
    private JTextField Date;
    private JTextField Bracnh;
    private JTextField Phone;
    private JButton proceedButton;
    private JTextField Bloodymarry;
    private JTextField Interst;
    private JTextField Amihtfoan;
    private JPanel Psnr;
    private JTextField DWEEZ;
    private JLabel TOTT;

    public CalcuLoan() {
        setContentPane(Psnr);
        setTitle("LOAN MANAGEMENT SYSTEM ");
        setSize(900, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        proceedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add();
String amount = Amihtfoan.getText();
String interst = Interst.getText();
String Period = Bloodymarry.getText();
                JOptionPane.showMessageDialog(CalcuLoan.this,"TOTAL: " + TOTT.getText());
            }
        });
    }
    public void add(){
        double Amo = Double.parseDouble(Amihtfoan.getText());
        double inter = Double.parseDouble(Interst.getText());
        double Peri = Double.parseDouble(Bloodymarry.getText());
        double tot = inter / 100;
        double tots = Peri * tot;
double TOTA = Amo / tots;
TOTT.setText(String.valueOf(TOTA));
    }
}
