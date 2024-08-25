package interpreter;

public class Context {

    private String[] tokens;
    private String lastToken;
    private int idx;

    public Context(String text) {
        this.tokens = text.split("\\s+");
        this.idx = 0;
        nextToken();
    }

    public String nextToken() {
        if (idx < tokens.length) {
            lastToken = tokens[idx++];
        } else {
            lastToken = null;
        }
        return lastToken;
    }

    public void skipToken(String token) throws IllegalArgumentException {
        if (currentToken() == null) {
            throw new IllegalArgumentException("Error: '" + token + "' is expected, but no more token is found.");
        } else if (!token.equals(currentToken())) {
            throw new IllegalArgumentException("Error: '" + token + "' is expected, but '" + currentToken() + "' is found.");
        }
        nextToken();
    }

    public int getRepeatCnt() throws IllegalArgumentException {
        if (currentToken() == null) {
            throw new IllegalArgumentException("Error: No more token.");
        }
        int repeatCnt = 0;
        try {
            repeatCnt = Integer.parseInt(currentToken());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error: " + e);
        }
        return repeatCnt;
    }

    public String currentToken() {
        return lastToken;
    }

}
