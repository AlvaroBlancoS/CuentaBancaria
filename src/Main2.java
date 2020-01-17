import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main2 {

	/*
	 * Esta es la parte más complicado cuando tenemos más clientes. Hemos utilizado arrayList y un iterator
	 * en vez de un array normal y que va recorriendo con un simple bucle for. 
	 * El problema es que no funciona correctamente el registro y tengo que averiguar más tarde. 
	 */
	
	public static void main(String[] args) {
		// Trabajar con los arraysList e iterator y por supuesto los arrays que ya
		// existen

		// Tenemos dos clientes que existen
		Cuenta c1 = new Cuenta("Alvarito", "535675912l", 20, 0);
		Cuenta c2 = new Cuenta("Juanito", "593012912r", 20, 0);

		// Creamos una lista de array de la clase cuenta
		ArrayList<Cuenta> c = new ArrayList<Cuenta>();

		c.add(c1);
		c.add(c2);

		// Recorremos la lista
		Iterator<Cuenta> iterator = c.iterator();

		// -------------------------------------Busqueda de numero de
		// cuenta---------------------------------//
		System.out.print("Numero de la cuenta por favor: ");
		Scanner in = new Scanner(System.in);
		boolean existe = false;
		int i = 0;
		String buscarCuenta = in.nextLine();
		if (iterator.hasNext()) {

			while (iterator.hasNext() && existe == false) {
				Cuenta ejem = iterator.next();

				if (ejem.cuenta.equalsIgnoreCase(buscarCuenta)) {
					existe = true;

				}

				i++;
			}

		} else {
			System.out.println("No existe la lista");
		}

		// -----------------------------------Si existe el numero de la cuenta, ingresamos y retiramos el dinero-------------//
		
		String o = null; //Para introducir una respuesta si o no
		Scanner on = new Scanner(System.in);// Nuevo teclado solo para los que existen la cuenta y para registrar
		
		if (existe) {
			System.out.println("Existe la cuenta \n ¿Ingresar la cuenta? si/no");
			String t = in.nextLine();
			if (t.equalsIgnoreCase("si")) {
				System.out.println("Cuanto quieres ingresar?");
				/// Algo tengo que escribir el teclado para ingresar el dinero
				c.get(i - 1).ingresar(in.nextDouble());
				for (Cuenta ejem : c) {
					System.out.println("Cliente: " + ejem.cliente + " Numero de cuenta: " + ejem.cuenta + " importe: "
							+ ejem.importe);
				}
			} else {
				System.out.println("Gracias por vuestra atencion");
			}
			
			System.out.println("Quieres retirar el dinero? si/no");
			o = on.nextLine();

			if (o.equalsIgnoreCase("si")) {
				System.out.println("Cuantos quieres retirar? si/no");
				// Algo tengo que escribir el teclado para retirar el dinero
				c.get(i - 1).retirar(in.nextDouble());
				for (Cuenta ejem : c) {
					System.out.println("Cliente: " + ejem.cliente + "Numero de cuenta: " + ejem.cuenta + " importe: "
							+ ejem.importe);
				}
			} else {
				System.out.println("Gracias por vuestra atencion");
			}
		}
		// -------------------------------Creamos la cuenta para el nuevo cliente---------------------------------------//
		else {

			System.out.println("No existe el numero de cuenta \n ¿Quieres registrar? si/no");
			o = on.nextLine();
			if (o.equalsIgnoreCase("si")) {
				System.out.print("Creando la cuenta... \n Nombre del cliente: ");
				Cuenta nuevo = new Cuenta();
				nuevo.setCuenta(buscarCuenta);//No hace falta volver a escribir el numero de cuenta
				nuevo.setCliente(on.nextLine());
				System.out.print("Importe: ");
				nuevo.setImporte(on.nextDouble());
				for (Cuenta ejem : c) {
					System.out.println("Cliente: " + ejem.cliente + " Numero de cuenta: " + ejem.cuenta + " importe: "
							+ ejem.importe);
				}
				// Allí ya tengo atascado.... tengo dudas
				System.out.println("Deseas continuar? ");
				String u = on.nextLine();
				if (u.equalsIgnoreCase("si")) {
					System.out.println("Cuanto dinero quieres ingresar?");
					c.get(i-1).ingresar(on.nextDouble());
					for (Cuenta ejem : c) {
						System.out.println("Cliente: " + ejem.cliente + " Numero de cuenta: " + ejem.cuenta + " importe: "
								+ ejem.importe);
					System.out.println("Cuando dinero quieres retirar?");
						c.get(i-1).retirar(on.nextDouble());
						for (Cuenta ejem2 : c) {
							System.out.println("Cliente: " + ejem.cliente + " Numero de cuenta: " + ejem.cuenta + " importe: "
									+ ejem.importe);
						}
					}
					
				}else {
					System.out.println("Gracias por vuestra atencion");
				}
			}else {
				System.out.println("Gracias por vuestra atencion");
			}
			

		}

	}

}
