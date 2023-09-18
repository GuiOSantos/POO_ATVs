package dominio.uniderp.atv0506;

public class Aviao  extends BaseDadosComuns {
    private int qtdMotores;
    private int qtdPassageiros;
    public int getQtdMotores() {
        return qtdMotores;
    }
    public void setQtdMotores(int qtdMotores) {
        this.qtdMotores = qtdMotores;
    }
    public int getQtdPassageiros() {
        return qtdPassageiros;
    }
    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }
    public Aviao(int codigo, String nome, String modelo, String cor, String chassi, int anoModelo, int anoFabricacao,
            double pesoTotal, String fabricante, double potencia, String tipoCombustivel, String nomeProprietario,
            String estadoUF, String cidadeUF, String tipoVeiculo, double pesoLiquido, int rodas, int assentos,
            int portas, int qtdMotores, int qtdPassageiros) {
        super(codigo, nome, modelo, cor, chassi, anoModelo, anoFabricacao, pesoTotal, fabricante, potencia,
                tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, pesoLiquido, rodas, assentos,
                portas);
        this.qtdMotores = qtdMotores;
        this.qtdPassageiros = qtdPassageiros;
    }
    
}
