import java.util.Scanner;

public class Main {

	// Crear una restriccion que el numero de la cuenta tiene que ser válido
	// Crear un array para registrar cantidad de cliente

	/*
	 * Es muy básico. El problema es que al finalizar de retirar el dinero, el bucle sigue funcionando que no debería
	 */
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Cuenta c1 = new Cuenta();
		System.out.print("Nombre del cliente: ");
		String cliente = in.nextLine();
		c1.setCliente(cliente);
		System.out.print("Numero de cuenta: ");
		String cuenta = in.nextLine();
		c1.setCuenta(cuenta);
		System.out.print("Importe: ");
		double importe = in.nextDouble();
		while (importe < 0) {
			c1.importe(importe);
			importe = in.nextDouble();
		}
		c1.importe(importe);
		System.out.println(c1.toString());
		System.out.println("Ingrese la cuenta por favor");
		double ingresar = in.nextDouble();
		while (ingresar < 0) {
			c1.ingresar(ingresar);
			ingresar = in.nextDouble();
		}
		c1.ingresar(ingresar);
		System.out.println(c1.toString());

		System.out.println("Retire el dinero por favor");
		double retirar = in.nextDouble();

		while (retirar < 0 || retirar > importe) {
			c1.retirar(retirar);
			retirar = in.nextDouble();
		}
		c1.retirar(retirar);
		System.out.println(c1.toString());
	}

}
