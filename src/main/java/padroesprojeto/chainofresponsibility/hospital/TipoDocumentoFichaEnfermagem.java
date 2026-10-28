package padroesprojeto.chainofresponsibility.hospital;

public class TipoDocumentoFichaEnfermagem implements TipoDocumento {

    private static TipoDocumentoFichaEnfermagem tipoDocumentoFichaEnfermagem = new TipoDocumentoFichaEnfermagem();

    private TipoDocumentoFichaEnfermagem() {};

    public static TipoDocumentoFichaEnfermagem getTipoDocumentoFichaEnfermagem() {
        return tipoDocumentoFichaEnfermagem;
    }
}
