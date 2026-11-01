package model;

public class BmiModel {
    private double berat;
    private double tinggi;

    public BmiModel(double berat, double tinggi) {
        this.berat = berat;
        this.tinggi = tinggi;
    }
    
    public double hitung () {
        return berat / ((tinggi / 100) * (tinggi / 100));
    }
    
    public String kategori (double hitung){
        if (hitung < 18.5){
            return "Kekurangan berat badan (underweight)";
        }
        else if (hitung < 25){
            return "Berat badan normal / ideal";
        }
        else if (hitung < 30){
            return "Kelebihan berat badan (overweight)";
        }
        else {
            return "Obesitas";
        }
    }
}
