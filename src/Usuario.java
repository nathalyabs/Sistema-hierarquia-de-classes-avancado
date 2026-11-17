import java.util.ArrayList;

    public class Usuario {
        private String nome;
        private ArrayList<Playlist> playlists = new ArrayList<>();

        public Usuario(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public ArrayList<Playlist> getPlaylists() {
            return playlists;
        }

        public void criarPlaylist(String nomePlaylist) {
            playlists.add(new Playlist(nomePlaylist));
            System.out.println("Playlist criada: " + nomePlaylist);
        }

        public Playlist buscarPlaylist(String nomePlaylist) {
            for (Playlist p : playlists) {
                if (p.getNome().equalsIgnoreCase(nomePlaylist)) {
                    return p;
                }
            }
            return null;
        }
    }

