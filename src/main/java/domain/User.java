package domain;

public class User {
    private String username;

    String getUsername(){
        return this.username;
    }

    void changeUsername(String username){
        this.username = username;
    }
}
