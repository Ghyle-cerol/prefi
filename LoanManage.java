import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoanManage extends JFrame {
    private JButton OKButton;
    private JTextField in;
    private JTextField to;
    private JTextField du;
    private JTextField da;
    private JTextField day;
    private JPanel pn;
    private JTextField deb;

    public LoanManage() {
        setContentPane(pn);
        setTitle("LOAN MANAGEMENT SYSTEM ");
        setSize(700, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String debt = deb.getText();



            }
        });
    }
}
