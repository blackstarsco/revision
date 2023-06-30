package revision;

import java.util.UUID;

public class Article {
    private String id;
    private String designation;
    private Double prix;

    public  Article(){

    }

    public Article(String designation, Double prix){
        this.designation = designation;
        this.prix = prix;
        this.id = UUID.randomUUID().toString();
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
}
