package gtel.code.eurekaclient.payload;

public class TokenRequest {
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public TokenRequest(String token) {
        this.token = token;
    }

    public TokenRequest() {
    }
}
