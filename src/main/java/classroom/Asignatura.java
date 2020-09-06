package classroom;

public class Asignatura {

    String nombre;
    String n = nombre;
    int codigoInterno;
    int codigoExterno;

    Asignatura() {
        this("Sin nombre", 0, 0);
    }

    Asignatura(int codigoExterno) {
        this("Sin nombre", 0, codigoExterno);
    }

    Asignatura(String nombre) {
        this(nombre, 0, 0);
    }

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public int getCodigoInterno() {
		return codigoInterno;
	}

	public void setCodigoInterno(int codigoInterno) {
		this.codigoInterno = codigoInterno;
	}

	public int getCodigoExterno() {
		return codigoExterno;
	}

	public void setCodigoExterno(int codigoExterno) {
		this.codigoExterno = codigoExterno;
	}

	Asignatura(String nombre, int codigoInterno, int codigoExterno) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(int codigoInterno, int codigoExterno, String nombre) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
    }
    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }
     void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }
}