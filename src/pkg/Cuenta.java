package pkg;

public class Cuenta {
	String numero;
	String titular;
	double saldo;
	
	public Cuenta(double i) {
		this.saldo = i;
	}

	public void ingresar(double i) {
		this.saldo=200;
		
	}

	public double getSaldo() {
		
		return 200;
	}

	public void retirar(double i) {
		
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
