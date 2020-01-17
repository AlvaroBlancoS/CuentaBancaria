
public class Cuenta {
	String cliente, cuenta;
	protected double tipo, importe;

	public Cuenta() {
	}

	public Cuenta(String cliente, String cuenta, double tipo, double importe) {
		this.cliente = cliente;
		this.cuenta = cuenta;
		this.tipo = tipo;
		this.importe = importe;
	}

	public Cuenta(final Cuenta c) {
		cliente = c.cliente;
		cuenta = c.cuenta;
		tipo = c.tipo;
		importe = c.importe;

	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getTipo() {
		return tipo;
	}

	public void setTipo(double tipo) {
		this.tipo = tipo;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public double importe(double importar) {

		if (importar < 0) {
			System.out.println("No se puede escribir un numero negativo");
		} else {
			importe += importar;
		}

		return importe;
	}

	public double ingresar(double ingresar) {
		if (ingresar < 0) {
			System.out.println("No se puede introducir un numero negativo");
		} else {
			importe += ingresar;
			System.out.println("En total es: " + importe);
		}

		return importe;
	}

	public double retirar(double retirar) {
		if (retirar < 0 || retirar > importe) {
			if (retirar < 0) {
				System.out.println("No se puede introducir un numero negativo");
			} else if (retirar > importe) {
				System.out.println("No tienes suficiente dinero");
			}

		} else {
			importe -= retirar;
			System.out.println("Has retirado " + retirar + " y ahora tienes " + importe);
		}

		return importe;
	}

	// Crear un metodo de modo transferencia. Aun no he averiguado
	@Override
	public String toString() {
		return "cliente: " + cliente + ", cuenta:" + cuenta + ", importe: " + importe;
	}

}
