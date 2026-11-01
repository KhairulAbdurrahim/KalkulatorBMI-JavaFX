package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.BmiModel; // Memanggil model yang sudah kita buat sebelumnya

public class BmiController {

    @FXML
    private TextField txtBerat;

    @FXML
    private TextField txtTinggi;

    @FXML
    private Button btnHitung;

    @FXML
    private Label lblHasil;

    @FXML
    private Label lblKategori;

    // Method ini akan dipanggil otomatis saat tombol Hitung diklik
    @FXML
    private void handleHitungButton() {
        try {
            double berat = Double.parseDouble(txtBerat.getText());
            double tinggi = Double.parseDouble(txtTinggi.getText());

            // Validasi: Pastikan berat dan tinggi harus lebih besar dari 0
            if (berat <= 0 || tinggi <= 0) {
                lblHasil.setText("Error: Angka harus lebih dari 0!");
                lblKategori.setText("");
                return; // Hentikan proses jika tidak valid
            }

            BmiModel model = new BmiModel(berat, tinggi);
            double bmi = model.hitung(); // Sesuaikan dengan nama method hitung di modelmu
            String kategori = model.kategori(bmi);

            lblHasil.setText(String.format("BMI: %.2f", bmi));
            lblKategori.setText("Kategori: " + kategori);

        } catch (NumberFormatException e) {
            lblHasil.setText("Masukkan angka yang valid!");
            lblKategori.setText("");
        }
    }
}