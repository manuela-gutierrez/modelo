package org.example;

import org.example.modelos.Accidente;
import org.example.modelos.Asegurado;
import org.example.modelos.Aseguradora;
import org.example.modelos.Vehiculo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Asegurado aseguradoUno = new Asegurado();
        Asegurado aseguradoDOs = new Asegurado(85, 2, 3, 59000, "carlos", "masculino", "soltero", "maestro", "sano", "sin habitos", "3", "completa", "medellin", "efectivo", "personales");

        System.out.println(aseguradoUno);
        System.out.println(aseguradoDOs);

        Vehiculo vehiculoUno = new Vehiculo();
        Vehiculo vehiculoDos = new Vehiculo(56,2024,7,8000,2.0,5.000,2.000,"MAZDA","2024","EDS456","NEGRO","CAMIONETA","GASOLINA","MALA",LocalDateTime.now());

        System.out.println(vehiculoUno);
        System.out.println(vehiculoDos);

        Accidente accidenteUno = new Accidente();
        Accidente accidenteDos = new Accidente(LocalDateTime.now(),85,"horiental","accidenten automovilictico","2:50pm","muy grave","pareja","accidente****","exceso velocidad","conductor auto","en curso","ambos autos destruidos",5.000,3,5);

        System.out.println(accidenteUno);
        System.out.println(accidenteDos);

        Aseguradora aseguradoraUno = new Aseguradora();
        Aseguradora aseguradoraDos = new Aseguradora("camila",25,"cra 77 #110-4","3025922525","camila@gmail.com","aseguradora.com","familiar","buen servicio","completa","los implcados estas hospitalizados",LocalDateTime.now(),58,5,3.220,9.000);

        System.out.println(aseguradoraUno);
        System.out.println(accidenteDos);

        Scanner  scanner = new Scanner(System.in);
        System.out.println("ingresa tu nombre");
        String nombre= scanner.nextLine();
        System.out.println("ingresa id");
        long id = scanner.nextLong();
        System.out.println("ingresa direccion");
        String direccion = scanner.nextLine();
        System.out.println("ingresa telefono");
        String telfono = scanner.nextLine();
        System.out.println("ingresa email");
        String email = scanner.nextLine();
        System.out.println("ingrese nombre sitio web");
        String sitioWeb = scanner.nextLine();
        System.out.println("ingresa tipo aseguradora");
        String tipoAseguradora = scanner.nextLine();
        System.out.println("servicio al cliente");
        String servicioCliente = scanner.nextLine();
        System.out.println("ingres tipo de cobertura");
        String tipocovertura = scanner.nextLine();
        System.out.println("algunas Observaciones");
        String observaciones = scanner.nextLine();
        System.out.println("numero de polizas");
        Integer numeroPolizas = scanner.nextInt();
        System.out.println("numero de sucursal");
        Integer nuemroSucursales = scanner.nextInt();
        System.out.println("calificacion");
        Double calificacion = scanner.nextDouble();
        System.out.println("monto de cobertura");
        Double montoMaximoCobertura = scanner.nextDouble();

        Aseguradora aseguradora=new Aseguradora(nombre,id,direccion,telfono,email,sitioWeb,tipoAseguradora,servicioCliente,tipocovertura,observaciones,LocalDateTime.now(),numeroPolizas,nuemroSucursales,calificacion,montoMaximoCobertura);
    }
}


