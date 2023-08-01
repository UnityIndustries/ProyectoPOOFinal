package logico;

public class Main {
	public static void main(String[] args) {

		Tienda ComputadoraSantiago = new Tienda();


		Motherboard motherboard = new Motherboard("Motherboard - ASUS", 200.0, 10, "0320", "ROG Maximus XII Hero", "LGA", "DDR4",4);
		ComputadoraSantiago.agregarComponente(motherboard);

		MemoriaRAM memoriaRAM = new MemoriaRAM("MemoriaRAM - Corsair", 80.0, 20, "3245", 16, "DDR4");
		ComputadoraSantiago.agregarComponente(memoriaRAM);

		DiscoDuro discoDuro = new DiscoDuro("DiscoDuro - Seagate", 60.0, 15, "9582", "Barracuda", 2, "SATA");
		ComputadoraSantiago.agregarComponente(discoDuro);

		Microprocesador microprocesador = new Microprocesador("Microprocesador - Intel", 300.0, 5, "1415", "Core i9-10900K", "LGA 1200", 3.7);
		ComputadoraSantiago.agregarComponente(microprocesador);


		Combo comboGamer = new Combo("Combo Gamer", 600.0);
		comboGamer.agregarComponente(motherboard);
		comboGamer.agregarComponente(memoriaRAM);
		comboGamer.agregarComponente(discoDuro);
		comboGamer.agregarComponente(microprocesador);
		ComputadoraSantiago.agregarCombo(comboGamer);


		Cliente cliente1 = new Cliente("John Cabral", "829-549-2453", "001-1234567-8");
		ComputadoraSantiago.agregarCliente(cliente1);

		cliente1.comprarCombo(comboGamer);

		cliente1.comprarComponente(motherboard);

		Factura factura1 = new Factura(1, "01/07/2023", "john Cabral");

		factura1.agregarComponente(motherboard);
		factura1.agregarCombo(comboGamer);


		cliente1.agregarFactura(factura1);
		ComputadoraSantiago.agregarFactura(factura1);

		double precioTotal = factura1.calcularPrecioTotal();

		System.out.println("El precio total de la factura es: " + precioTotal);
	}

}
