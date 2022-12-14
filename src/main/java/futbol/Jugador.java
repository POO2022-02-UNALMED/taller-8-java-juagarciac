package futbol;
import java.util.ArrayList;

public class Jugador extends Futbolista2 implements Comparable<Jugador> {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre,int edad,String posicion,short goles,byte dorsal) {
		super(nombre,edad,posicion);
		this.golesMarcados=goles;
		this.dorsal=dorsal;
	}
	public Jugador() {
		super();
		this.golesMarcados=289;
		this.dorsal=7;
	}
	public short getGolesMarcados() {
		return this.golesMarcados;
	}
	public byte getDorsal() {
		return this.dorsal;
	}
	public void setGolesMarcados(short goles) {
		this.golesMarcados=goles;
	}
	public void setDorsal(byte dorsal) {
		this.dorsal=dorsal;
	}
	@Override
	public String toString(){
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+ ", y juega de "+this.getPosicion()+" con el dorsal "+this.getDorsal()+ ". Ha marcado "+this.getGolesMarcados();
	}
	public int compareTo(Jugador por) {
		if (this.getGolesMarcados()==por.getGolesMarcados()){
			return 0;
			}
		else {if (this.getGolesMarcados()>por.getGolesMarcados()){
				return (short) this.getGolesMarcados()- (short)por.getGolesMarcados();
			}
			else {
				return (short) por.getGolesMarcados()- (short)this.getGolesMarcados();
				}
		}
	}
}

