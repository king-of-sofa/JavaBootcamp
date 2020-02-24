package lv.messages;

public class UserLoginService {

    public boolean login(User user, String password) {
        if (user.getPassword() == null || password == null) {
            System.out.println("Error ");
            return false;
        }

        if (!user.isLocked() && user.getPassword().equals(password)) {
            user.resetAttempts();
            return true;
        } else {
            if (user.getAttempts() > 0) {
                user.decreaseAttempts();
            } else {
                user.lockUser();
            }
        return false;
        }
    }
}
