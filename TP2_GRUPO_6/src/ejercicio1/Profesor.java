package ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor>{
	private String Cargo;
	private int AntiguedadDocente;
	
	//constructores
	public Profesor() {
		super();
		this.Cargo = "Sin cargo";
		this.AntiguedadDocente = 0;
	}

	
	
	public Profesor(String cargo, int antiguedadDocente) {
		super();
		Cargo = cargo;
		AntiguedadDocente = antiguedadDocente;
	}



	public Profesor(String nombre, int edad, String cargo, int antiguedadDocente) {
		super(nombre, edad);
		Cargo = cargo;
		AntiguedadDocente = antiguedadDocente;
	}



	//getters y setters
	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public int getAntiguedadDocente() {
		return AntiguedadDocente;
	}

	public void setAntiguedadDocente(int antiguedadDocente) {
		AntiguedadDocente = antiguedadDocente;
	}
	
	//compareTO()
	@Override
	public int compareTo(Profesor profe) {
		if (this.getId() < profe.getId()) {
	        return -1; //va antes
	    } else if (this.getId() > profe.getId()) {
	        return 1; //va despues
	    } else {
	        return 0; //el id es el mismo, no lo guarda
	    }
	}
	
	//equals
	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;
	    if (obj == null || getClass() != obj.getClass())
	        return false;
	    
	    Profesor otro = (Profesor) obj;
	    
	    return this.getNombre().equals(otro.getNombre()) &&
	           this.getEdad() == otro.getEdad() &&
	           this.Cargo.equals(otro.Cargo) &&
	           this.AntiguedadDocente == otro.AntiguedadDocente;
	}
	
	@Override
    public String toString() {
        return "Profesor: ID: " + getId() + ", Nombre: " + getNombre() + ", Edad: " + getEdad() + 
                ", Cargo: " + Cargo + ", Antiguedad Docente: "+ AntiguedadDocente;
    }
}

