package entities;

public class Televisor {

	public int volume;
	public int canal;
	public boolean ligado;
	
	public void aumentarVolume( ) {
		if(volume >= 0 && volume <= 15) {
			volume += 1;
		}
	}
	public void diminuirVolume() {
		if(volume > 0 && volume <= 16) {
			volume -= 1;
		}
	}
	public void aumentaCanal() {
		if(canal == 0) canal = 1;
		if(canal >= 1 && canal <= 15) {
			canal += 1;
		}
	}
	public void diminuirCanal() {
		if(canal == 0) canal = 1;
		if(canal >= 1 && canal <= 15) {
			canal -= 1;
		}
	}
	public void ligarTelevisor() {
		canal = 1;
		ligado = true;
	}
	public void deligarTelevisor() {
		ligado = false;
	}
	public void mostrarStatus() {
		if(ligado == true) {
			System.out.println("Tv ligada");
			System.out.println("Canal: " + canal);
			System.out.println("Volume: " + volume);
		}
		else {
			System.out.println("Desligada");
		}
		
	}
}
