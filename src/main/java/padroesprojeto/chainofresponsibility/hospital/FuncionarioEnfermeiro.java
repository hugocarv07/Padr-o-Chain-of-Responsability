package padroesprojeto.chainofresponsibility.hospital;

public class FuncionarioEnfermeiro extends Funcionario {

    public FuncionarioEnfermeiro(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoFichaEnfermagem.getTipoDocumentoFichaEnfermagem());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Enfermeiro";
    }
}
