import com.pedro.redeSocial.Facebook;
import com.pedro.redeSocial.GooglePlus;
import com.pedro.redeSocial.Instagram;
import com.pedro.redeSocial.Twitter;
import com.pedro.redeSocial.base.RedeSocial;
import com.pedro.redeSocial.user.Usuario;

public class Main {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        GooglePlus googlePlus = new GooglePlus();
        Instagram instagram = new Instagram();
        Twitter twitter = new Twitter();

        RedeSocial[] redeSocials = {facebook, instagram};
        Usuario usuario = null;

        try {
            usuario = new Usuario(redeSocials, "Pedro Augusto", "pedro@email.com");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        for (RedeSocial redeSocial : usuario.usa) {
            redeSocial.postarFoto();
            redeSocial.curtirPublicacao();
            redeSocial.postarComentario();

            try {
                redeSocial.changePassword("Pe00&kjaa");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            System.out.println("\n-------------------------------\n");

        }

    }
}
