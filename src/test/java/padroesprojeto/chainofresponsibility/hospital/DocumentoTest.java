package padroesprojeto.chainofresponsibility.hospital;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {

    FuncionarioDiretorClinico diretorClinico;
    FuncionarioMedico medico;
    FuncionarioEnfermeiro enfermeiro;
    FuncionarioRecepcionista recepcionista;

    @BeforeEach
    void setUp() {
        diretorClinico = new FuncionarioDiretorClinico(null);
        medico = new FuncionarioMedico(diretorClinico);
        enfermeiro = new FuncionarioEnfermeiro(medico);
        recepcionista = new FuncionarioRecepcionista(enfermeiro);
    }

    @Test
    void deveRetornarRecepcionistaParaAssinaturaComprovanteAtendimento() {
        assertEquals("Recepcionista", recepcionista.assinarDocumento(new Documento(TipoDocumentoComprovanteAtendimento.getTipoDocumentoComprovanteAtendimento())));
    }

    @Test
    void deveRetornarEnfermeiroParaAssinaturaFichaEnfermagem() {
        assertEquals("Enfermeiro", recepcionista.assinarDocumento(new Documento(TipoDocumentoFichaEnfermagem.getTipoDocumentoFichaEnfermagem())));
    }

    @Test
    void deveRetornarMedicoParaAssinaturaReceita() {
        assertEquals("Médico", recepcionista.assinarDocumento(new Documento(TipoDocumentoReceita.getTipoDocumentoReceita())));
    }

    @Test
    void deveRetornarDiretorClinicoParaAssinaturaRelatorioAlta() {
        assertEquals("Diretor Clínico", recepcionista.assinarDocumento(new Documento(TipoDocumentoRelatorioAlta.getTipoDocumentoRelatorioAlta())));
    }

    @Test
    void deveRetornarSemAssinaturaParaAssinaturaFatura() {
        assertEquals("Sem assinatura", recepcionista.assinarDocumento(new Documento(TipoDocumentoFatura.getTipoDocumentoFatura())));
    }

    @Test
    void deveAssinarNoProprioFuncionarioSemPercorrerACadeia() {
        assertEquals("Diretor Clínico", diretorClinico.assinarDocumento(new Documento(TipoDocumentoRelatorioAlta.getTipoDocumentoRelatorioAlta())));
    }

    @Test
    void naoDeveDescerNaCadeiaParaDocumentoDeSubordinado() {
        assertEquals("Sem assinatura", medico.assinarDocumento(new Documento(TipoDocumentoComprovanteAtendimento.getTipoDocumentoComprovanteAtendimento())));
    }

    @Test
    void deveEncadearCadaFuncionarioAoSeuSuperior() {
        assertSame(enfermeiro, recepcionista.getFuncionarioSuperior());
        assertSame(medico, enfermeiro.getFuncionarioSuperior());
        assertSame(diretorClinico, medico.getFuncionarioSuperior());
        assertNull(diretorClinico.getFuncionarioSuperior());
    }

    @Test
    void deveRetornarSempreAMesmaInstanciaDeTipoDocumento() {
        assertSame(TipoDocumentoReceita.getTipoDocumentoReceita(), TipoDocumentoReceita.getTipoDocumentoReceita());
    }
}
