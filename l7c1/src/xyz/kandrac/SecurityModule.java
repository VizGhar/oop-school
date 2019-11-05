package xyz.kandrac;

import java.util.HashMap;

public final class SecurityModule extends BaseSecurityModule {

    HashMap<String, String> auth = new HashMap<>();

    @Override
    public void storeUser(String username, String password) {
        auth.put(username, password);
    }

    @Override
    public boolean authenticateUser(String username, String password) {
        String passwordNew = auth.get(username);
        return passwordNew == null ? false : passwordNew.equals(password);
    }
}
