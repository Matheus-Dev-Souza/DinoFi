
public abstract class peca extends Componente {

	private Componente componente;

	public peca(Componente componente) {
		this.componente = componente;
	}

	public Componente getComponente() {
		return componente;
	}

	@Override
	public double getXp() {

		return this.xp + this.componente.getXp();
	}

	@Override
	public String getNome() {

		return this.componente.getNome() + ", " + this.nome;
	}

}
