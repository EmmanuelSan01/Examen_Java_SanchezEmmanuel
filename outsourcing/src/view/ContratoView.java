package view;

import controller.ContratoController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import model.Contrato;

/**
 *
 * @author camper
 */
public class ContratoView {

    private static int cliente, servicio;
    private static Date fechainicio, fechafin;
    private static double costototal;
    private static String estado;
    static Contrato c = new Contrato(cliente, servicio, fechainicio, fechafin, costototal, estado);
    static SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
    

    public static void insertarContrato() throws ParseException {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        System.out.println("\nIngrese el cliente asociado");
        cliente = Integer.parseInt(sc.nextLine().trim());
        System.out.println("\nIngrese el servicio asociado");
        servicio = Integer.parseInt(sc.nextLine().trim());
        System.out.println("\nIngrese la fecha de inicio");
        fechainicio = formatter.parse(input);
        System.out.println("\nIngrese la fecha de fin");
        fechafin = formatter.parse(input);
        System.out.println("\nIngrese el costo total");
        costototal = Double.parseDouble(sc.nextLine().trim());
        System.out.println("\nIngrese el estado");
        estado = sc.nextLine().trim();
        sc.close();

        ContratoController.registrarContrato(c);
    }

    public static void listarContratos() {
        ContratoController.listarContratos();
    }
}