package locadoraVeiculos;

public class Carro {
	private int codigo;
	private String modelo;
	private Boolean locado;
	static int numLocados = 0;
	static Carro[] carros = new Carro[5];
	
	public Carro(int codigo, String modelo, Boolean locado) {
		this.codigo = codigo;
		this.modelo = modelo;
		this.locado = locado;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public boolean isLocado() {
		return locado;
	}
	
	public Integer getNumLocados() {
		return numLocados;
	}
	
	public boolean Locar(int codigo) {
		for (Carro carro : Carro.carros) {
			if (carro.codigo == codigo) {
				if(carro.locado == false) {
					carro.locado = true;
					numLocados++;
					System.out.println("Carro locado");
					return true;
				}else {
					System.out.println("Carro indisponivel");
					return false;
				}
			}
		}
		System.out.println("Carro não existe");
		return false;
	}
	public boolean Devolver(int codigo) {
		for(Carro carro : Carro.carros) {
			if(carro.codigo == codigo) {
				if(carro.locado == false) {
					System.out.println("Carro não está locado");
					return false;
				}else {
					carro.locado = false;
					numLocados--;
					System.out.println("Carro devolvido com sucesso");
					return true;
				}
			}
		}
		System.out.println("Carro não existe");
		return false;
	}
}
