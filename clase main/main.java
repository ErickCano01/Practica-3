package prac3;

import java.util.Scanner;

public class main {
	
	static String nombre6="", materia6="",nombre7="", materia7="",nombre8="", materia8="";
	static String nombre9="", materia9="",nombre10="", materia10="";
	static int matricula6=0,cal6=0,matricula7=0,cal7=0, matricula8=0,cal8=0,matricula9=0,cal9=0;
	static int matricula10=0,cal10=0;
	static Scanner tec= new Scanner(System.in);
	
	public static void main(String [] args) {
		int op=0;
		boolean t= true;
		while(t== true) {
			System.out.println("Eliga una opcion");
			System.out.println("1) Capturar Alumnos");
			System.out.println("2) Mostrar Alumnos ");
			System.out.println("3) salir ");
			op= tec.nextInt();
			switch(op) {
			case 1:
				pedida();
				break;
			case 2:
				most();
				break;
			case 3:
				System.out.print("Adios");
				t= false;
				break;
			default:
				System.out.print("Ese numero no es valido\n\n");
			}	
		}
	}
	public static void pedida() {
		nombre6= tec.nextLine();
		System.out.print("Ingrese el nombre 6: ");
		nombre6= tec.nextLine();
		System.out.print("Ingrese la materia 6: ");
		materia6= tec.nextLine();
		System.out.print("Ingrese la matricula 6: ");
		matricula6= tec.nextInt();
		System.out.print("Ingrese la calificación 6: ");
		cal6= tec.nextInt();
		System.out.print("\n");
		
		nombre7= tec.nextLine();
		System.out.print("Ingrese el nombre 7: ");
		nombre7= tec.nextLine();
		System.out.print("Ingrese la materia 7: ");
		materia7= tec.nextLine();
		System.out.print("Ingrese la matricula 7: ");
		matricula7= tec.nextInt();
		System.out.print("Ingrese la calificación 7: ");
		cal7= tec.nextInt();
		System.out.print("\n");
		
		nombre8= tec.nextLine();
		System.out.print("Ingrese el nombre 8: ");
		nombre8= tec.nextLine();
		System.out.print("Ingrese la materia 8: ");
		materia8= tec.nextLine();
		System.out.print("Ingrese la matricula 8: ");
		matricula8= tec.nextInt();
		System.out.print("Ingrese la calificación 8: ");
		cal8= tec.nextInt();
		System.out.print("\n");
		
		nombre9= tec.nextLine();
		System.out.print("Ingrese el nombre 9: ");
		nombre9= tec.nextLine();
		System.out.print("Ingrese la materia 9: ");
		materia9= tec.nextLine();
		System.out.print("Ingrese la matricula 9: ");
		matricula9= tec.nextInt();
		System.out.print("Ingrese la calificación 9: ");
		cal9= tec.nextInt();
		System.out.print("\n");
		
		nombre10= tec.nextLine();
		System.out.print("Ingrese el nombre 10: ");
		nombre10= tec.nextLine();
		System.out.print("Ingrese la materia 10: ");
		materia10= tec.nextLine();
		System.out.print("Ingrese la matricula 10: ");
		matricula10= tec.nextInt();
		System.out.print("Ingrese la calificación 10: ");
		cal10= tec.nextInt();
		System.out.print("\n");
		
	}
	public static void most() {
		alumnos a1 = new alumnos("Erick Cano","Programación",1279386,80);
		alumnos a2 = new alumnos("Axel Lizarraga","Química",1279089,98);
		alumnos a3 = new alumnos("Gustavo Alvarez","Mercadotecnia",1279777,100);
		alumnos a4 = new alumnos("Cesar Lara","Ingeníeria de procesos",1279026,90);
		alumnos a5 = new alumnos("Imanol Marin","Administración",1279686,59);
		a1.mostrar();
		a2.mostrar();
		a3.mostrar();
		a4.mostrar();
		a5.mostrar();
		alumnos a6 = new alumnos(nombre6,materia6,matricula6,cal6);
		alumnos a7 = new alumnos(nombre7,materia7,matricula7,cal7);
		alumnos a8 = new alumnos(nombre8,materia8,matricula8,cal8);
		alumnos a9 = new alumnos(nombre9,materia9,matricula9,cal9);
		alumnos a10 = new alumnos(nombre10,materia10,matricula10,cal10);
		a6.mostrar();
		a7.mostrar();
		a8.mostrar();
		a9.mostrar();
		a10.mostrar();
	}
	
}
