package futbol;
import java.util.ArrayList;

public class Portero extends Futbolista implements comparable<Portero> {
	public short golesRecibidos;
	public byte dorsal;
	public Portero(String nombre,int edad,String posicion,short goles,byte dorsal) {
		super(nombre,edad,"Portero");
		this.golesRecibidos=goles;
		this.dorsal=dorsal;
	}
	public boolean jugarconlasmanos() {
		return true;
	}
	
	public short getGolesRecibidos() {
		return this.golesRecibidos;
	}
	public byte getDorsal() {
		return this.dorsal;
	}
	public void setGolesRecibidos(short goles) {
		this.golesRecibidos=goles;
	}
	public void setDorsal(byte dorsal) {
		this.dorsal=dorsal;
	}
	public String toString() {
		return"El futbolista "+this.getNombre()+" tiene "+this.getEdad()+ ", y juega de "+this.getPosicion(	)+" con el dorsal "+this.getDorsal()+ ". Le han marcado "+this.getGolesRecibidos()+".";
	}
	public short compareTo(Portero por) {
		if (this.getGolesRecibidos()==por.getGolesRecibidos()){
			return 0;
			}
		else {if (this.getGolesRecibidos()>por.getGolesRecibidos()){
			return this.getGolesRecibidos()-por.getGolesRecibidos();
			}
		else{
			return por.getGolesRecibidos()-this.getGolesRecibidos();
			} }
	}
}