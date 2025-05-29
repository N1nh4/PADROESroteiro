package roteiro7.parte3;

public class BancoBrasil extends Banco {
    @Override
    public Boleto criarBoleto(int vencimento, double valor) {
        switch (vencimento) {
            case 10:
                return new BoletoBrasil10Dias(valor);
            case 30:
                return new BoletoBrasil30Dias(valor);
            case 60:
                return new BoletoBrasil60Dias(valor);
            default:
                throw new UnsupportedOperationException("ERROR: Vencimento indisponível" );
        }
    }
   
    
}
