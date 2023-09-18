package dominio.uniderp.atv0506;

public class Onibus extends BaseVeiculoTerrestre {
    private int qtdeAssentos;

    public int getQtdeAssentos() {
        return qtdeAssentos;
    }

    public void setQtdeAssentos(int qtdeAssentos) {
        this.qtdeAssentos = qtdeAssentos;
    }

    public Onibus(int codigo, String nome, String modelo, String cor, String chassi, int anoModelo, int anoFabricacao,
            double pesoTotal, String fabricante, double potencia, String tipoCombustivel, String nomeProprietario,
            String estadoUF, String cidadeUF, String tipoVeiculo, double pesoLiquido, int rodas, int assentos,
            int portas, String placa, int eixos, String codigoRenavan, int qtdeAssentos) {
        super(codigo, nome, modelo, cor, chassi, anoModelo, anoFabricacao, pesoTotal, fabricante, potencia,
                tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, pesoLiquido, rodas, assentos,
                portas, placa, eixos, codigoRenavan);
        this.qtdeAssentos = qtdeAssentos;
    }
    
}
