package JuegoGuerra;


public class ChuckNorris implements Guerra{
	private int escudo;
	private int disparosRecibidos;
	private boolean vivo;
	public ChuckNorris() {//soldado con escudo
		this.vivo=true;//comienza vivo
		this.disparosRecibidos=0;
		this.escudo=1;
	}
	public ChuckNorris(int escudo) {//Soldado sin escudo
		this.vivo=true;
		this.disparosRecibidos=0;
		this.escudo=escudo;
	}
	public void recibirDisparo() {
		if(escudo>0) {
			escudo--;
		}else {
			disparosRecibidos++;
		}
		if(disparosRecibidos>1) {
				this.vivo=true;
		}
		
	}
	public boolean estaVivo() {
		return vivo;
	}
	public void dispararA(Guerra objetivo) {
		objetivo.recibirDisparo();
	}
	@Override
	public int getDisparo() {

		return 1;
	}
	
	@Override
	public int getEscudo() {
		return escudo;
	}
    @Override
    public int escudo() {
      
        throw new UnsupportedOperationException("Unimplemented method 'escudo'");
    }

}