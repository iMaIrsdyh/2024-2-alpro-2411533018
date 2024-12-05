package pekan8;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class KUIS2 {

    private JFrame frame;
    private JTextField a;
    private JTextField b;
    private JLabel as; 

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	KUIS2 window = new KUIS2();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public KUIS2() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        a = new JTextField();
        a.setBounds(165, 33, 181, 29);
        frame.getContentPane().add(a);
        a.setColumns(10);

        b = new JTextField();
        b.setBounds(165, 72, 181, 29);
        frame.getContentPane().add(b);
        b.setColumns(10);

        JComboBox<String> co = new JComboBox<>();
        co.addItem("YA");
        co.addItem("TIDAK");
        co.setBounds(165, 122, 181, 22);
        frame.getContentPane().add(co);

        as = new JLabel(""); 
        as.setBounds(74, 207, 272, 46);
        frame.getContentPane().add(as);

        JButton btnNewButton = new JButton("Proses");
        btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String input1 = a.getText();
                    int input2 = Integer.parseInt(b.getText());
                    String ase = (String) co.getSelectedItem();
                    int qq= input2;
                    if(qq >= 17 && ase.equals("YA") ) {
                    	   as.setText(input1 +" Anda sudah dewasa dan boleh bawa motor");
                       }else if(qq >= 17 && ase.equals("TIDAK") ) {
                    	   as.setText(input1 +" Anda sudah dewasa tetapi tidak boleh bawa motor");
                       }else if(qq < 17 && ase.equals("YA") ) {
                    	   as.setText(input1 +" Anda belum cukup umur bawa motor");
                       }else if (qq < 17 && ase.equals("TIDAK") ) {
                    	   as.setText(input1 +" Anda belum cukup umur punya SIM");
                       }
                } catch (Exception ex) {
                    as.setText("Terjadi kesalahan saat memproses data.");
                }
            }
        });
        btnNewButton.setBounds(74, 154, 110, 39);
        frame.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("RESET\r\n");
        btnNewButton_1.setForeground(new Color(255, 0, 0));
        btnNewButton_1.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a.setText("");
                b.setText("");
                co.setSelectedIndex(0);
                as.setText("");
            }
        });
        btnNewButton_1.setBounds(263, 151, 110, 39);
        frame.getContentPane().add(btnNewButton_1);

        JLabel lblNewLabel_1 = new JLabel("NAMA\r\n");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(38, 35, 46, 14);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("UMUR\r\n");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_2.setBounds(38, 74, 46, 14);
        frame.getContentPane().add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("SIM C");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_3.setBounds(38, 126, 46, 14);
        frame.getContentPane().add(lblNewLabel_3);
        
        JLabel lblNewLabel = new JLabel("APLIKASI RAZIA MOTOR ONLINE");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel.setLabelFor(frame);
        lblNewLabel.setBounds(90, 10, 336, 13);
        frame.getContentPane().add(lblNewLabel);
    }
}