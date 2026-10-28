package padroesprojeto.chainofresponsibility.hospital;

public class TipoDocumentoComprovanteAtendimento implements TipoDocumento {

    private static TipoDocumentoComprovanteAtendimento tipoDocumentoComprovanteAtendimento = new TipoDocumentoComprovanteAtendimento();

    private TipoDocumentoComprovanteAtendimento() {};

    public static TipoDocumentoComprovanteAtendimento getTipoDocumentoComprovanteAtendimento() {
        return tipoDocumentoComprovanteAtendimento;
    }
}
