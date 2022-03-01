package prac3;

public class alumnos {
	String nombre, materia, estado;
	int matricula,cal;
	
	
	public alumnos(String _nombre, String _materia, int _matricula, int _cal) {
		nombre = _nombre;
		materia = _materia;
		matricula = _matricula;
		cal = _cal;
	}
	public void mostrar() {
		System.out.print("Nombre: "+nombre +"\n");
		System.out.print("Matricula: "+matricula+"\n");
		System.out.print("Materia: "+materia+"\n");
		System.out.print("Calificación: "+cal+"\n");
		AsignarEstado();
		System.out.print("Estado: "+estado+"\n\n");
	}
	public void AsignarEstado() {
		if(cal<60) {
			estado = "Reprobado";
		}else {
			estado = "Aprobado";
		}
	}
	

}
