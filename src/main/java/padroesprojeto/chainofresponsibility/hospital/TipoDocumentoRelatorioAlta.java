package padroesprojeto.chainofresponsibility.hospital;

public class TipoDocumentoRelatorioAlta implements TipoDocumento {

    private static TipoDocumentoRelatorioAlta tipoDocumentoRelatorioAlta = new TipoDocumentoRelatorioAlta();

    private TipoDocumentoRelatorioAlta() {};

    public static TipoDocumentoRelatorioAlta getTipoDocumentoRelatorioAlta() {
        return tipoDocumentoRelatorioAlta;
    }
}
