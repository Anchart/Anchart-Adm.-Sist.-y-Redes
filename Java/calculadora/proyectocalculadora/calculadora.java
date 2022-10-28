package proyectocalculadora;

public class calculadora
{
int a;
int b;

	public int sumar(int a,int b){
		int res = a + b;
		return res;
	}	
	public int restar(){
		int res = a - b;
		return res;		
	}
	public int multiplicar(){
		int res = a * b;
		return res;		
	}
	public int dividir(){
		int res = a / b;
		return res;		
	}
	
}