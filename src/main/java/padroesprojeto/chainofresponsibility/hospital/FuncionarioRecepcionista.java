package padroesprojeto.chainofresponsibility.hospital;

public class FuncionarioRecepcionista extends Funcionario {

    public FuncionarioRecepcionista(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoComprovanteAtendimento.getTipoDocumentoComprovanteAtendimento());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Recepcionista";
    }
}
