package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	/*private*/public int codigo;
	/*private*/public String nombre;
	/*public*/private Tipo(int codigo /*,String nombre*/) {
		this.codigo = codigo;
		this.nombre = ""/*nombre*/;
	}
}
