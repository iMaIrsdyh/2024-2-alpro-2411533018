package pekan7;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Aritmatika {

    private JFrame frame;
    private JTextField Angka1;
    private JTextField Angka2;
    private JLabel lblNewLabel_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Aritmatika window = new Aritmatika();
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
    public Aritmatika() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 187, 289);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // TextField untuk input A
        Angka1 = new JTextField();
        Angka1.setBounds(49, 57, 86, 20);
        frame.getContentPane().add(Angka1);
        Angka1.setColumns(10);

        // ComboBox untuk memilih operasi
        JComboBox<String> Pilihan = new JComboBox<>();
        Pilihan.addItem("Penjumlahan");
        Pilihan.addItem("Pengurangan");
        Pilihan.addItem("Perkalian");
        Pilihan.addItem("Pembagian");
        Pilihan.addItem("Sisa Bagi");
        Pilihan.setBounds(38, 97, 107, 22);
        frame.getContentPane().add(Pilihan);

        // TextField untuk input B
        Angka2 = new JTextField();
        Angka2.setBounds(49, 138, 86, 20);
        frame.getContentPane().add(Angka2);
        Angka2.setColumns(10);

        // Label untuk menampilkan hasil
        JLabel lblNewLabel = new JLabel(" ");
        lblNewLabel.setBounds(38, 208, 107, 21);
        frame.getContentPane().add(lblNewLabel);

        // Button untuk proses
        JButton btnNewButton = new JButton("Proses");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Mengambil input
                    int inputA = Integer.parseInt(Angka1.getText());
                    int inputB = Integer.parseInt(Angka2.getText());
                    String operasi = (String) Pilihan.getSelectedItem();

                    int hasil = 0;

                    // Melakukan operasi berdasarkan pilihan
                    switch (operasi) {
                        case "Penjumlahan":
                            hasil = inputA + inputB;
                            break;
                        case "Pengurangan":
                            hasil = inputA - inputB;
                            break;
                        case "Pembagian":
                            if (inputB != 0) {
                                hasil = inputA / inputB;
                            } else {
                                lblNewLabel.setText("Tidak bisa membagi dengan nol!");
                                return;
                            }
                            break;
                        case "Perkalian":
                            hasil = inputA * inputB;
                            break;
                        case "Sisa Bagi":
                            if (inputB != 0) {
                                hasil = inputA % inputB;
                            } else {
                                lblNewLabel.setText(" Tidak bisa membagi dengan nol!");
                                return;
                            }
                            break;
                        default:
                            lblNewLabel.setText(" Operasi tidak dikenal!");
                            return;
                    }

                    // Menampilkan hasil
                    lblNewLabel.setText(" " + hasil);
                } catch (NumberFormatException ex) {
                    lblNewLabel.setText("Input tidak valid!");
                }
            }
        });
        btnNewButton.setBounds(49, 168, 86, 23);
        frame.getContentPane().add(btnNewButton);
        
        lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setBounds(67, 34, 45, 13);
        frame.getContentPane().add(lblNewLabel_1);
    }
}