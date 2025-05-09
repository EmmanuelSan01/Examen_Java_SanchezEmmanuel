package view;

import controller.ClienteController;
import java.util.Scanner;
import model.Cliente;

/**
 *
 * @author camper
 */
public class ClienteView {

    private static String nombre, representante, correo, telefono, direccion, sector;
    static Cliente c = new Cliente(nombre, representante, correo, telefono, direccion, sector);

    public static void insertarCliente() {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese el nombre del cliente");
        nombre = sc.nextLine().trim();
        System.out.println("\nIngrese el representante del cliente");
        representante = sc.nextLine().trim();
        System.out.println("\nIngrese el correo del cliente");
        correo = sc.nextLine().trim();
        System.out.println("\nIngrese el telefono del cliente");
        telefono = sc.nextLine().trim();
        System.out.println("\nIngrese la direccion del cliente");
        direccion = sc.nextLine().trim();
        System.out.println("\nIngrese el sector del cliente");
        sector = sc.nextLine().trim();
        sc.close();

        ClienteController.registrarCliente(c);
    }

    public static void listarClientes() {
        ClienteController.listarClientes();
    }
}