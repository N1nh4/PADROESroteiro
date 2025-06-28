package roteiro10.parte2;

import java.util.concurrent.TimeUnit;
public class TesteUsuario {

    public static void main(String[] args) {
        // --- Teste sem Proxy ---
        System.out.println("--- Teste sem Proxy ---");
        long inicioSemProxy = System.nanoTime();
        IReceitaFederal pessoaFisicaDireta = new PessoaFisicaReceitaFederal("123456789");
        System.out.println("Nome (direto): " + pessoaFisicaDireta.getNome());
        System.out.println("Idade (direta): " + pessoaFisicaDireta.getIdade());
        System.out.println("CPF (direto): " + pessoaFisicaDireta.getCpf());
        System.out.println("CPF Ativo (direto): " + pessoaFisicaDireta.isCpfAtivo());
        long fimSemProxy = System.nanoTime();
        long duracaoSemProxy = TimeUnit.NANOSECONDS.toMillis(fimSemProxy - inicioSemProxy);
        System.out.println("Tempo total sem Proxy: " + duracaoSemProxy );

        // --- Teste com Proxy ---
        System.out.println("--- Teste com Proxy ---");
        long inicioComProxy = System.nanoTime();
        IReceitaFederal pessoaFisicaProxy = new PessoaFisicaReceitaFederalProxy("123456789");
        System.out.println("Nome (proxy): " + pessoaFisicaProxy.getNome());
        System.out.println("Idade (proxy): " + pessoaFisicaProxy.getIdade());
        System.out.println("CPF (proxy): " + pessoaFisicaProxy.getCpf());
        System.out.println("CPF Ativo (proxy): " + pessoaFisicaProxy.isCpfAtivo());
        long fimComProxy = System.nanoTime();
        long duracaoComProxy = TimeUnit.NANOSECONDS.toMillis(fimComProxy - inicioComProxy);
        System.out.println("Tempo total com Proxy: " + duracaoComProxy);

        // --- Teste do Usuario usando o Proxy ---
        System.out.println("--- Teste da classe Usuario (que usa Proxy) ---");
        long inicioUsuario = System.nanoTime();
        Usuario usuario = new Usuario("João", 30, "123456789");
        System.out.println("Nome do Usuário: " + usuario.getNome());
        System.out.println("Validação do Nome: " + usuario.validarNome());
        System.out.println("Verificação de CPF Ativo: " + usuario.verificaCPFAtivo());
        long fimUsuario = System.nanoTime();
        long duracaoUsuario = TimeUnit.NANOSECONDS.toMillis(fimUsuario - inicioUsuario);
        System.out.println("Duração do teste do Usuário: " + duracaoUsuario);

    }
}