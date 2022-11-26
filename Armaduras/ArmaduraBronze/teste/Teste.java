public class Teste {

	public static void main(String[] args) {

		Componente c = new ArmaduraBronze();
		c = new EscudoBronze(c);
		c = new EspadaBronze(c);
		c = new CapaceteBronze(c);

		System.out.println(c.getXp());
		System.out.println(c.getNome());

	}

}
