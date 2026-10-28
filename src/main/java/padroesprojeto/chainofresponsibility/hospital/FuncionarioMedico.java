package padroesprojeto.chainofresponsibility.hospital;

public class FuncionarioMedico extends Funcionario {

    public FuncionarioMedico(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoReceita.getTipoDocumentoReceita());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Médico";
    }
}
