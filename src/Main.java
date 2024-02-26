import java.util.Scanner;

public class Main {

    private static final String[] daftarSiswa = { "202310370311142", "24032005" };
    private static final String usernameAdmin = "sutap";
    private static final String passwordAdmin = "abdi24";
    private static int indeksSiswa = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            tampilkanMenu();
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    loginSiswa(scanner);
                    break;
                case 2:
                    loginAdmin(scanner);
                    break;
                case 3:
                    System.out.println("Anda telah Logout");
                    loop = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static void tampilkanMenu() {
        System.out.println("1. Login Siswa");
        System.out.println("2. Login Admin");
        System.out.println("3. Keluar");
        System.out.print("Masukkan pilihan Anda: ");
    }

    private static void loginSiswa(Scanner scanner) {
        System.out.print("Masukkan NIM Anda: ");
        String nim = scanner.next();

        boolean ditemukan = false;
        for (int i = 0; i < daftarSiswa.length; i++) {
            if (daftarSiswa[i].equals(nim)) {
                indeksSiswa = i;
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("NIM tidak ditemukan!");
        }
    }

    private static void loginAdmin(Scanner scanner) {
        System.out.print("Masukkan username: ");
        String username = scanner.next();
        System.out.print("Masukkan password: ");
        String password = scanner.next();

        if (username.equals(usernameAdmin) && password.equals(passwordAdmin)) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Username atau password tidak valid!");
        }
    }
}