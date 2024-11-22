package classroom;

public enum Tipo {
	DISCIPLINAR(10, "Sin nombre"),FUNDAMENTACION(20, "Sin nombre"),ELECTIVA(30, "Sin nombre");
	
	/*private*/public int codigo;
	/*private*/public String nombre;
	/*public*/ Tipo(int codigo ,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
