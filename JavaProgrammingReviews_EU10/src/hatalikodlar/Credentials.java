package hatalikodlar;

public class Credentials {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public void setPassword(String password) {
        if (isStrongPassword(password)) {
            this.password = password;
        }

    }

    public Credentials(String username, String password1) {
        this.username=username;
        setPassword(password1);
    }

    public boolean isStrongPassword(String password) {
        boolean isStrongPassword = false;
        if (password.length() < 8 || password.contains(" ")) {
            isStrongPassword = false;
        } else {
            int oneLetter = 0;
            int oneSpecial = 0;
            int oneNumber = 0;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isAlphabetic(password.charAt(i))) {
                    oneLetter++;
                }
                if (Character.isDigit(password.charAt(i))) {
                    oneNumber++;
                }
                if (Character.isLetterOrDigit(password.charAt(i))) {
                    oneSpecial++;
                }

            }
            if (oneNumber > 0 && oneLetter > 0 && oneSpecial > 0) {
                isStrongPassword = true;
            }
        }
        return isStrongPassword;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}