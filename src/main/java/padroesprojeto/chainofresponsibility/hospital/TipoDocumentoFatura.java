package padroesprojeto.chainofresponsibility.hospital;

public class TipoDocumentoFatura implements TipoDocumento {

    private static TipoDocumentoFatura tipoDocumentoFatura = new TipoDocumentoFatura();

    private TipoDocumentoFatura() {};

    public static TipoDocumentoFatura getTipoDocumentoFatura() {
        return tipoDocumentoFatura;
    }
}
