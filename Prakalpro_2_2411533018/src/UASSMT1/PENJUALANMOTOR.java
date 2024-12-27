package UASSMT1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PENJUALANMOTOR {

    public static void main(String[] args) {
        boolean ulang;
        do {
            ulang = jalankanAplikasi();
        } while (ulang);
    }

    /**
     * @wbp.parser.entryPoint
     */
    public static boolean jalankanAplikasi() {
        // Frame utama
        JFrame frame = new JFrame("Aplikasi Penjualan Motor");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Nama Pembeli
        JLabel labelNama = new JLabel("NAMA PEMBELI");
        labelNama.setBounds(20, 20, 150, 20);
        frame.getContentPane().add(labelNama);

        JTextField fieldNama = new JTextField();
        fieldNama.setBounds(180, 20, 200, 20);
        frame.getContentPane().add(fieldNama);

        // Data Motor
        JLabel labelDataMotor = new JLabel("DATA MOTOR");
        labelDataMotor.setBounds(20, 60, 150, 20);
        frame.getContentPane().add(labelDataMotor);

        JLabel labelMerk = new JLabel("MERK MOTOR");
        labelMerk.setBounds(20, 100, 150, 20);
        frame.getContentPane().add(labelMerk);

        String[] merkMotor = {"HONDA", "YAMAHA", "SUZUKI"};
        JComboBox<String> comboMerk = new JComboBox<>(merkMotor);
        comboMerk.setBounds(180, 100, 200, 20);
        frame.getContentPane().add(comboMerk);

        JLabel labelJenis = new JLabel("JENIS MOTOR");
        labelJenis.setBounds(20, 140, 150, 20);
        frame.getContentPane().add(labelJenis);

        JRadioButton rbBebek = new JRadioButton("BEBEK");
        rbBebek.setBounds(180, 140, 70, 20);
        frame.getContentPane().add(rbBebek);

        JRadioButton rbSport = new JRadioButton("SPORT");
        rbSport.setBounds(250, 140, 70, 20);
        frame.getContentPane().add(rbSport);

        JRadioButton rbMatik = new JRadioButton("MATIK");
        rbMatik.setBounds(320, 140, 70, 20);
        frame.getContentPane().add(rbMatik);

        ButtonGroup jenisGroup = new ButtonGroup();
        jenisGroup.add(rbBebek);
        jenisGroup.add(rbSport);
        jenisGroup.add(rbMatik);

        JLabel labelHarga = new JLabel("HARGA");
        labelHarga.setBounds(20, 180, 150, 20);
        frame.getContentPane().add(labelHarga);

        JTextField fieldHarga = new JTextField();
        fieldHarga.setBounds(180, 180, 200, 20);
        fieldHarga.setEditable(false);
        frame.getContentPane().add(fieldHarga);

        // Pembayaran
        JLabel labelPembayaran = new JLabel("PEMBAYARAN");
        labelPembayaran.setBounds(20, 220, 150, 20);
        frame.getContentPane().add(labelPembayaran);

        String[] pembayaran = {"TUNAI", "CICILAN"};
        JComboBox<String> comboPembayaran = new JComboBox<>(pembayaran);
        comboPembayaran.setBounds(180, 220, 200, 20);
        frame.getContentPane().add(comboPembayaran);

        JButton buttonHitung = new JButton("HITUNG");
        buttonHitung.setBounds(180, 260, 100, 30);
        frame.getContentPane().add(buttonHitung);

        // Output
        JLabel labelHargaMotor = new JLabel("HARGA MOTOR");
        labelHargaMotor.setBounds(20, 310, 150, 20);
        frame.getContentPane().add(labelHargaMotor);

        JTextField fieldHargaMotor = new JTextField();
        fieldHargaMotor.setBounds(180, 310, 200, 20);
        fieldHargaMotor.setEditable(false);
        frame.getContentPane().add(fieldHargaMotor);

        JLabel labelDiskon = new JLabel("DISKON");
        labelDiskon.setBounds(20, 350, 150, 20);
        frame.getContentPane().add(labelDiskon);

        JTextField fieldDiskon = new JTextField();
        fieldDiskon.setBounds(180, 350, 200, 20);
        fieldDiskon.setEditable(false);
        frame.getContentPane().add(fieldDiskon);

        JLabel labelTotal = new JLabel("TOTAL BAYAR");
        labelTotal.setBounds(20, 390, 150, 20);
        frame.getContentPane().add(labelTotal);

        JTextField fieldTotal = new JTextField();
        fieldTotal.setBounds(180, 390, 200, 20);
        fieldTotal.setEditable(false);
        frame.getContentPane().add(fieldTotal);

        JButton buttonHitungLagi = new JButton("HITUNG LAGI");
        buttonHitungLagi.setBounds(100, 450, 130, 30);
        frame.getContentPane().add(buttonHitungLagi);

        JButton buttonSelesai = new JButton("SELESAI");
        buttonSelesai.setBounds(250, 450, 130, 30);
        frame.getContentPane().add(buttonSelesai);

        // Event Handling
        buttonHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String merk = (String) comboMerk.getSelectedItem();
                String jenis = "";

                if (rbBebek.isSelected()) {
                    jenis = "BEBEK";
                } else if (rbSport.isSelected()) {
                    jenis = "SPORT";
                } else if (rbMatik.isSelected()) {
                    jenis = "MATIK";
                }

                int harga = 0;
                if (merk.equals("HONDA")) {
                    if (jenis.equals("BEBEK")) harga = 15000000;
                    else if (jenis.equals("SPORT")) harga = 25000000;
                    else if (jenis.equals("MATIK")) harga = 20000000;
                } else if (merk.equals("YAMAHA")) {
                    if (jenis.equals("BEBEK")) harga = 14000000;
                    else if (jenis.equals("SPORT")) harga = 24000000;
                    else if (jenis.equals("MATIK")) harga = 19000000;
                } else if (merk.equals("SUZUKI")) {
                    if (jenis.equals("BEBEK")) harga = 13000000;
                    else if (jenis.equals("SPORT")) harga = 23000000;
                    else if (jenis.equals("MATIK")) harga = 18000000;
                }

                fieldHarga.setText(String.valueOf(harga));

                int diskon = (comboPembayaran.getSelectedItem().equals("TUNAI")) ? 500000 : 0;
                int total = harga - diskon;

                fieldHargaMotor.setText(String.valueOf(harga));
                fieldDiskon.setText(String.valueOf(diskon));
                fieldTotal.setText(String.valueOf(total));
            }
        });

        buttonHitungLagi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldNama.setText("");
                jenisGroup.clearSelection();
                fieldHarga.setText("");
                fieldHargaMotor.setText("");
                fieldDiskon.setText("");
                fieldTotal.setText("");
            }
        });

        buttonSelesai.addActionListener(e -> {
            frame.dispose();
        });

        frame.setVisible(true);

        // Tunggu hingga frame ditutup
        while (frame.isVisible()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        int pilihan = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin menjalankan aplikasi lagi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        return pilihan == JOptionPane.YES_OPTION;
    }
}
