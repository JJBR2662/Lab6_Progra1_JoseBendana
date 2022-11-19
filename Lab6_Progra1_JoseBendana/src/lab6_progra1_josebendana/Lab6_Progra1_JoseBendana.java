package lab6_progra1_josebendana;

import java.util.Scanner;
import java.util.Random;

public class Lab6_Progra1_JoseBendana {

    public static void main(String[] args) {
        Scanner general = new Scanner(System.in);
        int menu;
        do {
            System.out.println("1.      El juego de la vida :D");
            System.out.println("2.      Pierda, papel o ...");
            System.out.println("3.      Blink-182");
            System.out.println();
            System.out.print("Ingrese el ejercicio que quiere evaluar: ");
            menu = general.nextInt();
            switch (menu) {
                case 1:
                    String[][] tablero = new String[8][8];
                    for (int i = 0; i < tablero.length; i++) {
                        for (int j = 0; j < tablero[i].length; j++) {
                            tablero[i][j] = "[ ]";
                        }
                    }
                    vida(tablero);
                    break;
                case 2:
                    jueguito();
                    break;
                case 3:
                    System.out.print("Ingrese el numero de filas: ");
                    int filas = general.nextInt();
                    System.out.print("Ingrese el numero de columnas: ");
                    int colum = general.nextInt();
                    int[][] matriz = new int[filas][colum];
                    blink(filas, colum, matriz);
                    break;
                default:
                    break;
            }
        } while (menu < 4);
        System.out.println("Solo se puede 1, 2 o 3");
    }

    public static void vida(String[][] tablero) {
        Scanner vida = new Scanner(System.in);
        tablero[0][0] = "[P]";
        int acum = 0;
        int copiaacum = 0;
        int dado = 0;
        int fila = 0;
        int columna = 0;
        do {
            System.out.println(dado);
            if ((fila==0&&columna==2)||(fila==0&&columna==4)||(fila==0&&columna==6)||(fila==2&&columna==0)||(fila==2&&columna==4)||(fila==2&&columna==6)||(fila==4&&columna==0)||(fila==4&&columna==2)||(fila==4&&columna==6)||(fila==6&&columna==0)||(fila==6&&columna==2)||(fila==6&&columna==4)){
                System.out.println("Ah envejecido 5 years");
            }else if((fila==0&&columna==0)||(fila==7&&columna==7)){
                         
            }else if((fila==0&&columna==3)||(fila==columna)||(fila==1&&columna==4)||(fila==2&&columna==5)||(fila==3&&columna==6)||(fila==4&&columna==7)||(fila==3&&columna==0)||(fila==4&&columna==1)||(fila==5&&columna==2)||(fila==6&&columna==3)||(fila==7&&columna==4)){
                System.out.println("Gano 125,000 lempiras");
            }
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    tablero[i][j] = "[ ]";
                    tablero[fila][columna] = "[P]";
                    System.out.print(tablero[i][j]);
                }
                System.out.println();
            }

            System.out.print("Ingrese una letra para tirar el dado ");
            String letradaigual = vida.nextLine();
            acum += dado;
            copiaacum += dado;
            if (copiaacum > 64) {
                acum = 64;
            }
            dado = new Random().nextInt((6 - 1) + 1) + 1;
            if (columna + dado < 8) {
                columna = columna + dado;
            }else if (columna + dado > 7){
                columna = 0;
                if (fila <= 7) {
                    fila++;
                }else{
                    
                }
            }
        } while (fila<=7);
        System.out.println("Felicidades ha terminado el juego!!!!!!!!");
    }
    
    public static void jueguito(){
            Scanner juego = new Scanner(System.in);
            int[][] matriz = new int[5][5]; //maquina 0 yo 1
            matriz[0][0] = 9;
            matriz[1][1] = 9;
            matriz[2][2] = 9;
            matriz[3][3] = 9;
            matriz[4][4] = 9;
            matriz[0][1] = 0;
            matriz[0][2] = 1;
            matriz[0][3] = 0;
            matriz[0][4] = 1;
            matriz[1][0] = 1;
            matriz[1][2] = 0;
            matriz[1][3] = 1;
            matriz[1][4] = 0;
            matriz[2][0] = 0;
            matriz[2][1] = 1;
            matriz[2][3] = 0;
            matriz[2][4] = 1;
            matriz[3][1] = 0;
            matriz[3][2] = 1;
            matriz[3][4] = 0;
            matriz[4][0] = 1;
            matriz[4][1] = 1;
            matriz[4][2] = 0;
            matriz[4][3] = 1; 
            matriz[3][0]= 1;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print("[ "+matriz[i][j]+" ]");
                }
                System.out.println();
            }
            System.out.print("ingrese 0[piedra], 1[papel], 2[tijera], 3[Spock], 4[Lizzard]: ");
            int opcion = juego.nextInt();
            int ran = new Random().nextInt((4 - 0) + 1) + 0;
            switch(ran){
                case 0:
                    System.out.println("Maquina ha elegido piedra");
                    break;
                case 1:
                    System.out.println("Maquina ha elegido papel");
                    break;
                case 2:
                    System.out.println("Maquina ha elegido tijera");
                    break;
                case 3:
                    System.out.println("Maquina ha elegido Spock");
                    break;
                case 4:
                    System.out.println("Maquina ha elegido Lizzard");
                    break;
            }
            if (matriz[opcion][ran]==9){
                System.out.println("Han empatado");
            }else if(matriz[opcion][ran]==1){
                System.out.println("Jugador ha ganado");
            }else if (matriz[opcion][ran]==0){
                System.out.println("Ha ganado la maquina");
            }
            System.out.println();
        }

    public static void blink(int filas, int colum, int[][] matriz) {
        int multi = (filas * colum) + 5;
        char[][] matriz2 = new char[filas][colum];
        char[] array = new char[multi];
        int cont = 0;
        int cont2 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                cont++;
                int random = new Random().nextInt((122 - 97) + 1) + 97;
                matriz[i][j] = random;
                char numlet = (char) random;
                array[cont] = numlet;
                System.out.print(matriz[i][j] + " -");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                cont2++;
                matriz2[i][j] = array[cont2];
                System.out.print(matriz2[i][j] + " -");
            }
            System.out.println();
        }
        System.out.println();
    }
}
