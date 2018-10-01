/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan19_saldotabungan;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi : Membuat Program Saldo Tabungan
 */
public class PBO3_10117109_Latihan19_SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Saldo = 2500000;
	int Bulan = 0;
	double Bunga = 0.15;
	double Bunga1;

	for (Bulan = 1; Bulan <= 6; Bulan++) {
	    Bunga1 = Saldo * Bunga;
	    Saldo = (int) (Saldo + Bunga1);
        System.out.println("Saldo di bulan ke - " +Bulan+ " Rp. " +Saldo);

    }
    }
    
}
