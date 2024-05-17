package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> mahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        int count = 1;

        while (true) {
            System.out.print("Masukkan nama mahasiswa ke- " + count + ":");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            try {
                if (input.trim().isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong!");
                }
                mahasiswa.add(input);
                count++;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\nDaftar nama mahasiswa:");
        for (int i = 0; i < mahasiswa.size(); i++) {
            System.out.println("Nama ke-" + (i + 1) + ": " + mahasiswa.get(i));
        }
    }
}
