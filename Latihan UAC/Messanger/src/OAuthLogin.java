public class OAuthLogin implements ILogin {
    private String token;

    public OAuthLogin(String token) {
        this.token = token;
    }

    @Override
    public boolean authenticate(String username, String token) {
        // For OAuth, we might ignore the username and just check the token.
        return this.token.equals(token);
    }
}