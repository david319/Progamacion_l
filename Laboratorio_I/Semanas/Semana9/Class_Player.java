package Semana9;

import java.util.ArrayList;
import java.util.Scanner;

public class Class_Player {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    // Atributos
    private static ArrayList<Player> players = new ArrayList<>();
    private static String[] nombres = new String[2];
    private static int[] p_Ganadas = new int[2];

    // Métodos
    public static void register_Player(String name){
        System.out.println("Ingrese una contraseña de 5 caracteres:");
        String password = leer.next();
        if(password.length() > 0 && password.length() <= 5){
            Player player = new Player(name, password);
            players.add(player);
            System.out.println("Usuario registrado con éxito");
        } else {
            System.out.println("Contraseña inválida");
        }
    }

    public static boolean login_player(String name, String password){
        for(Player player : players){
            if(player.getNombre().equals(name) && Player.getPassword().equals(password)){
                nombres[0] = player.getNombre();
                return true;
            }
        }
        System.out.println("Usuario o contraseña incorrectos");
        return false;
    }

    static boolean verify(String nombre){
        for(int i = 0; i < players.size(); i++){
            if(players.get(i).getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }

    public static boolean v_Player2(String nombre){
        verify(nombre);
        nombres[1] = nombre;
        return true;
    }

    public static String obtener_player1(){
        return nombres[0];
    }

    public static String obtener_player2(){
        return nombres[1];
    }

    static void add_p_Ganadas1(int p_Ganadas){
        for (int i = 0; i < players.size(); i++) {
            if(players.get(i).getNombre().equals(nombres[0])){
                players.get(i).setPGanadas(p_Ganadas);
            }
        }
    }

    static void add_p_Ganadas2(int p_Ganadas){
        for (int i = 0; i < players.size(); i++) {
            if(players.get(i).getNombre().equals(nombres[1])){
                players.get(i).setPGanadas(p_Ganadas);
            }
        }
    }

}
