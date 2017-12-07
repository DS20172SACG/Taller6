package emsamablajecomputadoras.creacional;

public abstract class Builder {
	
	protected Computador computador;
	
	public abstract void buildComputer();
	public abstract void buildOS();
	public abstract void buildMainboard();
	
	public Computador getComputador(){
		return this.computador;
	}
	
}
