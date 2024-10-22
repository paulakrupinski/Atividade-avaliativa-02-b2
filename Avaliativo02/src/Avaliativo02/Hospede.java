package Avaliativo02;

public class Hospede {
    private String nome;

    public Hospede(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

	@Override
	public String toString() {
		return "Hospede [nome=" + nome + "]";
	}
}
