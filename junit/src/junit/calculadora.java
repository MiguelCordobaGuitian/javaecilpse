package junit;

public class calculadora {
	int x;
	int y;	

	public void Calculadora(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int suma() {
		int suma;
		suma=x+y;
		return suma;
	}
	public int resta() {
		int resta;
		resta=x+y;
		return resta;
	}
	public int multiplica() {
		int multiplica;
		multiplica=x*y;
		return multiplica;
	}
	public int divide() {
		int divide;
		divide=x/y;
		return divide;
	}	
	
	
}
