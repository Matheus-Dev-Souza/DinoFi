public class Teste {

	public static void main(String[] args) {

		Componente c = new ArmaduraOuro();
		c = new EscudoOuro(c);
		c = new EspadaOuro(c);
		c = new CapaceteOuro(c);

		System.out.println(c.getXp());
		System.out.println(c.getNome());

	}

}
