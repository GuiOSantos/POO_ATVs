package dominio.uniderp.atv0506;

public abstract class BaseVeiculoTerrestre extends BaseDadosComuns {
    protected String placa;
    protected int eixos;
    protected String codigoRenavan;
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public String getCodigoRenavan() {
        return codigoRenavan;
    }
    public void setCodigoRenavan(String codigoRenavan) {
        this.codigoRenavan = codigoRenavan;
    }
    public BaseVeiculoTerrestre(int codigo, String nome, String modelo, String cor, String chassi, int anoModelo,
            int anoFabricacao, double pesoTotal, String fabricante, double potencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, double pesoLiquido,
            int rodas, int assentos, int portas, String placa, int eixos, String codigoRenavan) {
        super(codigo, nome, modelo, cor, chassi, anoModelo, anoFabricacao, pesoTotal, fabricante, potencia,
                tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, pesoLiquido, rodas, assentos,
                portas);
        this.placa = placa;
        this.eixos = eixos;
        this.codigoRenavan = codigoRenavan;
    }
}
