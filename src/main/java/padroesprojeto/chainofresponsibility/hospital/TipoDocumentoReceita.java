package padroesprojeto.chainofresponsibility.hospital;

public class TipoDocumentoReceita implements TipoDocumento {

    private static TipoDocumentoReceita tipoDocumentoReceita = new TipoDocumentoReceita();

    private TipoDocumentoReceita() {};

    public static TipoDocumentoReceita getTipoDocumentoReceita() {
        return tipoDocumentoReceita;
    }
}
