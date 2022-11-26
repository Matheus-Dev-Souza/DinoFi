public class Teste {

	public static void main(String[] args) {

		Componente c = new ArmaduraPrata();
		c = new EscudoPrata(c);
		c = new EspadaPrata(c);
		c = new CapacetePrata(c);

		System.out.println(c.getXp());
		System.out.println(c.getNome());

	}

}
