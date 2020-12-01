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
		if (determinar_sexo == CHICO) {
			nombre = NOMBRES_CHICOS[MetodosSueltos.generaNumeroAleatorio(0, 4)];
			sexo = 'H';
		} else {
			nombre = NOMBRES_CHICAS[MetodosSueltos.generaNumeroAleatorio(0, 4)];
			sexo = 'M';
		}
	disponibilidad(); 
	}

	protected abstract void disponibilidad();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isAsistencia() {
		return asistencia;
	}

	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}
	
	
}

