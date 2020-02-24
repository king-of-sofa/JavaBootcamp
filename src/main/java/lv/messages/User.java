package lv.messages;

public class User {
    private String username;
    private String password;
    private boolean locked;
    private int attempts;

    public User(String username, String password){
        this.username = username;
        this.password = password;
        this.locked = false;
        this.attempts = 3;
    }


    public boolean isLocked() {
        return locked;
    }

    public void lockUser() {
        this.locked = true;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public void resetAttempts() {
        this.attempts = 3;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void decreaseAttempts() {
        this.attempts--;
    }


}
