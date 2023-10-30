import java.util.Scanner;

import Model.Layout;
import Model.Position;
import Model.Robot;

public class RobotApp {
    public static void main(String[] args){
        new RobotApp();
    }

    private Layout layout;
    private Robot robot;
    private Scanner scanner;
    public RobotApp() {
        // contoh konfigurasi (inisiasi object layout) area permainan: X = 10, Y = 10, icon area yang tidak ditempati robot adalah '*'
        this.layout = new Layout(10, 10, '*');
        this.scanner = new Scanner(System.in);
        Position initialPosition = new Position(1, 1);
        this.robot = new Robot('o',initialPosition, layout); // Melewatkan layout ke Robot
        String instruction = "";
        System.out.println("-------- Permainan Dimulai --------");
        do{
            draw();
            instruction = waitInstruction();
        }while(!instruction.equals("x"));
        System.out.println("-------- Permainan Selesai --------");
    }

    private String waitInstruction() {
        System.out.println("-------- Instruksi --------");
        System.out.println("Instruksi: {d=kanan/a=kiri/w=atas/s=bawah}{jumlah langkah}");
        System.out.println("Contoh: w3 berarti 'keatas 3 langkah'");
        System.out.print("Masukan instruksi: ");
        String instruction = scanner.nextLine();

        if (instruction.length() >= 2) {
            char direction = instruction.charAt(0);
            int steps = Integer.parseInt(instruction.substring(1));
            switch (direction) {
                case 'w':
                    robot.moveUp(steps);
                    break;
                case 's':
                    robot.moveDown(steps);
                    break;
                    case 'a':
                    robot.moveLeft(steps);
                    break;
                case 'd':
                    robot.moveRight(steps);
                    break;
                default:
                    System.out.println("Instruksi tidak valid.");
            }
        } else if (instruction.equals("x")) {
            // Keluar dari permainan jika pengguna memasukkan 'x'
            System.out.println("-------- Permainan Selesai --------");
            System.exit(0);
        } else {
            System.out.println("Instruksi tidak valid.");
        }
        return instruction;
    }

    private void draw() {
        System.out.println("------ Posisi Terbaru ------");
        char[][] area = layout.getArea();
        Position robotPosition = robot.getPosition();
        
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[i].length; j++) {
                if (i == robotPosition.getY() && j == robotPosition.getX()) {
                    System.out.print(robot.getIcon());
                } else {
                    System.out.print(area[i][j]);
                }
            }
        }
        System.out.println();
    } // Pindah ke baris berikutnya
        /*
        Gambar layout:
        Contoh:
        - Posisi robot di 1,1
        - Area permainan luasnya 10,10
        sehingga gambar layout akan menjadi:

            o*********
            **********
            **********
            **********
            **********
            **********
            **********
            **********
            **********
            **********

            - konfigurasi (icon robot, posisi robot, luas area dan icon area permainan yang tidak ditempati robot) silahkan gunakan prinsip OOP
            - icon cukup menggunakan karakter yang ada di keyboard.
         */

}

