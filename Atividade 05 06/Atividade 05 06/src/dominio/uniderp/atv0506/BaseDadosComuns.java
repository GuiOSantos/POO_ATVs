package dominio.uniderp.atv0506;

public abstract class BaseDadosComuns extends BaseVeiculo {
    protected int rodas;
    protected int assentos;
    protected int portas;
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public BaseDadosComuns(int codigo, String nome, String modelo, String cor, String chassi, int anoModelo,
            int anoFabricacao, double pesoTotal, String fabricante, double potencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, double pesoLiquido,
            int rodas, int assentos, int portas) {
        super(codigo, nome, modelo, cor, chassi, anoModelo, anoFabricacao, pesoTotal, fabricante, potencia,
                tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, pesoLiquido);
        this.rodas = rodas;
        this.assentos = assentos;
        this.portas = portas;
    }
}
