package dominio.uniderp.atv0506;

public class Caminhao extends BaseVeiculoTerrestre {
    private int comprimento;
    private int altura;
    private int porta;
    public int getComprimento() {
        return comprimento;
    }
    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getPorta() {
        return porta;
    }
    public void setPorta(int porta) {
        this.porta = porta;
    }
    public Caminhao(int codigo, String nome, String modelo, String cor, String chassi, int anoModelo, int anoFabricacao,
            double pesoTotal, String fabricante, double potencia, String tipoCombustivel, String nomeProprietario,
            String estadoUF, String cidadeUF, String tipoVeiculo, double pesoLiquido, int rodas, int assentos,
            int portas, String placa, int eixos, String codigoRenavan, int comprimento, int altura, int porta) {
        super(codigo, nome, modelo, cor, chassi, anoModelo, anoFabricacao, pesoTotal, fabricante, potencia,
                tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, pesoLiquido, rodas, assentos,
                portas, placa, eixos, codigoRenavan);
        this.comprimento = comprimento;
        this.altura = altura;
        this.porta = porta;
    }
    
}
