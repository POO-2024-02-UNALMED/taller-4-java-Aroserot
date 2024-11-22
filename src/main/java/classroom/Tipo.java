package classroom;

public enum Tipo {
	DISCIPLINAR(10, "Disciplinar"),FUNDAMENTACION(20, "Fundamentacion"),ELECTIVA(30, "Electiva");//Para que use su constructor
	
	public int codigo;
	public String nombre;
	private Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
