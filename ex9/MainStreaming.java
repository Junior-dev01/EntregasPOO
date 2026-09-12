public class MainStreaming {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Juvenal", "juvenal@email.com", true);
        Video video1 = new Video("Video1", 120);
        Video video2 = new Video("Video2", -45);

        System.out.println("Usuário: " + usuario1.getNome() +
                " | Email: " + usuario1.getEmail() + " | Ativo: " + usuario1.isAtivo());

        System.out.println("Duração final do Vídeo 2: " + video2.getDuracaoMinutos() + " minuto(s)");

    }

}