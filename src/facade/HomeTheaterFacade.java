package facade;

public class HomeTheaterFacade {
	Amplificador amp;
	Radio radio;
	DvdPlayer dvd;
	CdPlayer cd;
	Projetor projetor;
	LuzesTheater luzes;
	Tela tela;
	Pipoqueira pipoqueira;
	
	public HomeTheaterFacade( Amplificador amp, Radio radio, DvdPlayer dvd, CdPlayer cd, Projetor projetor, LuzesTheater luzes, Tela tela, Pipoqueira pipoqueira){
		
		this.amp = amp;
		this.radio = radio;
		this.dvd = radio;
		this.cd = cd;
		this.projetor = projetor;
		this.tela = tela;
		this.luzes = luzes;
		this.pipoqueira = pipoqueira;
	}
	public void verFilme(String filme){
		pipoqueira.on();
		pipoqueira.pop();
		luzes.diminuir(10);
		tela.baixar();
		projetor.on();
		projetor.setModoWideScreen();
		amp.on();
		amp.setDvd();
		amp.setSomSurround();
		amp.setVolume(5);
		dvd.on();
		dvd.play(filme);
	}
	
	public void finalizarFilme(){
		pipoqueira.off();
		luzes.off();
		tela.subir();
		projetor.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
}
