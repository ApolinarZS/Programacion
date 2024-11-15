package Tema2;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class PracticaProgramacionEstructurada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random roll = new Random();

        String j1_nombre = ".";
        int j1_pv = 0; //vida
        int j1_pv_regen = 0; //el valor aleatorio de regeneración
        int j1_atk = 0; //ataque
        double j1_atk_roll = 0; //el valor aleatorio de ataque
        int j1_def = 0; //defensa
        double j1_def_roll = 0; //el valor aleatorio de defensa
        int j1_vel = 0; //velocidad
        int j1_cp = 0; //poder de combate (suma total de las estadísticas)

        String j2_nombre = ".";
        int j2_pv = 0;
        int j2_pv_regen = 0;
        int j2_atk = 0;
        double j2_atk_roll = 0;
        int j2_def = 0;
        double j2_def_roll = 0;
        int j2_vel = 0;
        int j2_cp = 0;

        int ronda = 0; //contador para las rondas
        int accion = 0; //acción a realizar
        int atk_calc = 0; //el resultado del ataque

        int personaje = 0; //variable que determina si el jugador elige un personaje predeterminado o personaje personalizado
        int clase = 0; //variable que determina la clase que elige el jugador

        System.out.println("""
                ████████╗ ██████╗ ██████╗ ████████╗ █████╗ ███████╗ ██████╗ ███████╗     ██╗    ██╗   ██╗███████╗     ██╗
                ╚══██╔══╝██╔═══██╗██╔══██╗╚══██╔══╝██╔══██╗╚══███╔╝██╔═══██╗██╔════╝    ███║    ██║   ██║██╔════╝    ███║
                   ██║   ██║   ██║██████╔╝   ██║   ███████║  ███╔╝ ██║   ██║███████╗    ╚██║    ██║   ██║███████╗    ╚██║
                   ██║   ██║   ██║██╔══██╗   ██║   ██╔══██║ ███╔╝  ██║   ██║╚════██║     ██║    ╚██╗ ██╔╝╚════██║     ██║
                   ██║   ╚██████╔╝██║  ██║   ██║   ██║  ██║███████╗╚██████╔╝███████║     ██║     ╚████╔╝ ███████║     ██║
                   ╚═╝    ╚═════╝ ╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚══════╝     ╚═╝      ╚═══╝  ╚══════╝     ╚═╝
                                                                                                                        \s""");

        System.out.println("Jugador 1, ¿cómo quieres jugar?");
        System.out.println("1.Personajes predeterminados || 2.Personaje personalizado");
        personaje = scanner.nextInt();

        switch (personaje){
            case 1->{
                System.out.println("""
                           ____
                                          .'* *.'
                                       __/_*_*(_
                                      / _______ \\
                                     _\\_)/___\\(_/_
                                    / _((\\- -/))_ \\
                                    \\ \\())(-)(()/ /
                                     ' \\(((()))/ '
                                    / ' \\)).))/ ' \\
                                   / _ \\ - | - /_  \\
                                  (   ( .;''';. .'  )
                                  _\\"__ /    )\\ __"/_
                                    \\/  \\   ' /  \\/
                                     .'  '...' ' )
                                      / /  |  \\ \\
                                     / .   .   . \\
                                    /   .     .   \\
                                   /   /   |   \\   \\
                                 .'   /    b    '.  '.
                             _.-'    /     Bb     '-. '-._
                         _.-'       |      BBb       '-.  '-.
                        (________mrf\\____.dBBBb.________)____)""");
                System.out.println("MAGIA BORRÁS || VIDA (PV): 100 || ATAQUE (ATK): 200 || DEFENSA (DEF): 50 || VELOCIDAD (VEL): 150");
                System.out.println("Te crees un mago pero solo tienes un kit que te regalaron en navidades del 2005, tu imaginación te da gran poder.");
                System.out.println("""
                        ⠀⠀⠀⠀⠀⣀⣀⣀⠀⠀⠀⠀⢀⣠⣤⣤⣄⡀⠀⠀⠀⢀⣀⣤⡤⣤⣀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⣠⠞⠉⠀⠈⣉⡓⠒⠚⠉⠴⢶⠀⠈⠉⠉⠂⠉⠉⠀⢠⡶⠶⣌⠙⠒⠒⠒⠋⠉⠉⠙⢷⣆⠀⠀⠀
                        ⠀⠀⠀⢿⠀⢀⡀⠘⠿⠃⠀⠀⣠⡾⠛⠀⠀⠀⠀⠀⠀⠀⠀⠈⠘⣦⠀⠀⠀⠀⠀⠘⢿⡆⠀⢀⡿⠀⠀⠀
                        ⠀⠀⠀⠈⢣⡈⠁⠀⢀⣠⣴⣾⣏⣈⠉⠒⢄⡀⠀⠀⠀⠀⣀⡤⠖⠛⣳⣦⣄⣀⠀⠀⠀⠀⢀⡾⠁⠀⠀⠀
                        ⠀⠀⠀⠀⢠⠟⢉⣿⣿⣿⣿⣿⣿⡿⢿⣦⡀⠱⣄⠀⢀⠜⢁⣠⣾⣿⣿⣿⠿⣿⣿⣏⠛⢻⡉⡇⠀⠀⠀⠀
                        ⠀⠀⠀⢠⡏⢰⣿⢋⣿⣿⣿⣿⠋⠁⢾⣿⣿⡀⠸⣄⡎⣰⣿⢻⣿⣿⣿⣿⠛⠻⣿⢻⣷⡀⠹⡇⠀⠀⠀⠀
                        ⠀⠀⠀⣾⢀⣿⡇⣿⣿⣿⣿⣿⣦⣴⣿⣿⢻⡧⠀⡿⠀⣿⡇⣾⣿⣿⣿⣿⣄⣠⣿⡟⢻⡇⠀⢻⠀⠀⠀⠀
                        ⠀⠀⠀⣿⠸⣿⣤⢿⣿⣿⣿⣿⣿⣿⣿⡟⣿⡇⢀⣇⠀⣿⡄⣿⣿⣿⣿⣿⣿⣿⣿⣇⣼⡇⠀⣾⠀⠀⠀⠀
                        ⠀⠀⠀⢹⡄⠙⣿⣦⠿⣿⣿⣿⣿⡿⣏⣳⡟⢀⣼⢿⡀⠹⣿⣉⣿⣿⣿⣿⣿⣿⠟⣩⣿⠁⣰⠇⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠻⣄⡈⠛⠷⣼⣯⣭⣥⣴⠟⠋⣠⠞⣿⢸⡷⣄⠘⠻⣷⣬⣟⣏⣹⣿⡷⠟⢁⣴⠏⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⣿⠙⠲⠤⣤⣤⣤⣤⣤⠴⠛⠁⠀⡟⢸⡇⠈⠓⠦⣤⣈⣉⣉⣉⣁⣤⠶⠋⣱⠃⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡇⠸⡇⠀⠀⠀⠀⠀⠉⣉⡍⠁⠀⠀⠠⣿⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⣿⠀⠀⢴⡄⠀⠀⠀⠀⠀⢀⡴⣿⡇⠀⡷⣄⠀⠀⠀⠀⡼⠙⢳⡀⠀⠀⢀⡏⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⣿⣄⠀⠀⣀⡀⠀⠀⠀⢠⠏⠀⢈⡇⠀⡇⠈⢧⠀⠀⡼⠁⠀⠈⡇⠸⠃⣼⠁⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⡼⢻⠀⠘⢿⡿⠆⠀⢴⠛⡄⠀⢸⡇⠠⡇⢠⣈⡼⠀⢧⡘⢾⡷⠃⠀⢸⠛⡇⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⢸⡁⣈⡷⠖⠒⠲⠶⠤⢼⡛⠓⠶⣾⠃⠀⣷⡤⠭⢤⣶⠦⢬⣤⠤⢤⣀⡼⠀⣻⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠈⠙⡟⢻⣤⣤⣤⣤⣀⣀⣈⣓⣊⣽⠀⠀⣇⣙⣖⣋⣀⣀⣀⣀⣀⣀⣹⣿⠛⠉⠀⠀⠀⠀⠀⠠
                        ⠀⠀⠀⢀⣀⣀⣇⢸⠙⠛⠛⠛⠁⠙⠿⠿⠿⣿⠀⠀⣿⠿⠿⠏⠉⠿⠿⠿⠿⠋⡟⢻⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⣼⠸⣦⢤⣄⣀⣀⣀⣀⣤⡤⣬⣿⣾⣁⣀⣀⣀⣀⣀⣀⣠⣤⣀⡇⣾⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⢰⠣⡄⡇⠀⠿⢦⣄⣀⣀⣸⡆⠀⠀⠀⠀⠀⠸⣿⣿⣍⣿⣿⠈⢸⢃⢸⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠸⣧⢻⠇⠀⠀⠀⣧⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣼⠁⠀⠀⢸⣾⣾⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠻⠿⠀⠀⠀⠀⣿⢺⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡟⠀⠀⠀⠸⢿⠇⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⡃⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏⣷⠀⠀⠀⠀⠀⡤⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⢰⣾⣿⣦⣾⣧⣼⡇⠀⠀⠀⠀⠀⠀⠀⢀⣾⣧⣿⣇⣠⣶⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⣀⣀⣀⣀⣀⣀⣀⣘⣻⣿⣟⢛⣻⣟⣁⣀⣀⣀⣀⣀⣀⣀⣈⣻⣿⣿⣿⣿⣿⣿⣀⣀⣀⣀⣀⣀⣀⠀⠀⠀""");
                System.out.println("BOB ESPONJA PANTALONES CUADRADOS (SAD VERSION) || VIDA (PV): 50 || ATAQUE (ATK): 200 || DEFENSA (DEF): 50 || VELOCIDAD (VEL): 200");
                System.out.println("El pantalones cuadrados pero está triste, letal pero frágil");
                System.out.println("""
                        ⡿⣽⣻⣽⢯⡿⣽⣟⣿⣻⣟⣿⣻⡽⣏⡿⣹⢯⡽⢭⡻⣝⡯⣟⡻⣟⣻⡟⣿⢯⡿⣟⠻⡏⢽⡑⢯⡹⢯⡝⣏⠿⣙⢯⡙⢮⡙⢆⢣⠒⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠄⡄
                        ⣟⣳⢧⣟⡯⣟⣳⣟⣾⣳⣟⣾⣳⢿⣹⠾⣝⣮⢳⣏⡷⣭⢻⡼⣽⣣⢿⡾⣽⢺⡽⣋⠆⡉⠦⡘⢣⡜⣥⢛⣬⡏⣽⢒⡝⣢⣙⡌⢢⣑⣀⡠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⢂⢔⡣⣘
                        ⣿⣹⢾⣭⢿⣹⡗⣯⣞⣷⢻⣞⡽⣯⢯⣟⣳⣞⣳⢮⢷⡭⣷⡹⣧⢋⠶⡱⢏⡟⠻⢁⠊⢤⣑⡈⠆⡜⢈⠻⣭⠛⠤⣡⣾⡴⠞⠛⠛⠉⠉⠙⠛⠲⢦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠌⡐⢪⡕⢬
                        ⣷⣯⣟⣮⢯⣗⡿⣧⣟⣾⣻⡼⣯⣟⡿⣞⣧⣯⢷⣯⢯⢷⣳⡝⣦⠋⡔⢡⠈⢠⠁⠆⣸⣿⡝⣿⣦⠀⣠⠟⣸⣿⡷⠟⠁⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠢⢌⡳⡜⢦
                        ⣿⢾⡽⣞⣻⢮⢿⡽⣞⣷⣳⢯⣳⢯⣻⣝⡾⣭⣟⢮⣟⡞⣧⣛⠦⡩⢔⠡⡈⠔⠠⣶⣿⣿⣷⡌⠻⣶⡁⢀⣵⠟⢀⣤⣤⣄⣀⣀⢀⣀⣀⣀⣀⣀⣠⣀⣀⡈⢳⣄⠀⠀⠀⠀⠀⢀⣠⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠂⡜⢢⢽⡙⢮
                        ⣯⢯⣟⣭⢷⣯⣻⣽⣛⡾⣽⣏⣯⠷⣏⡾⣽⡳⣞⢯⡞⣽⠲⣍⠲⡁⢋⠆⡡⠌⡁⠙⡻⢿⣿⣿⣶⣌⣻⡿⢷⣴⣿⣿⣿⡟⣿⡿⣿⣯⠉⠿⡿⣟⣯⣝⣯⣻⣶⢿⣧⡀⢀⣠⠾⣋⣷⣬⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢠⠘⡄⢣⠎⡝⢂
                        ⣿⢾⡽⣞⣯⢶⣻⢾⣽⣛⡷⣞⡧⣿⣹⠽⣶⢻⡝⣮⡝⣲⢫⠔⢣⠄⡣⢘⠰⣈⠱⡘⡘⠣⢌⠰⣉⢻⡿⠻⣿⣿⡿⠟⣿⣿⣿⣿⣿⣿⣶⣿⣿⣿⣿⣿⡻⣿⣿⡀⢿⣿⢋⣥⣾⣿⣿⠿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠣⠌⡃⢬⡑⢊
                        ⣟⣯⢿⡽⣞⣯⣟⢯⡾⣝⣳⠿⣜⢧⣏⠿⣜⢯⡞⡵⢪⡕⢪⡜⡡⢊⠔⡡⠒⠤⢁⠆⠹⡐⡬⠒⣨⣿⠁⠀⠙⠻⢿⣶⣿⣿⡿⠛⠋⠉⠉⠛⠻⣯⣠⡿⣧⠙⢿⡇⠀⣿⠋⠉⠉⠉⠉⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠠⠑⢢⡑⠌
                        ⣿⢯⡿⣽⣻⣞⣭⠿⣝⣯⢳⢯⡝⡾⣜⡻⣜⢧⣫⢓⡧⣚⠥⣒⢡⠊⡔⢡⢘⡐⠈⡌⢱⡑⢆⡱⣼⠃⠀⠀⠀⠀⣀⣤⣿⣢⣤⣶⢂⠀⠀⢲⣦⡈⠙⡻⠿⠖⠋⠀⠀⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠈⠀⡜⠰⣈⠒
                        ⣿⢯⣟⡷⣻⠼⣞⣻⡝⣮⢟⡮⣽⣱⢫⡵⣫⢞⡴⣋⡞⣵⢊⡵⣊⠵⣉⢦⠣⣜⡱⣚⢦⡙⢦⣹⡏⢠⡶⣶⣿⣿⣿⡿⣿⢿⣿⣾⣭⣶⣤⣦⣿⣿⣦⣷⣦⣀⠀⠀⠀⠘⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠁⠂⠜⢡⢂⡱
                        ⣿⣻⡞⣷⢫⡟⡼⢧⡻⣜⡏⣾⡱⣎⠷⣱⡹⢎⡵⢳⡜⣥⠻⡴⣩⠖⣭⠲⣹⡐⢧⡙⣦⡙⢦⣿⠁⣼⣿⣿⣿⣿⣿⡀⠀⠀⠈⠛⣿⠛⣿⣻⡿⠟⠋⠛⢿⣿⣷⣆⠀⠀⣿⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠠⠀⢀⠡⢈⠰⣈⠒⢦⡑
                        ⣿⢷⣿⣉⣷⢏⣹⢷⡹⣾⡸⣇⡹⣈⢷⢇⡹⣎⡸⢇⡾⣰⠏⣱⢇⡹⣆⠿⣰⠹⢶⠹⣰⢹⢶⣿⡀⣿⡇⢏⣿⠏⠿⣿⣶⣆⣀⠀⠀⠀⣾⠏⠀⠀⠰⠆⠀⠹⣿⡹⣷⠀⣿⡎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠈⡀⠆⠀⠆⠁⠀⠰⠈⡰⢀⠏⣆⠹
                        ⣿⣻⢶⣻⡼⣏⢷⣫⢗⡧⣟⡴⢫⡵⢪⢎⡵⢪⡕⣫⢔⡣⠞⡥⣎⠵⣊⠷⣡⢏⠲⣽⣶⠿⠛⠉⣿⣿⡘⣆⡿⠀⠰⣷⢮⣭⣟⣛⣿⠶⠿⠶⠤⠤⠴⠬⢷⣄⢸⣿⠌⠀⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣐⠠⠀⡁⠠⢀⢁⠢⡑⢄⢫⡘⡴⣋
                        ⣷⣯⣟⣧⢿⣹⢾⡱⣏⢾⡱⣏⢷⣚⡳⢎⡼⢣⠞⡴⢣⢞⡹⢦⡝⢮⡱⣫⣴⣭⠞⠉⠀⠀⠀⠀⠛⣿⣧⡿⢡⣀⠴⣫⢞⡭⡩⢏⡹⠛⠟⡛⠿⢷⣶⣄⠀⠙⢿⣿⡄⢠⡏⠀⠀⠌⠀⠀⠀⠀⠀⠀⠀⠀⠂⠄⠒⡀⠀⡐⠀⠰⢀⢂⠒⢌⢂⠦⣱⢣⡝
                        ⣟⡾⢮⡷⣯⣻⢧⣟⡭⣟⣳⠽⣮⢳⡝⢮⡵⢫⠞⣵⢋⡞⡹⣆⣻⡶⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⡜⣱⢺⡝⣧⠟⡴⣉⠆⡠⢉⠴⡠⢇⠸⢤⣿⠆⠀⣾⣏⡷⠘⠻⣦⡐⠀⠀⠀⠀⠀⠀⠀⠀⠂⠠⠀⠃⠄⠂⠐⠀⡁⢂⠌⡘⢤⢊⠲⣡⢗⡯
                        ⡿⣽⢯⣟⡷⣯⣟⡼⣝⡮⣝⣻⡜⣯⢞⡣⢏⢧⡻⣼⣭⣶⡿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣝⢦⡙⠺⣥⠻⡵⡌⢆⡱⡀⠆⡑⢊⡑⢺⡿⠀⠀⢻⢿⡇⠀⠀⠈⠻⣤⡀⠀⠀⠀⠀⠀⠀⢀⠠⠁⢈⠐⠀⠌⡐⢈⠔⡨⢘⠥⣊⢖⡱⣯⢞
                        ⣿⣽⣻⢾⣽⡳⢯⡽⣞⡵⢯⡳⣝⣮⣷⡽⠿⠛⠛⠋⠉⠁⢠⣀⠀⠀⣀⣀⡀⠀⠀⠀⠀⠀⣀⡿⠟⣿⣿⣿⣿⣮⣕⢦⣛⡵⣚⢦⣑⣌⡐⢀⠀⡄⠛⠁⣀⣰⣿⣼⣷⣄⠀⠀⠀⠈⠻⣦⡀⠀⠀⠄⠠⠀⡀⠂⢄⡈⠔⡨⠄⣃⠘⣄⢋⠴⣩⢮⡵⢯⣻
                        ⣟⡾⣽⢯⣶⢻⡻⣜⢧⣻⣷⡿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⣫⣉⡉⠲⣦⣀⣤⣴⠟⠉⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣏⡷⣭⣲⣍⣦⣏⡼⣩⣷⣿⣿⣿⣧⡙⠿⣦⣄⠀⠀⠦⣈⠛⢦⣖⠀⠄⠃⠤⢁⠢⡐⢌⠰⡈⢄⠣⡌⢎⠶⣱⢮⡽⣏⣷
                        ⣯⢿⡽⣞⢧⡿⣹⣝⡶⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⠻⢿⣉⠀⣤⣀⣤⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣹⣿⡀⡈⠻⣧⣖⠀⠈⠳⣄⡉⠻⢾⣅⡲⢌⢂⠩⢄⠓⡌⢎⡱⢎⡹⣎⣷⣹⢾⡽⣾
                        ⣯⢷⣻⢭⣟⡼⣷⠟⠀⢀⣀⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠶⣿⡟⠻⣯⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣰⠈⢿⣿⣆⠀⠈⠻⣧⣤⡤⠼⠳⢤⣀⡈⠙⠷⣮⣃⢎⡹⣘⢮⡱⣏⡽⣳⣝⣯⣟⣿⢿
                        ⣟⣯⢽⣛⣮⣿⠋⠀⢚⣉⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⢀⠀⠀⠀⠀⠈⠙⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣤⣤⠈⠻⢦⣤⣴⡋⠀⠀⠀⠀⠀⠀⠉⠓⢤⣈⠛⢷⡼⣱⢎⣷⣹⣞⣷⣻⣾⣟⣯⣿
                        ⡿⣜⢧⢻⣾⣏⣴⡿⢟⡹⣼⡱⠎⡀⠀⠉⠑⠳⣄⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⣴⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠡⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠞⠋⠀⠀⠀⠀⠀⠀⠀⠈⣧⣀⠀⠀⠀⠀⠀⠀⠀⠉⠲⣌⠻⣧⣿⢎⣷⡾⣯⣷⣿⣻⣿⣻
                        ⢳⣉⢮⡽⣹⣿⣿⣾⣿⣿⣽⣶⣥⣚⡴⣤⡤⢀⢻⠃⠀⠀⠀⠀⠀⠀⠀⠀⢠⡞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠌⠻⣿⣿⣿⣿⣿⣿⣿⣿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠹⣇⠀⠀⠀⠀⠀⠀⠀⠀⠘⣧⡘⣿⣿⢾⣽⣟⣷⣿⣿⣽⣿
                        ⢣⠜⢺⣳⣿⣿⣿⣿⣿⣿⣿⣯⣷⣯⣟⣧⣛⡤⣈⢳⡆⠀⣄⡀⠀⠀⠀⠀⠉⠁⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣐⠘⠻⢟⣿⣿⠿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢦⡀⠀⠀⠀⠀⠀⠀⠀⠈⢷⣹⣿⣿⣻⣿⣯⣷⣿⢿⣾
                        ⠢⢉⢂⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣯⢶⡍⢶⣰⢂⠈⡙⢳⢦⣽⠻⣦⣀⣀⣤⠖⠚⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⡀⠈⠻⣦⡀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣷⡿⣿⣻⣿⣻
                        ⢀⠃⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡜⡯⣔⢪⣴⣵⣯⣿⣿⣷⡿⠿⠛⠁⠋⠉⠉⠈⡆⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⢙⠻⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢷⣄⡀⠈⣿⣦⣄⡠⢀⠄⣰⢢⣿⣿⣿⣿⣷⡿⣟⣯⣷⢿
                        ⠀⡒⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣳⣽⣮⣿⣿⣿⣿⣍⢃⠀⠀⣠⣀⡀⠀⣀⣠⡄⠀⠀⢀⡜⠁⠀⠀⠀⠀⠀⠀⢠⣬⣥⡦⢿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⢿⣶⣯⣿⣮⣵⣋⠼⣦⣯⣿⣿⣿⡿⣞⣿⣻⣽⡾⣿
                        ⠐⠉⣿⣿⣿⣿⣿⡽⢯⣟⣯⢛⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣯⣶⣷⣤⣬⣅⡛⣩⣥⠦⠄⠠⠚⠛⠂⠀⠰⠀⠀⠀⠀⠈⠚⠿⣧⠘⠛⠳⠆⠀⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⢈⠻⣿⣿⣿⣿⣿⣽⣿⣿⣿⣿⡿⣽⣷⣻⢷⣻⣽
                        ⠀⠀⢻⣿⣿⡿⢯⡝⣧⢛⢮⡵⢊⣽⡿⠉⠣⠙⡭⢏⡳⣝⢾⣿⣿⣿⣿⣿⣏⢧⡈⢥⠉⢷⣄⠀⠀⣀⠧⠀⠀⠀⠀⠀⠀⠀⠀⣤⠀⣀⢀⣹⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠐⠦⠴⣤⣄⣲⣭⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣳⢯⣟⣯⢟⡾
                        ⡄⢁⢻⣿⣿⣝⠯⣝⡳⢯⣼⠇⢢⡿⠛⠠⠄⢛⠰⣘⠳⣎⢻⣿⣿⣿⣿⣿⣿⣯⡽⣎⡕⣆⠹⡷⠰⠷⠀⢀⣀⠐⠀⠀⠀⣀⣤⣩⣞⠋⢠⣍⣿⠇⠀⠀⠀⠀⢀⡀⠀⠀⣠⡄⠀⠀⠀⡀⢀⡤⣉⣿⣿⣿⣿⣿⡿⡿⣿⢻⢿⣟⠤⢻⣿⣯⣟⡾⣣⢏⡜
                        ⠜⣬⢿⣿⣿⢾⣹⣿⣟⢻⠋⣤⣿⠱⢈⠲⡰⢄⢆⡈⢳⡌⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣞⣧⣟⡥⣃⡄⣤⠀⠀⠀⢀⣤⣿⠟⢋⡷⠟⠿⣦⣼⣿⣷⣦⡶⣦⣤⣤⣤⡴⢾⣡⡤⠀⠀⠀⡄⣘⣶⣿⣿⣿⣿⣿⢳⡟⢷⡍⢦⢉⠞⣧⠌⢻⣿⣾⡱⣏⠾⣜
                        ⣇⠚⢬⣿⡿⣽⣿⣿⡹⣎⣳⡿⢡⠒⣇⠠⣕⣎⡼⣈⢷⡸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣷⢦⣝⢢⣡⣴⡾⠟⢋⢀⡀⠀⣀⣀⣀⣀⣤⣦⣀⠀⢠⣀⡈⠉⠉⠉⠻⠟⠀⠀⠁⡘⣼⣿⣿⣿⣿⣿⣿⣏⡳⣜⠣⢞⢣⡉⢎⡹⢎⡈⢿⣷⣝⢮⣻⢼
                        ⠋⡙⢦⣿⣿⣿⣿⣳⡻⢼⣿⡁⢧⢏⣰⢇⠶⣴⣼⡱⣏⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢾⣿⣿⣷⣎⣜⣣⢟⣤⣓⣔⣨⣍⣻⣿⣿⣿⡻⢳⠈⠙⣿⣧⣴⢀⢢⡐⣸⣵⣾⣿⣿⣿⣿⣿⣿⣿⢧⡹⣌⢏⡞⣦⡝⡦⣱⢻⣆⠼⣿⣿⣏⡾⣯
                        ⠀⠘⣷⣿⣿⣿⣿⡿⣟⣿⣿⡘⢧⣞⡜⣮⡹⣝⣶⣹⣟⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣉⣿⣿⣿⣿⣿⣿⣥⣆⣷⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡟⣼⢎⣳⢮⣜⣳⢧⣏⢿⣶⡸⣿⣭⢷⣻
                        ⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣷⢹⣾⢹⡾⣱⣿⣹⡾⣷⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⡿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⢿⡹⣎⢷⣾⣸⢷⣏⡾⡾⣿⡇⢹⣿⡾⣷
                        ⠃⠀⠀⢻⣿⣿⣿⣿⣿⣿⣟⡷⣞⣧⣟⣳⢯⣷⣻⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⡟⢻⠟⡯⣝⣯⣟⡿⣽⢯⠿⠛⠉⠄⠱⠅⢨⠁⠈⠢⠱⡙⢿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣟⡿⣝⣯⣟⣿⣟⡾⣽⣻⣿⣿⣆⠹⣿⣷
                        ⠀⠀⠀⠘⢿⣿⣿⣿⣿⣿⣾⣽⣻⢾⣯⣽⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣶⣉⢶⡻⣜⠯⡙⠳⢊⡁⠁⠈⠐⠆⠀⢨⡿⠁⠀⠀⢌⢂⠩⢏⡟⣿⢿⣿⣿⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠙
                        ⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣾⣷⣯⣞⣡⡒⡠⢄⡡⢰⣧⣆⠠⢰⢇⡀⢀⠄⣬⢎⣵⢻⡘⣧⣮⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣿⣿⣿⣽⣿⣿⣿⣿⠃⠀⠀⠀
                        ⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣵⣧⣾⣿⣿⣿⣿⣿⣾⣼⣧⣾⣿⣿⣞⣧⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀
                        ⠀⠀⠀⠀⡀⠒⣻⣿⣿⣿⣿⣿⣿⡻⢋⡝⣒⢦⡻⣌⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⡟⣯⠹⣭⠻⣽⢿⣿⣿⠟⡹⣍⠻⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⠀⠀⠀⠀
                        ⠀⠀⠠⢂⠥⣘⣽⣿⣿⣿⣿⣿⡫⢱⣋⠦⡙⢮⢳⢹⡓⣦⢛⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣿⣏⣞⡿⣾⡽⣞⡽⣎⣿⣿⣟⡮⣵⢾⣹⣿⣧⣟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⡀
                        ⠀⠠⠑⡎⢶⣱⢾⣿⣿⣿⣿⣿⣏⢳⡘⢆⡙⢎⢧⢳⡝⣮⣻⡽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⣀⠀⢠⠀
                        ⠀⠐⢈⣜⣳⢮⢿⣿⣿⣿⣿⢏⣜⠣⡝⢢⣙⢎⣮⢳⡽⣳⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡱⢎⡱⢊⠀
                        ⢠⡚⠜⣮⡟⣟⣾⣿⣿⣿⣿⢺⣍⡳⣜⢇⡞⡾⣜⣳⢿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣭⢟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣝⣣⣟⣯⣭⣻⢿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣻⡿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣷⣊⠅⢫⠖
                        ⢥⠘⡼⣹⣽⣿⣿⣿⣿⣿⣯⢷⣬⣳⣝⡾⣼⣳⣯⣿⣿⣿⣿⣿⣿⣟⣿⣿⣿⣿⣿⡿⢮⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣷⣿⣾⣿⣽⣿⣿⣿⣽⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣹⠿⣿⣿⣿⣿⣿⣿⣷⣭⣋⠝⢿⣿⣿⣿⣜⡘⢦⡙
                        ⢎⡸⣜⣷⣿⣿⣿⣿⣿⣟⣾⣻⣟⡿⣿⣿⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⠾⣜⢿⣿⣿⢾⢿⣿⡿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡽⢾⡽⣮⣓⢯⣝⣻⣿⣿⣿⣿⣿⣿⣿⣟⣻⣿⣿⣿⣿⣿⣶⡹""");
                System.out.println("SHREK TO PETAO || VIDA (PV): 200 || ATAQUE (ATK): 99 || DEFENSA (DEF): 200 || VELOCIDAD (VEL): 1");
                System.out.println("Entrenado en el pantano espantando ciaturas mágicas indeseables, resistente como la piedra.");
                System.out.println("""
                        ⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⣦⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣶⣦⣤⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡶⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⠀⠀⠀⣤⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢿⠾⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠋⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀
                        ⠀⣀⣀⣤⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀
                        ⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣄⠀⠀
                        ⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆
                        ⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟
                        ⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀
                        ⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡾⠋⠘⣇⠀⠀⠂⠀⠀⠀⠀⠀⢀⡽⠁⠈⠻⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀
                        ⠀⠀⠀⠀⠘⢿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⠏⠀⠀⠀⠛⣄⠀⠀⠀⠀⠀⠀⠀⣾⠁⠀⠀⠀⢻⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⡿⠃⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠈⢻⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣄⣀⡀⠀⠀⢻⣤⡀⠀⠀⠀⠀⠠⡇⡀⡀⠀⠀⣀⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⢐⣿⠅⠀⠈⠍⠩⠛⠚⠉⠷⣦⡀⠀⠀⢰⡛⢟⠒⠚⠋⠉⠙⣧⠀⠀⠀⠀⠀⠀⠀⠀⠠⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⢾⣿⣶⣦⣤⣰⣭⣤⣥⢆⠀⠐⠩⠳⢤⡸⣧⣤⣤⢤⣆⣀⣠⣽⠄⠀⠀⠀⠀⠀⠀⠀⠄⣿⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠋⢸⠀⠀⠀⠀⠀⠀⠀⢸⡿⣿⣼⣿⣿⣿⣿⣿⠍⠀⠀⠀⠄⠀⠀⣻⣏⣹⣿⣿⣿⣿⣿⣏⠀⠀⡀⠀⠀⠀⢀⠨⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⢳⡀⠀⠀⠀⠀⣿⡛⣿⣿⣻⣾⣽⣯⣿⠈⠀⠀⠀⠀⠀⠀⣽⣿⣿⣿⣿⡿⣿⣿⡇⠀⠀⠀⠀⠀⡐⠀⠠⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡄⠀⠁⠀⠀⠀⠈⣿⣯⢻⣿⣯⣷⣿⣿⡟⠂⠀⠀⠀⠀⠀⠀⢈⣿⣿⣿⣯⣿⣿⢿⡃⠀⠠⠐⠀⡐⠀⡁⢸⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀⡀⣤⡀⠀⡿⡱⠈⡙⠻⠿⠟⠋⠈⠀⠀⠀⠀⠀⠀⠀⠈⠘⠻⠿⠿⠟⠃⣾⠀⢠⢤⣾⠀⠐⠠⠀⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⢀⣿⡹⣄⣧⠐⠐⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⢀⠀⡀⠂⠀⠀⠀⠀⣿⣠⢋⣼⣿⡆⠁⠂⢐⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢈⡧⠀⣼⣿⢿⣦⡻⣧⣄⠂⠁⠀⠐⠀⠀⠺⢿⣄⣀⣀⣸⣿⠇⠀⠀⠠⠐⠀⡁⣠⣧⣿⣿⣛⢷⡀⠀⡾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⣼⡿⣭⣟⣾⣷⣜⢻⣿⣦⣃⡴⣈⣀⢂⠀⡀⢀⠐⡀⢀⠠⢀⡁⢂⣁⣦⣵⣿⣿⣿⠧⢍⣊⣧⢀⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⢻⣷⡿⣟⢾⡿⣾⠛⠹⣟⣯⣘⣭⣟⣶⣵⣬⣲⣤⣧⣮⣷⣿⣿⣿⢿⡿⣯⣷⣿⣌⣶⣿⢻⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠃⠀⠀⠙⢷⣿⣦⡟⠃⠀⠈⣿⣿⣿⣟⣿⣿⣿⣿⣿⣿⣿⣿⣟⣿⣿⡿⢀⡽⢿⢁⡟⣿⡿⢃⠞⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡤⠤⠞⠋⢳⡀⡘⠹⢾⣿⣿⣿⡿⣽⣿⣿⣿⣿⣿⡿⣿⣯⣿⣟⡇⢀⡼⠻⠿⣏⡜⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡠⠼⠛⠉⠈⠀⠀⠀⠠⢀⣿⠠⠖⣾⣿⣿⢿⣻⣿⣿⣿⣿⣿⣟⣿⣻⢿⣿⡷⠺⣡⢃⡀⠀⠀⠈⠙⠒⠦⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⡜⠁⠀⠀⠀⠀⠀⠀⡀⢆⣱⣷⠿⢧⣰⣿⣿⣿⣻⢿⣿⣿⣿⣿⣿⣽⡿⣽⣿⣿⣿⣱⣿⣦⡐⡄⡁⠀⡀⠀⠀⠀⠉⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀⠀⠀⢀⡰⣬⣼⢿⣫⣵⣾⣿⣿⣿⣿⣷⣻⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣵⣂⡄⠠⠀⠀⢀⡾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠦⣀⣠⡴⠖⠋⣱⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣠⡉⢟⠓⠚⠒⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⢿⣿⡿⣯⣿⢿⡿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⢿⣿⣮⡘⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠟⢡⣾⣿⣟⡿⢯⣟⡿⣽⣟⣯⣿⣻⣯⣿⢯⣿⣽⣿⣻⡿⣟⡿⣯⣷⢿⣳⡿⣟⡿⣾⡽⣿⣾⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⢶⡿⠁⣠⠟⣸⣟⣾⣽⠿⠞⠿⠿⠾⠿⣾⣟⡷⣿⢯⣟⡾⣷⣻⡽⣯⡿⠛⠛⠛⠛⠛⠛⠿⢶⡿⡽⡿⠿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⢀⡼⠋⠀⠛⠋⠉⠀⠀⠀⠀⠀⠀⠀⠈⠙⠻⣽⣻⢾⡽⣳⣯⠟⠉⠀⠀⠀⠀⢀⡀⠀⠀⠀⠑⠍⢥⣀⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣄⠚⠀⣀⣠⢤⣶⠊⠉⠁⠈⠉⠒⢒⡤⣄⣀⡀⠀⠈⠙⠛⠁⢀⣀⣤⠴⠒⠋⠁⠀⠀⠉⠑⢶⣄⣀⠈⠏⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠿⣿⢻⣿⡿⢋⠞⠀⠀⠀⠀⠀⠀⠀⢱⣷⣟⣿⣿⡿⣶⣶⣿⣿⣿⣮⠄⠀⠀⠀⠀⠀⠀⠈⣆⠑⠯⣿⣾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠛⠁⢸⠆⠀⠀⠀⠀⠀⠀⠀⣸⠑⠯⣝⣻⣹⣏⣿⡿⠚⠉⠘⡀⠀⠀⠀⠀⠀⠀⠀⢹⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢣⡀⠀⠀⠀⠀⠀⢀⡎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢧⠀⠀⠀⠀⠀⠀⢀⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠒⠶⠤⠶⠷⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠲⠦⠴⠤⠖⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀""");
                System.out.println("CIRNO, HADA DEL HIELO || VIDA(PV): 200 || ATAQUE (ATK): 50 || DEFENSA (DEF): 50 || VELOCIDAD (VEL): 200");
                System.out.println("Hada del hielo traumada por su estupidez en las matemáticas. Very silly. Baka Math");
                clase = scanner.nextInt();
                switch (clase){
                    case 1->{
                        System.out.println("MAGIA BORRÁS || VIDA (PV): 100 || ATAQUE (ATK): 200 || DEFENSA (DEF): 50 || VELOCIDAD (VEL): 150");
                        j1_nombre = "MAGIA BORRÁS"; j1_pv = 100; j1_atk = 200; j1_def = 50; j1_vel = 150;
                    }
                    case 2->{
                        System.out.println("BOB ESPONJA PANTALONES CUADRADOS (SAD VERSION) || VIDA (PV): 50 || ATAQUE (ATK): 200 || DEFENSA (DEF): 50 || VELOCIDAD (VEL): 200");
                        j1_nombre = "SAD BOB ESPONJA"; j1_pv = 50; j1_atk = 200; j1_def = 50; j1_vel = 200;
                    }
                    case 3->{
                        System.out.println("SHREK TO PETAO || VIDA (PV): 200 || ATAQUE (ATK): 99 || DEFENSA (DEF): 200 || VELOCIDAD (VEL): 1");
                        j1_nombre = "SHREK"; j1_pv = 200; j1_atk = 99; j1_def = 200; j1_vel = 1;
                    }
                    case 4->{
                        System.out.println("CIRNO, HADA DEL HIELO || VIDA(PV): 200 || ATAQUE (ATK): 50 || DEFENSA (DEF): 50 || VELOCIDAD (VEL): 200");
                        j1_nombre = "CIRNO"; j1_pv = 200; j1_atk = 50; j1_def = 50; j1_vel = 200;
                    }
                }


            }
            case 2->{
                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                System.out.println("JUGADOR 1 - INTRODUCE TU NOMBRE");
                j1_nombre = scanner.next();
                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                System.out.println(j1_nombre + " - INTRODUCE TUS ESTADÍSTICAS");
                System.out.println("Dispones de 500 puntos a distribuir entre tus estadísticas (PV, ATK, DEF, VEL)");
                System.out.println("Disclaimer: Cada estadística tendrá que tener un valor entre 1 y 200");

                //Pido al usuario 1 los valores de las estadísticas y me aseguro de que no sean negativos, no superen 500 en total, ni 200 individualmente\\
                while (j1_cp == 0 || j1_cp == 500) {

                    while (j1_pv == 0) {
                        System.out.println("Introduce tu VIDA (PV)");
                        j1_pv = scanner.nextInt();
                        while (j1_pv > 200 || j1_pv <= 0) {
                            System.out.println("No introduzcas valores negativos, superiores a 200 o iguales a 0");
                            System.out.println("Introduce tu VIDA (PV)");
                            j1_pv = scanner.nextInt();
                        }
                        j1_cp = j1_pv + j1_cp;
                        System.out.println("Has usado " + j1_cp + " puntos de estadísiticas");
                    }
                    while (j1_atk == 0) {
                        System.out.println("Introduce tu ATAQUE (ATK)");
                        j1_atk = scanner.nextInt();
                        while (j1_atk > 200 || j1_atk <= 0) {
                            System.out.println("No introduzcas valores negativos, superiores a 200 o iguales a 0");
                            System.out.println("Introduce tu ATAQUE (ATK)");
                            j1_atk = scanner.nextInt();
                        }
                        j1_cp = j1_atk + j1_cp;
                        System.out.println("Has usado " + j1_cp + " puntos de estadísiticas");
                    }
                    while (j1_def == 0) {
                        System.out.println("Introduce tu DEFENSA (DEF)");
                        j1_def = scanner.nextInt();
                        while (j1_def > 200 || j1_def <= 0) {
                            System.out.println("No introduzcas valores negativos, superiores a 200 o iguales a 0");
                            System.out.println("Introduce tu DEFENSA (DEF)");
                            j1_def = scanner.nextInt();
                        }
                        j1_cp = j1_def + j1_cp;
                        System.out.println("Has usado " + j1_cp + " puntos de estadísiticas");
                    }
                    while (j1_vel == 0) {
                        System.out.println("Introduce tu VELOCIDAD (VEL)");
                        j1_vel = scanner.nextInt();
                        while (j1_vel > 200 || j1_vel <= 0) {
                            System.out.println("No introduzcas valores negativos, superiores a 200 o iguales a 0");
                            System.out.println("Introduce tu VELOCIDAD (VEL)");
                            j1_vel = scanner.nextInt();
                        }
                        j1_cp = j1_vel + j1_cp;
                        System.out.println("Has usado " + j1_cp + " puntos de estadísiticas");
                    }
                }
            }
        }


        //lo mismo con el segundo personaje
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        System.out.println("JUGADOR 2 - INTRODUCE TU NOMBRE");
        j2_nombre = scanner.next();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        System.out.println(j2_nombre + " - INTRODUCE TUS ESTADÍSTICAS");
        System.out.println("Dispones de 500 puntos a distribuir entre tus estadísticas (PV, ATK, DEF, VEL)");
        System.out.println("Disclaimer: Cada estadística tendrá que tener un valor entre 1 y 200");

        while (j2_cp == 0 || j2_cp == 500) {

            while (j2_pv == 0) {
                System.out.println("Introduce tu VIDA (PV)");
                j2_pv = scanner.nextInt();
                while (j2_pv > 200 || j2_pv <= 0) {
                    System.out.println("No introduzcas valores negativos, superiores a 200 o iguales a 0");
                    System.out.println("Introduce tu VIDA (PV)");
                    j2_pv = scanner.nextInt();
                }
                j2_cp = j2_pv + j2_cp;
                System.out.println("Has usado " + j2_cp + " puntos de estadísiticas");
            }
            while (j2_atk == 0) {
                System.out.println("Introduce tu ATAQUE (ATK)");
                j2_atk = scanner.nextInt();
                while (j2_atk > 200 || j2_atk <= 0) {
                    System.out.println("No introduzcas valores negativos, superiores a 200 o iguales a 0");
                    System.out.println("Introduce tu ATAQUE (ATK)");
                    j2_atk = scanner.nextInt();
                }
                j2_cp = j2_atk + j2_cp;
                System.out.println("Has usado " + j2_cp + " puntos de estadísiticas");
            }
            while (j2_def == 0) {
                System.out.println("Introduce tu DEFENSA (DEF)");
                j2_def = scanner.nextInt();
                while (j2_def > 200 || j2_def <= 0) {
                    System.out.println("No introduzcas valores negativos, superiores a 200 o iguales a 0");
                    System.out.println("Introduce tu DEFENSA (DEF)");
                    j2_def = scanner.nextInt();
                }
                j2_cp = j2_def + j2_cp;
                System.out.println("Has usado " + j2_cp + " puntos de estadísiticas");
            }
            while (j2_vel == 0) {
                System.out.println("Introduce tu VELOCIDAD (VEL)");
                j2_vel = scanner.nextInt();
                while (j2_vel > 200 || j2_vel <= 0) {
                    System.out.println("No introduzcas valores negativos, superiores a 200 o iguales a 0");
                    System.out.println("Introduce tu VELOCIDAD (VEL)");
                    j2_vel = scanner.nextInt();
                }
                j2_cp = j2_vel + j2_cp;
                System.out.println("Has usado " + j2_cp + " puntos de estadísiticas");
            }
        }

            System.out.println("""
                        ███████╗██╗ ██████╗ ██╗  ██╗████████╗
                        ██╔════╝██║██╔════╝ ██║  ██║╚══██╔══╝
                        █████╗  ██║██║  ███╗███████║   ██║  \s
                        ██╔══╝  ██║██║   ██║██╔══██║   ██║  \s
                        ██║     ██║╚██████╔╝██║  ██║   ██║  \s
                        ╚═╝     ╚═╝ ╚═════╝ ╚═╝  ╚═╝   ╚═╝  \s
                                                            \s""");

            //Muestro un resumen de los stats de ambos personajes seleccionados\\
            System.out.println("J1 - "+j1_nombre);
            System.out.println("Vida: "+j1_pv);
            System.out.println("Ataque: "+j1_atk);
            System.out.println("Defensa: "+j1_def);
            System.out.println("Velocidad: "+j1_vel);

            System.out.println("--------------------------------------------------------------------------------------------------------------------------");


            System.out.println("J2 - "+j2_nombre);
            System.out.println("Vida: "+j2_pv);
            System.out.println("Ataque: "+j2_atk);
            System.out.println("Defensa: "+j2_def);
            System.out.println("Velocidad: "+j2_vel);

            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------");

            //Empezamos el combate
            while (j1_pv > 0 || j2_pv > 0){
                ronda++;
                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                System.out.println("RONDA "+ronda);
                System.out.println("--------------------------------------------------------------------------------------------------------------------------");


                //El turno del j1 si tiene más velocidad
                if (j1_vel > j2_vel){
                    System.out.println(j1_nombre+",¿qué acción deseas realizar?");
                    System.out.println("1.ATACAR || 2.REGENERAR");
                    accion = scanner.nextInt();

                    switch (accion){
                        case 1 -> {
                            j1_atk_roll = roll.nextDouble(0.15, 0.5);
                            j2_def_roll = roll.nextDouble(0.07, 0.20);
                            atk_calc = (int) ((j1_atk * j1_atk_roll) * 3 / (j2_def * j2_def_roll));
                            j2_pv = j2_pv - atk_calc;
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                            System.out.println(j2_nombre+" recibe un ataque de "+atk_calc);
                            System.out.println(j2_nombre+" tiene "+j2_pv+" puntos de vida");
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------");

                        }
                        case 2 -> {
                            j1_pv_regen = roll.nextInt(1,50);
                            j1_pv = j1_pv + j1_pv_regen;
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                            System.out.println(j1_nombre+" regenera "+j1_pv_regen+" puntos de piva");
                            System.out.println("Ahora tiene "+j1_pv+" puntos de vida");
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                        }
                    }
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                    System.out.println(j2_nombre+",¿qué acción deseas realizar?");
                    System.out.println("1.ATACAR || 2.REGENERAR");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                    accion = scanner.nextInt();

                    switch (accion){
                        case 1 -> {
                            j2_atk_roll = roll.nextDouble(0.15, 0.5);
                            j1_def_roll = roll.nextDouble(0.07, 0.20);
                            atk_calc = (int) ((j2_atk * j2_atk_roll) * 3 / (j1_def * j1_def_roll));
                            j1_pv = j1_pv - atk_calc;
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                            System.out.println(j1_nombre+" recibe un ataque de "+atk_calc);
                            System.out.println(j1_nombre+" tiene "+j1_pv+" puntos de vida");
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                        }
                        case 2 -> {
                            j2_pv_regen = roll.nextInt(1,50);
                            j2_pv = j2_pv + j2_pv_regen;
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                            System.out.println(j2_nombre+" regenera "+j2_pv_regen+" puntos de piva");
                            System.out.println("Ahora tiene "+j2_pv+" puntos de vida");
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                        }
                    }
                }

                //El turno del j2 si tiene más velocidad
                if (j2_vel > j1_vel){
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                    System.out.println(j2_nombre+",¿qué acción deseas realizar?");
                    System.out.println("1.ATACAR || 2.REGENERAR");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                    accion = scanner.nextInt();

                    switch (accion){
                        case 1 -> {
                            j2_atk_roll = roll.nextDouble(0.15, 0.5);
                            j1_def_roll = roll.nextDouble(0.07, 0.20);
                            atk_calc = (int) ((j2_atk * j2_atk_roll) * 3 / (j1_def * j1_def_roll));
                            j1_pv = j1_pv - atk_calc;
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                            System.out.println(j1_nombre+" recibe un ataque de "+atk_calc);
                            System.out.println(j1_nombre+" tiene "+j1_pv+" puntos de vida");
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------");

                        }
                        case 2 -> {
                            j2_pv_regen = roll.nextInt(1,50);
                            j2_pv = j2_pv + j2_pv_regen;
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                            System.out.println(j2_nombre+" regenera "+j2_pv_regen+" puntos de piva");
                            System.out.println("Ahora tiene "+j2_pv+" puntos de vida");
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                        }
                    }
                    System.out.println(j1_nombre+",¿qué acción deseas realizar?");
                    System.out.println("1.ATACAR || 2.REGENERAR");
                    accion = scanner.nextInt();

                    switch (accion){
                        case 1 -> {
                            j1_atk_roll = roll.nextDouble(0.15, 0.5);
                            j2_def_roll = roll.nextDouble(0.07, 0.20);
                            atk_calc = (int) ((j1_atk * j1_atk_roll) * 3 / (j2_def * j2_def_roll));
                            j2_pv = j2_pv - atk_calc;
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                            System.out.println(j2_nombre+" recibe un ataque de "+atk_calc);
                            System.out.println(j2_nombre+" tiene "+j2_pv+" puntos de vida");
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------");

                        }
                        case 2 -> {
                            j1_pv_regen = roll.nextInt(1,50);
                            j1_pv = j1_pv + j1_pv_regen;
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                            System.out.println(j1_nombre+" regenera "+j1_pv_regen+" puntos de piva");
                            System.out.println("Ahora tiene "+j1_pv+" puntos de vida");
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                        }

                    }
                }

                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                System.out.println("¡TENÉIS LA MISMA VELOCIDAD!");
                System.out.println("Se lanzará un dado aleatorio para decidir de quién será el turno");
                System.out.println("--------------------------------------------------------------------------------------------------------------------------");

                if (j1_vel == j2_vel){

                    int turnoaleatorio = roll.nextInt(1,2);

                    if (turnoaleatorio == 1) {
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                        System.out.println(j1_nombre+",¿qué acción deseas realizar?");
                        System.out.println("1.ATACAR || 2.REGENERAR");
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

                        accion = scanner.nextInt();

                        switch (accion){
                            case 1 -> {
                                j1_atk_roll = roll.nextDouble(0.15, 0.5);
                                j2_def_roll = roll.nextDouble(0.07, 0.20);
                                atk_calc = (int) ((j1_atk * j1_atk_roll) * 3 / (j2_def * j2_def_roll));
                                j2_pv = j2_pv - atk_calc;
                                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                                System.out.println(j2_nombre+" recibe un ataque de "+atk_calc);
                                System.out.println(j2_nombre+" tiene "+j2_pv+" puntos de vida");
                                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                            }
                            case 2 -> {
                                j1_pv_regen = roll.nextInt(1,50);
                                j1_pv = j1_pv + j1_pv_regen;
                                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                                System.out.println(j1_nombre+" regenera "+j1_pv_regen+" puntos de piva");
                                System.out.println("Ahora tiene "+j1_pv+" puntos de vida");
                                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                            }

                        }
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                        System.out.println(j2_nombre+",¿qué acción deseas realizar?");
                        System.out.println("1.ATACAR || 2.REGENERAR");
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

                        accion = scanner.nextInt();

                        switch (accion){
                            case 1 -> {
                                j2_atk_roll = roll.nextDouble(0.15, 0.5);
                                j1_def_roll = roll.nextDouble(0.07, 0.20);
                                atk_calc = (int) ((j2_atk * j2_atk_roll) * 3 / (j1_def * j1_def_roll));
                                j1_pv = j1_pv - atk_calc;
                                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                                System.out.println(j1_nombre+" recibe un ataque de "+atk_calc);
                                System.out.println(j1_nombre+" tiene "+j1_pv+" puntos de vida");
                                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                            }
                            case 2 -> {
                                j2_pv_regen = roll.nextInt(1,50);
                                j2_pv = j2_pv + j2_pv_regen;
                                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                                System.out.println(j2_nombre+" regenera "+j2_pv_regen+" puntos de piva");
                                System.out.println("Ahora tiene "+j2_pv+" puntos de vida");
                                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                            }
                        }
                    }
                    if (turnoaleatorio == 2){
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                        System.out.println(j2_nombre+",¿qué acción deseas realizar?");
                        System.out.println("1.ATACAR || 2.REGENERAR");
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                        accion = scanner.nextInt();

                        switch (accion){
                            case 1 -> {
                                j2_atk_roll = roll.nextDouble(0.15, 0.5);
                                j1_def_roll = roll.nextDouble(0.07, 0.20);
                                atk_calc = (int) ((j2_atk * j2_atk_roll) * 3 / (j1_def * j1_def_roll));
                                j1_pv = j1_pv - atk_calc;
                                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                                System.out.println(j1_nombre+" recibe un ataque de "+atk_calc);
                                System.out.println(j1_nombre+" tiene "+j1_pv+" puntos de vida");
                                System.out.println("--------------------------------------------------------------------------------------------------------------------------");

                            }
                            case 2 -> {
                                j2_pv_regen = roll.nextInt(1,50);
                                j2_pv = j2_pv + j2_pv_regen;
                                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                                System.out.println(j2_nombre+" regenera "+j2_pv_regen+" puntos de piva");
                                System.out.println("Ahora tiene "+j2_pv+" puntos de vida");
                                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                            }
                        }
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                        System.out.println(j1_nombre+",¿qué acción deseas realizar?");
                        System.out.println("1.ATACAR || 2.REGENERAR");
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                        accion = scanner.nextInt();
                        switch (accion){
                            case 1 -> {
                                j1_atk_roll = roll.nextDouble(0.15, 0.5);
                                j2_def_roll = roll.nextDouble(0.07, 0.20);
                                atk_calc = (int) ((j1_atk * j1_atk_roll) * 3 / (j2_def * j2_def_roll));
                                j2_pv = j2_pv - atk_calc;
                                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                                System.out.println(j2_nombre+" recibe un ataque de "+atk_calc);
                                System.out.println(j2_nombre+" tiene "+j2_pv+" puntos de vida");
                                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                            }
                            case 2 -> {
                                j1_pv_regen = roll.nextInt(1,50);
                                j1_pv = j1_pv + j1_pv_regen;
                                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                                System.out.println(j1_nombre+" regenera "+j1_pv_regen+" puntos de piva");
                                System.out.println("Ahora tiene "+j1_pv+" puntos de vida");
                                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                            }
                        }
                    }
                }

            if (j1_pv <= 0) {
                j1_pv = 0;
                System.out.println("¡HA GANADO "+j2_nombre+"!");
                System.out.println("ENHORABUENA");
            }
            if (j2_pv <= 0) {
                j2_pv = 0;
                System.out.println("¡HA GANADO "+j1_nombre+"!");
                System.out.println("ENHORABUENA");
            }
        }
    }
}

