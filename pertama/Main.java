package pertama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User usr = new User();
        System.out.println("Masukkan id: ");
        usr.setid(sc.nextFloat());
        sc.nextLine();

        System.out.println("Masukkan password: ");
        usr.setpas(sc.nextLine());

        System.out.println("==============================");
        System.out.println("Id: " + usr.getid());
        System.out.println("Password: " + usr.getpas());
    }
}
