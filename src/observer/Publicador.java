package observer;

public interface Publicador {
	public void registrarObservador(Observador o);
	public void removerObservador(Observador o );
	public void notificarPublicador();
}
