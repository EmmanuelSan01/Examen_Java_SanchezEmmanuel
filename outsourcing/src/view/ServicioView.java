package view;

import controller.ServicioController;
import static java.lang.Double.parseDouble;
import java.util.Scanner;
import model.Servicio;

/**
 *
 * @author camper
 */
public class ServicioView {

    private static String nombre, descripcion, categoria;
    private static Double precioxhora;
    static Servicio s = new Servicio(nombre, descripcion, categoria, precioxhora);

    public static void insertarCliente() {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese el nombre del servicio");
        nombre = sc.nextLine().trim();
        System.out.println("\nIngrese la descripcion del servicio");
        descripcion = sc.nextLine().trim();
        System.out.println("\nIngrese el precio por hora del servicio");
        precioxhora = Double.valueOf(sc.nextLine().trim());
        System.out.println("\nIngrese la categoria del servicio");
        categoria = sc.nextLine().trim();
        sc.close();

        ServicioController.registrarServicio(s);
    }

    public static void listarClientes() {
        ServicioController.listarServicios();
    }
}