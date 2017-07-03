package observer;
import java.util.ArrayList;

public class DadosClima implements Publicador{
	
	private ArrayList<Observador> observadores; //Lista de observadores(preferencialmente polimorfica) guardada num ArrayList
	private float temperatura;
	private float umidade;
	private float pressao;
	
	public DadosClima(){
		observadores = new ArrayList();
	}
	
	public void registrarObservador( Observador o ){
		//Incluir verificacao se ja esta na lista
		observadores.add( o );
	}
	public void removerObservador( Observador o ){
		//Idem acima
		observadores.remove(o);
	}
	public void notificarObservadores(){
		for (Observador o : observadores){
			o.atualizar( temperatura, umidade, pressao);
		}
	}
	public void medicoesMudaram(){
		notificarObservadores();
	}
	public void setMedicoes(float temperatura, float umidade, float pressao){
		this.temperatura = temperatura;
		this.umidade = umidade;
		this.pressao = pressao;
		medicoesMudaram();
	}
	
	
	//Getters
	public void getTemperatura(){
		
	}
	public void getUmidade(){
		
	}
	public void getPressao(){
		
	}
	public void medicoesMudaram(){
		float temp = getTemperatura();
		float umidade = getUmidade();
		float pressao = getPressao();
		
		visorCondicoesAtuais.atualizar (temp, umidade, pressao);
		visorEstatisticas.atualizar( temp, umidade, pressao);
		visorPrevisao.atualizar( temp, umidade, pressao );
	}
}
