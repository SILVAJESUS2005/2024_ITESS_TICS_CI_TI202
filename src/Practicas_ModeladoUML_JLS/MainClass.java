package Practicas_ModeladoUML_JLS;

import Alumno_JLS.Alumno;
import Casa_JLS.Casa;
import Celular_JLS.Cel;
import CuentaBancaria_JLS.CuentaBancaria;
import INE_JLS.INE;
import Lapiz_JLS.Lapiz;
import Libro_JLS.Libro;
import Mochila_JLS.Mochila;
import PC_JLS.PC;
import Persona_JLS.Persona;
import Serie_JLS.Serie;
import Television_JLS.Television;
import Vehiculo_JLS.Vehiculo;
import Videojuegos_JLS.Videojuegos;

public class MainClass {

    public static void main(String[] args) {
        //CLASE 1 ALUMNO
        Alumno a1 = new Alumno();

        a1.setMatricula(2023192110);
        a1.setPromedio(97);
        a1.setCmaterias(8);
        a1.setEscuela("ITESS");
        a1.setHorario(" 8 am a 2 pm");

        System.out.println(a1.toString());

        a1.aplicar("Aplicar a administrar las direcciones IP de una RED");
        a1.aprender("Aprendizaje en clase y en trabajos");
        a1.participar(2);

        //CLASE 2 CASA
        Casa c1 = new Casa("20x20 metros", 2, "Azul rey", "Cemento y ladrillo", "Marmol");
        System.out.println(c1.toString());
        c1.vivienda("Jesus Lopez Silva");
        c1.refugio("CJNG");
        c1.almacenar("JESUS LOPEZ SILVA", "Botellas");

        //CLASE 3 CUENTA BANCARIA
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Perez", "123456789", 1000.0, "Ahorros", "HSBC");

        System.out.println(cuenta1.toString());
        cuenta1.consultarSaldo();

        cuenta1.depositar(500.0);

        cuenta1.retirar(200.0);

        cuenta1.consultarSaldo();

        //CLASE 4 INE
        INE i1 = new INE();

        i1.setNombre("JESUS");
        i1.setApellido("LOPEZ SILVA");
        i1.setNumero("4661087122");
        i1.setDireccion("CRISTOBAL COLON #26");
        i1.setEdad(19);
        System.out.println(i1.toString());
        i1.imprimirNombreCompleto();
        i1.actualizarDireccion("Privada 10 de Mayo");
        i1.verificarMayorEdad();

        //CLASE 5 LAPIZ
        Lapiz lapiz2 = new Lapiz();

        lapiz2.setColor("Azul");
        lapiz2.setMarca("BIC");
        lapiz2.setLongitud(14.5);
        lapiz2.setTipoPunta("2B");
        lapiz2.setPeso(8.2);
        System.out.println(lapiz2.toString());

        lapiz2.iniciar("BIC");
        lapiz2.terminar("BIC");
        lapiz2.borrar("BIC");
        //CLASE 6 LIBRO
        Libro l1 = new Libro();

        l1.setTema("Educacion y aprendizaje");
        l1.setPaginas(243);
        l1.setPeso(235);
        l1.setColor("Rojo");
        l1.setPrecio(544);

        System.out.println(l1.toString());
        l1.inspirar(" El hacer constantemente ejercicios te facilitara tu progreso en este ambito ", " MATEMATICAS DE UNA FORMA SIMPLE ");
        l1.educar(" Universidad ");
        l1.entretener(" Jugar basquetbol ");

        //CLASE 7 MOCHILA
        Mochila m1 = new Mochila("Grande", 3000, "ADIDAS", 2, "Azul");
        System.out.println(m1.toString());
        m1.transporte("Jesus", "CASA", "ITESS");
        m1.organizacion("6");
        m1.movilidad("25 LIBROS");
        //CLASE 8 PC
        PC pc1 = new PC("Pavilion x360 Convertible", "HP", 1.56, "Dorado", 8);
        System.out.println(pc1.toString());
        pc1.procesar("EDITOR DE VIDEOS PARA YOUTUBE", "JESUS LOPEZ SILVA");
        pc1.almacenar("fotos y videos");
        System.out.println("Abriendo . . . " + pc1.operar(2));

        //CLASE 9 PERSONA
        Persona p1 = new Persona();

        p1.setNombre("Genaro");
        p1.setApellido("Hernandez");
        p1.setEdad(18);
        p1.setPeso(65);
        p1.setAltura(175);
        System.out.println(p1.toString());

        p1.respirar("90", "120");
        p1.comer("pollo a la arrachera", 360);
        p1.sanitario("MASCULINO");

        //CLASE 10 SERIE
        Serie serie1 = new Serie("Terror bajo el agua", "Terror", 1.56, "Dianna, Mike, Carmelo", 12);
        System.out.println(serie1.toString());
        serie1.iniciar("Terror bajo el agua", "2");
        serie1.pausar("1.56", "6");
        serie1.terminar("Terror bajo el agua", "12");

        //CLASE 11 TELEVISIÓN
        Television tv = new Television("Negro", "Samsung", 1080, "Android", 12);
        System.err.println(tv.toString());
        tv.iniciar("Samsung", "1080");
        tv.pausar("Samsung", "1080");
        tv.terminar("Samsung", "Negro");

        //CLASE 12 VEHICULO
        Vehiculo vehiculo1 = new Vehiculo(4, "Toyota", "Azul", 240, 2012);
        System.out.println(vehiculo1.toString());
        vehiculo1.avanza("Toyota", "60");
        vehiculo1.frena("Toyota", "0");
        vehiculo1.pita("Toyota", "Azul");

        Vehiculo vehiculo2 = new Vehiculo(4, "Hiunday", "Rojo", 300, 2023);
        System.out.println(vehiculo2.toString());
        vehiculo2.avanza("Hiunday", "70");
        vehiculo2.frena("Hiunday", "0");
        vehiculo2.pita("Hiunday", "Rojo");

        //CLASE 13 VIDEOJUEGOS
        Videojuegos juego1 = new Videojuegos();

        juego1.setGenero("Terror, Accion");
        juego1.setNivel(61);
        juego1.setNombre("Free Fire");
        juego1.setNousuario("xChuy");
        juego1.setRango("Heroico");

        System.out.println(juego1.toString());

        juego1.iniciar("Free Fire", 33);
        juego1.terminar("xChuy", "Heroico");
        juego1.jugar("xChuy");

        //CLASE 14 CELULAR
        Cel Cel1 = new Cel("Samsung", "S24", 7.1, 14.1, 108, 256);
        System.out.println(Cel1.toString());
        Cel1.llamar("Carmelo", "466-123-88-77");
        String SMS = Cel1.mensaje("Carmelo", "466-123-88-77", ">:");
        System.out.println(SMS);
        System.out.println("Abriendo . . . " + Cel1.abrirApp(2) + "\n");

        Cel cel2 = new Cel();
        System.out.println(cel2.toString());
        String SMS2 = "POCO S3";
        cel2.setMarca("Xiaomi");
        cel2.setAlmacenamiento(256);
        cel2.setCamaraT(60);
        cel2.setModelo(SMS2);
        cel2.setPulgadas(7.1);
        cel2.setVersionSO(14);
        String SMS3 = cel2.mensaje("Miguel", "466-135-34-21", "Hola como estas? ");
        cel2.llamar(SMS3, SMS2);
    }
}
