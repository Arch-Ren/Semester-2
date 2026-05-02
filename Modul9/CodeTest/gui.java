package Modul9.CodeTest;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;

public class gui extends JFrame {
    JMenuBar mb = new JMenuBar(); // navbar paling atas

    JMenu file = new JMenu("File"); // menu file
    JMenu edit = new JMenu("Edit"); // menu edit
    JMenu help = new JMenu("Help"); // menu help

    JMenuItem open = new JMenuItem("Open"); // item pilihan open
    JMenuItem close = new JMenuItem("Close"); // item pilihan close
    JMenuItem quit = new JMenuItem("Quit"); // item pilihan quit
    JMenuItem about = new JMenuItem("About"); // item pilihan about
    JMenuItem copy = new JMenuItem("Copy"); // item pilihan copy
    JMenuItem paste = new JMenuItem("Paste"); // item pilihan paste
    JMenuItem cut = new JMenuItem("Cut"); // item pilihan cut

    JLabel lblnama = new JLabel("Nama"); // label nama
    JTextField txnama = new JTextField(30); // text field nama

    JLabel lblnim = new JLabel("NIM"); // label nim
    JTextField txnim = new JTextField(7); // text field nim

    JLabel lblkelamin = new JLabel("Jenis Kelamin"); // label jenis kelamin
    JRadioButton pria = new JRadioButton("Pria"); // radio button pria
    JRadioButton wanita = new JRadioButton("Wanita"); // radio button wanita
    ButtonGroup kelompok = new ButtonGroup(); // button group untuk radio button

    JLabel lblhobi = new JLabel("Hobi"); // label hobi
    JCheckBox baca = new JCheckBox("shoping"); // check box shoping
    JCheckBox mancing = new JCheckBox("Futsal"); // check box futsal
    JCheckBox jalan = new JCheckBox("musik"); // check box musik

    JLabel label1 = new JLabel("Nilai UTS"); // label nilai UTS
    JTextField tx1 = new JTextField(20); // text field nilai UTS

    JLabel label2 = new JLabel("Nilai UAS"); // label nilai UAS
    JTextField tx2 = new JTextField(20); // text field nilai UAS

    JButton cetak = new JButton("Cetak"); // button cetak
    JTextArea hasil = new JTextArea(); // text area hasil cetak
    JScrollPane scroll = new JScrollPane(hasil); // scroll pane untuk hasil. hasil langsung masuk di scroll

    gui() {
        setTitle("DATA MAHASISWA");
        setLocation(0, 0);
        setSize(300, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void KomponenVisual() {
        setJMenuBar(mb); // pasang navbar diatas
        mb.add(file); // tambah item file di menubar
        mb.add(edit); // tambah item edit di menubar
        mb.add(help); // tambah item help di menubar
        file.add(open); // tambah item open di menu file
        file.add(close); // tambah item close di menu file
        edit.add(copy); // tambah item copy di menu edit
        edit.add(paste); // tambah item paste di menu edit
        edit.add(cut); // tambah item cut di menu edit
        close.setEnabled(false); // membuat item close tidak dapat digunakan
        file.add(quit); // tambah item quit di menu file
        help.add(about); // tambah item about di menu help
        setVisible(true);

        getContentPane().setLayout(null); // posisi elemen absolut

        getContentPane().add(lblnama); // menambahkan label nama
        lblnama.setBounds(10, 10, 80, 20); // posisi label nama (x, y, lebar, tinggi)
        getContentPane().add(txnama); // menambahkan text field nama
        txnama.setBounds(105, 10, 175, 20); // posisi text field nama (x, y, lebar, tinggi)

        getContentPane().add(lblnim); // menambahkan label nim
        lblnim.setBounds(10, 33, 80, 20); // posisi label nim (x, y, lebar, tinggi)
        getContentPane().add(txnim); // menambahkan text field nim
        txnim.setBounds(105, 33, 70, 20); // posisi text field nim (x, y, lebar, tinggi)

        getContentPane().add(lblkelamin); // menambahkan label jenis kelamin
        lblkelamin.setBounds(10, 56, 80, 20); // posisi label jenis kelamin (x, y, lebar, tinggi)

        kelompok.add(pria); // menambahkan radio button pria
        kelompok.add(wanita); // menambahkan radio button wanita
        getContentPane().add(pria); // menambahkan radio button pria ke frame
        pria.setBounds(105, 56, 50, 20); // posisi radio button pria (x, y, lebar, tinggi)
        getContentPane().add(wanita); // menambahkan radio button wanita ke frame
        wanita.setBounds(160, 56, 70, 20); // posisi radio button wanita (x, y, lebar, tinggi)

        getContentPane().add(lblhobi); // menambahkan label hobi
        lblhobi.setBounds(10, 80, 70, 20); // posisi label hobi (x, y, lebar, tinggi)
        getContentPane().add(baca); // menambahkan check box shoping
        baca.setBounds(105, 80, 100, 20); // posisi check box shoping (x, y, lebar, tinggi)
        getContentPane().add(mancing); // menambahkan check box futsal
        mancing.setBounds(105, 103, 100, 20); // posisi check box futsal (x, y, lebar, tinggi)
        getContentPane().add(jalan); // menambahkan check box musik
        jalan.setBounds(105, 126, 100, 20); // posisi check box musik (x, y, lebar, tinggi)

        getContentPane().add(label1); // menambahkan label nilai UTS
        label1.setBounds(10, 146, 80, 20); // posisi label nilai UTS (x, y, lebar, tinggi)
        getContentPane().add(tx1); // menambahkan text field nilai UTS
        tx1.setBounds(105, 146, 175, 20); // posisi text field nilai UTS (x, y, lebar, tinggi)

        getContentPane().add(label2); // menambahkan label nilai UAS
        label2.setBounds(10, 169, 80, 20); // posisi label nilai UAS (x, y, lebar, tinggi)
        getContentPane().add(tx2); // menambahkan text field nilai UAS
        tx2.setBounds(105, 169, 175, 20); // posisi text field nilai UAS (x, y, lebar, tinggi)

        getContentPane().add(cetak); // menambahkan button cetak
        cetak.setBounds(10, 191, 270, 20); // posisi button cetak (x, y, lebar, tinggi)

        scroll.setBounds(10, 214, 270, 140);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        getContentPane().add(scroll);
        setVisible(true);
    }

    void AksiReaksi() {
        cetak.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                hasil.append(lblnama.getText() + " : " + txnama.getText() + "\n"); // cetak nama
                hasil.append(lblnim.getText() + " : " + txnim.getText() + "\n"); // cetak NIM

                // cetak jenis kelamin
                if (pria.isSelected() == true) {
                    hasil.append(lblkelamin.getText() + " : " + pria.getText() + "\n");
                } else if (wanita.isSelected() == true) {
                    hasil.append(lblkelamin.getText() + ": " + wanita.getText() + "\n");
                } else {
                    hasil.append(lblkelamin.getText() + ": " + "Dirahasiakan" + "\n");
                }

                // cetak hobi
                if (baca.isSelected() == true) {
                    hasil.append(lblhobi.getText() + " : " + baca.getText() + "\n");
                }
                if (mancing.isSelected() == true) {
                    hasil.append(lblhobi.getText() + " : " + mancing.getText() + "\n");
                }
                if (jalan.isSelected() == true) {
                    hasil.append(lblhobi.getText() + " : " + jalan.getText() + "\n");
                }
                if (baca.isSelected() == false && mancing.isSelected() == false && jalan.isSelected() == false) {
                    hasil.append(lblhobi.getText() + " : " + "Tidak Memilih Hobi" + "\n");
                }

                // cetak hasil
                hasil.append(label1.getText() + " : " + tx1.getText() + "\n");
                hasil.append(label2.getText() + " : " + tx2.getText() + "\n");

                // hitung nilai akhir
                double a = 0.0, b = 0.0, c = 0.0;
                try {
                    a = Double.parseDouble(tx1.getText());
                    b = Double.parseDouble(tx2.getText());
                } catch (NumberFormatException nfe) { // catch error input bukan angka
                    nfe.printStackTrace();
                }

                // event button cetak hitung nilai akhir
                JButton btn = (JButton) event.getSource();
                if (btn == cetak) {
                    c = ((a + b) / 2);
                }
                hasil.append(new String().valueOf("NIlai Akhir " + c + "\n"));
            }
        });
    }

    public static void main(String args[]) {
        gui e5 = new gui();
        e5.KomponenVisual();
        e5.AksiReaksi();
    }
}
