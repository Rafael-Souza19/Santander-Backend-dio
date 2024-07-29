package projeto.projeto_santander_dio.domain.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name= "tb_games")
public class Games {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int games;
    private int dlcs;
    private String lastSession;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getDlcs() {
        return dlcs;
    }

    public void setDlcs(int dlcs) {
        this.dlcs = dlcs;
    }

    public String getLastSession() {
        return lastSession;
    }

    public void setLastSession(String lastSession) {
        this.lastSession = lastSession;
    }
}
