package Modul9.Bab9_GUILanjut;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SubmitData extends JFrame {
    JLabel nama = new JLabel("Nama Lengkap");
    JTextField txNama = new JTextField(30);

    JLabel tglLahir = new JLabel("Tanggal Lahir");
    JTextField txTglLahir = new JTextField(30);

    JLabel noDaftar = new JLabel("Nomor Pendaftaran");
    JTextField txNoDaftar = new JTextField(30);

    JLabel noTelp = new JLabel("No. Telp");
    JTextField txNoTelp = new JTextField(30);

    JLabel alamat = new JLabel("Alamat");
    JTextArea txAlamat = new JTextArea(2, 30);

    JLabel email = new JLabel("E-mail");
    JTextField txEmail = new JTextField(30);

    JButton btnSubmit = new JButton("submit");

    SubmitData() {
        setTitle("Form Daftar Ulang Mahasiswa");
        setLocation(0, 0);
        setSize(320, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void KomponenVisual() {
        getContentPane().setLayout(null);

        getContentPane().add(nama);
        nama.setBounds(20, 20, 150, 20);

        getContentPane().add(tglLahir);
        tglLahir.setBounds(20, 50, 150, 20);

        getContentPane().add(noDaftar);
        noDaftar.setBounds(20, 80, 150, 20);

        getContentPane().add(noTelp);
        noTelp.setBounds(20, 110, 150, 20);

        getContentPane().add(alamat);
        alamat.setBounds(20, 140, 150, 40);

        getContentPane().add(email);
        email.setBounds(20, 190, 150, 20);

        getContentPane().add(txNama);
        txNama.setBounds(140, 20, 150, 20);

        getContentPane().add(txTglLahir);
        txTglLahir.setBounds(140, 50, 150, 20);

        getContentPane().add(txNoDaftar);
        txNoDaftar.setBounds(140, 80, 150, 20);

        getContentPane().add(txNoTelp);
        txNoTelp.setBounds(140, 110, 150, 20);

        txAlamat.setLineWrap(true);
        txAlamat.setWrapStyleWord(true);
        JScrollPane scrollAlamat = new JScrollPane(txAlamat);
        scrollAlamat.setBounds(140, 140, 150, 40);
        getContentPane().add(scrollAlamat);

        getContentPane().add(txEmail);
        txEmail.setBounds(140, 190, 150, 20);

        getContentPane().add(btnSubmit);
        btnSubmit.setBounds(200, 230, 75, 20);

        KomponenAction();
        setVisible(true);
    }

    void KomponenAction() {
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // validasi kolom terisi
                    if (txNama.getText().isEmpty() ||
                            txTglLahir.getText().isEmpty() ||
                            txNoDaftar.getText().isEmpty() ||
                            txNoTelp.getText().isEmpty() ||
                            txAlamat.getText().isEmpty() ||
                            txEmail.getText().isEmpty()) {

                        // dialog kolom ada yang belum diisi
                        JOptionPane.showMessageDialog(null,
                                "Semua kolom harus diisi!",
                                "Peringatan",
                                JOptionPane.WARNING_MESSAGE);
                    } else {
                        // dialog konfirmasi
                        int konfirmasi = JOptionPane.showConfirmDialog(null,
                                "Apakah anda yakin data yang Anda isi sudah benar?",
                                "Konfirmasi",
                                JOptionPane.OK_CANCEL_OPTION);

                        if (konfirmasi == JOptionPane.OK_OPTION) {
                            showData(); // cancel langsung menutup dialog pane
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            "Terjadi kesalahan: " + ex.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    void showData() {
        JFrame frameBaru = new JFrame("Data Mahasiswa");
        frameBaru.setSize(320, 320);
        frameBaru.setLocation(100, 100);
        frameBaru.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameBaru.getContentPane().setLayout(null);

        JLabel judul = new JLabel("Data Mahasiswa");
        judul.setFont(new Font("Arial", Font.BOLD, 14));
        judul.setHorizontalAlignment(JLabel.CENTER); // judul di tengah
        judul.setBounds(0, 10, 320, 25); // lebar full frame
        frameBaru.getContentPane().add(judul);

        // Padding string agar titik dua sejajar
        StringBuilder sb = new StringBuilder();
        sb.append("Nama           : ").append(txNama.getText()).append("\n");
        sb.append("Tanggal Lahir  : ").append(txTglLahir.getText()).append("\n");
        sb.append("No.Pendaftaran : ").append(txNoDaftar.getText()).append("\n");
        sb.append("No.Telp        : ").append(txNoTelp.getText()).append("\n");
        sb.append("Alamat         : ").append(txAlamat.getText()).append("\n");
        sb.append("E-mail         : ").append(txEmail.getText()).append("\n");

        JTextArea txData = new JTextArea(sb.toString());
        txData.setFont(new Font("Courier New", Font.PLAIN, 12));
        txData.setEditable(false);
        txData.setOpaque(false);
        txData.setBorder(BorderFactory.createEmptyBorder(5, 8, 5, 8)); // padding dalam

        JScrollPane scrollData = new JScrollPane(txData);
        scrollData.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollData.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollData.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        scrollData.setBounds(20, 40, 260, 200);
        frameBaru.getContentPane().add(scrollData);

        frameBaru.setVisible(true);
    }

    public static void main(String[] args) {
        SubmitData form = new SubmitData();
        form.KomponenVisual();
    }
}
