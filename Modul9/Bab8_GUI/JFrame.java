package Modul9.Bab8_GUI;

import java.awt.*;
import java.awt.event.*;

public class JFrame extends Frame implements ActionListener, ItemListener {
    Label lbTittle, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txTugas, txKuis, txUTS, txUAS, txHasil;
    CheckboxGroup cbg;
    Checkbox cbASD, cbPemlan, cbMatkomlan, cbProbstat;
    Button btnHitung, btnTampilkan;
    TextArea txaHasilSemua;

    Pemlan pemlan = new Pemlan();
    ASD asd = new ASD();
    Matkomlan matkomlan = new Matkomlan();
    Probstat probstat = new Probstat();

    public JFrame() {
        setLayout(null);
        setTitle("Hitung Nilai Akhir dengan GUI");

        lbTittle = new Label("Hitung Nilai Akhir");
        lbTittle.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbTittle.setBounds(100, 30, 170, 20);
        add(lbTittle);

        cbg = new CheckboxGroup();
        cbASD = new Checkbox("ASD", cbg, false);
        cbASD.setBounds(30, 60, 70, 20);
        add(cbASD);

        cbPemlan = new Checkbox("Pemlan", cbg, false);
        cbPemlan.setBounds(110, 60, 70, 20);
        add(cbPemlan);

        cbMatkomlan = new Checkbox("Matkomlan", cbg, false);
        cbMatkomlan.setBounds(190, 60, 80, 20);
        add(cbMatkomlan);

        cbProbstat = new Checkbox("Probstat", cbg, false);
        cbProbstat.setBounds(280, 60, 80, 20);
        add(cbProbstat);

        lbTugas = new Label("Tugas :");
        lbTugas.setBounds(60, 90, 80, 20);
        add(lbTugas);

        lbKuis = new Label("Kuis :");
        lbKuis.setBounds(60, 120, 80, 20);
        add(lbKuis);

        lbUTS = new Label("UTS :");
        lbUTS.setBounds(60, 150, 80, 20);
        add(lbUTS);

        lbUAS = new Label("UAS :");
        lbUAS.setBounds(60, 180, 80, 20);
        add(lbUAS);

        lbHasil = new Label("Hasil :");
        lbHasil.setBounds(60, 210, 80, 20);
        add(lbHasil);

        txTugas = new TextField();
        txTugas.setBounds(150, 90, 150, 22);
        add(txTugas);

        txKuis = new TextField();
        txKuis.setBounds(150, 120, 150, 22);
        add(txKuis);

        txUTS = new TextField();
        txUTS.setBounds(150, 150, 150, 22);
        add(txUTS);

        txUAS = new TextField();
        txUAS.setBounds(150, 180, 150, 22);
        add(txUAS);

        txHasil = new TextField();
        txHasil.setBounds(150, 210, 150, 22);
        txHasil.setEditable(false);
        add(txHasil);

        btnHitung = new Button("Hitung");
        btnHitung.setBounds(120, 245, 120, 30);
        btnHitung.addActionListener(this);
        add(btnHitung);

        txaHasilSemua = new TextArea("", 6, 30, TextArea.SCROLLBARS_VERTICAL_ONLY);
        txaHasilSemua.setBounds(30, 285, 300, 130);
        txaHasilSemua.setEditable(false);
        add(txaHasilSemua);

        btnTampilkan = new Button("Tampilkan nilai semua matkul");
        btnTampilkan.setBounds(50, 425, 260, 30);
        btnTampilkan.addActionListener(this);
        add(btnTampilkan);

        // ItemListener pada tiap radio button → kosongkan field saat dipilih
        cbASD.addItemListener(this);
        cbPemlan.addItemListener(this);
        cbMatkomlan.addItemListener(this);
        cbProbstat.addItemListener(this);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    // ganti matkul kosongin textfield
    @Override
    public void itemStateChanged(ItemEvent e) {
        txTugas.setText("");
        txKuis.setText("");
        txUTS.setText("");
        txUAS.setText("");
        txHasil.setText("");
    }

    // ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnHitung) {
            try {
                double tugas = Double.parseDouble(txTugas.getText().trim());
                double kuis = Double.parseDouble(txKuis.getText().trim());
                double uts = Double.parseDouble(txUTS.getText().trim());
                double uas = Double.parseDouble(txUAS.getText().trim());

                // Cek matkul
                Checkbox selected = cbg.getSelectedCheckbox();
                MataKuliah mk = null;

                if (selected == cbASD) {
                    mk = asd;
                } else if (selected == cbPemlan) {
                    mk = pemlan;
                } else if (selected == cbMatkomlan) {
                    mk = matkomlan;
                } else if (selected == cbProbstat) {
                    mk = probstat;
                }

                if (mk != null) {
                    mk.setNilai(tugas, kuis, uts, uas);
                    double hasil = mk.hitungNilaiAkhir();
                    txHasil.setText(String.valueOf(hasil));
                }

            } catch (NumberFormatException ex) {
                txHasil.setText("Input tidak valid!");
            }

        } else if (e.getSource() == btnTampilkan) {
            StringBuilder sb = new StringBuilder();
            sb.append("HASIL NILAI SEMUA MATA KULIAH\n\n");

            if (pemlan.getNilaiAkhir() > 0)
                sb.append("Pemlan\t\t: " + pemlan.getNilaiAkhir() + "\n");
            if (asd.getNilaiAkhir() > 0)
                sb.append("ASD\t\t: " + asd.getNilaiAkhir() + "\n");
            if (matkomlan.getNilaiAkhir() > 0)
                sb.append("Matkomlan\t: " + matkomlan.getNilaiAkhir() + "\n");
            if (probstat.getNilaiAkhir() > 0)
                sb.append("Probstat\t\t: " + probstat.getNilaiAkhir() + "\n");

            if (sb.toString().equals("HASIL NILAI SEMUA MATA KULIAH\n\n")) {
                sb.append("Belum ada nilai yang dihitung.");
            }

            txaHasilSemua.setText(sb.toString());
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(370, 480);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
