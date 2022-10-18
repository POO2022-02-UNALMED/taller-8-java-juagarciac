package futbol;
import java.util.ArrayList;

public class Futbolista implements Comparable<Futbolista>,nece {
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista(String nombre,int edad,String posicion) {
		this.nombre=nombre;
		this.edad=edad;
		this.posicion=posicion;
	}
	
	public Futbolista() {
		this.nombre="Maradona";
		this.edad=30;
		this.posicion="delantero";
	}
	
	public String getNombre() {
	return this.nombre;
	}
	public String getPosicion() {
		return this.posicion;
	}
	public int getEdad() {
		return this.edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
		}
		public void setEdad(int edad) {
			this.edad=edad;
		}
	@Override
	public String toString(){
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+this.getPosicion()+".";	
	}
	@Override
	public boolean jugarConLasManos() {
		return false;
	}
	public int compareTo(Futbolista por) {
		if (this.nombre==por.getNombre()) {
			if(this.edad==por.getEdad()) {
				if (this.posicion==por.getPosicion()) {
					return 1;
				}
				else {
					return 0;
				}
			}
			else {
				return 0;
			}
		}
		else {
			return 0;
		}
		
	}
}
