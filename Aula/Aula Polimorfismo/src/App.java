import musicas.Musicas;
import musicas.Rock;
import musicas.Eletronica;
import musicas.OstJogo;

public class App {
    public static void main(String[] args) throws Exception {
        Rock rock = new Rock("Marmalade", "System of a Down", 3, "System of a Down", 1998, 95);
        rock.frenetico();
        rock.infoMusica();
        rock.tocarMusica();

        Eletronica eletro = new Eletronica("4555", "oMeiaum", 3.53, "4555.", 2020, true);
        eletro.infoMusica();
        eletro.tocarMusica();

        OstJogo jogo = new OstJogo("Fallen Down", "toby fox", 0.58, "Undertale OST", 2015, "Undertale");
        jogo.infoMusica();
        jogo.tocarMusica();
    }
}
