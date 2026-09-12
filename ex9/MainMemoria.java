public class MainMemoria {

    public static void main(String[] args) {
        Usuario usuario3 = new Usuario("Juvencio", "igual@email.com", true);
        Usuario usuario4 = new Usuario("Jurandi", "igual@email.com", true);

        if (usuario3.equals(usuario4))

        {
            System.out.println("Os usuários estão cadastrados com o mesmo email!!");
        } else {
            System.out.println("Os usuários são diferentes.");
        }

        System.out.println("Plataforma: " + Usuario.NOME_PLATAFORMA);
        System.out.println("Total de usuários cadastrados: " + Usuario.getTotalUsuarios());
    }
}
