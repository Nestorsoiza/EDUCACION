package school;

public class Profesor extends Persona {

	private String materia;
	
	
	public Profesor(){
	       super(); //Llama al constructor padre
	        
	       super.setEdad(MetodosSueltos.generaNumeroAleatorio(25,50)); //llama al metodo padre
	        
	       materia=Constantes.MATERIAS[MetodosSueltos.generaNumeroAleatorio(0,2)];
	    }


	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}


	@Override
	protected void disponibilidad() {
		int prob = MetodosSueltos.generaNumeroAleatorio(0, 100);
		if (prob < 20) {
			super.setAsistencia(false);
		} else {
			super.setAsistencia(true);
		}
	}
}
