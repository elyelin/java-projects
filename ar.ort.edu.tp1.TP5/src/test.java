public class test {

	public static void main(String[] args) {
		DiasMes.ENERO.name();
		DiasMes.values();

		DiasMes[] meses = DiasMes.values();

		for (DiasMes diasMes : meses) {
			System.out.println(diasMes);
		}

		DiasMesconNombre.ENERO.getDias();
		DiasMesconNombre.FEBRERO.getNombre();

		DiasMesconNombre[] mes = DiasMesconNombre.values();

		for (DiasMesconNombre diasMes : mes) {
			System.out.println(diasMes);
			System.out.println(diasMes.getDias());
			System.out.println(diasMes.getNombre());
		}
		mes[0].name();

	}

}
