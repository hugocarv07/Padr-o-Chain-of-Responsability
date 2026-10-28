package padroesprojeto.chainofresponsibility.hospital;

public class FuncionarioDiretorClinico extends Funcionario {

    public FuncionarioDiretorClinico(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoRelatorioAlta.getTipoDocumentoRelatorioAlta());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor Clínico";
    }
}
