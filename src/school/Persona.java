package school;

public abstract class Persona {
	private final String[] NOMBRES_CHICOS = {"Pepe", "Fernando", "Alberto", "Nacho", "Eustaquio"};
	private final String[] NOMBRES_CHICAS = {"Alicia", "Laura", "Clotilde", "Pepa", "Elena"};
	private final int CHICO = 0;
	private final int CHICA = 1;
	
	private String nombre;
	private char sexo;
	private int edad;
	private boolean asistencia;
	
	public Persona() {
		int determinar_sexo = MetodosSueltos.generaNumeroAleatorio(0, 1);
	}
	
	
}

