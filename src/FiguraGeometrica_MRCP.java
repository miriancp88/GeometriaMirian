
public abstract class FiguraGeometrica_MRCP {

	protected String tipoFigura;

	public FiguraGeometrica_MRCP(String tipoFigura) {
		super();
		this.tipoFigura = tipoFigura;
	}

	public abstract double area();
	
	public abstract double perimetro();

	public String getTipoFigura() {
		return tipoFigura;
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

}
