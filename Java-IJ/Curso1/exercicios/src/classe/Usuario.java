package classe;

public class Usuario {
    String nome;
    String email;

    public boolean equals(Object objeto) {
        if (objeto instanceof Usuario) {
            Usuario comparado = (Usuario) objeto;
//            boolean nomeIgual = comparado.nome == this.nome; // NÃO É BOA PRÁTICA, SÓ PARA DEMONSTRAÇÃO
            boolean nomeIgual = comparado.nome.equals(this.nome);
            boolean emailIgual = comparado.email.equals(this.email); // BOA PRÁTICA

            return (nomeIgual && emailIgual);
        } else {
            return false;
        }
    }
}
