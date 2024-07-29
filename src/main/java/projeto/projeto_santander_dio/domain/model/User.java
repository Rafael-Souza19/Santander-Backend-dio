package projeto.projeto_santander_dio.domain.model;

import jakarta.persistence.*;

import java.util.List;


@Entity(name= "tb_user")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickName;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToMany
    private List<Games> games;

    @OneToMany
    private List<Features> features;

    @OneToMany(targetEntity = News.class)
    private List<News> news;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Games getGames() {
        return (Games) games;
    }

    public void setGames(Games games) {
        this.games = (List<Games>) games;
    }

    public List<Features> getFeatures() {
        return features;
    }

    public void setFeatures(List<Features> features) {
        this.features = features;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
}
