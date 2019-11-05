package xyz.kandrac;

public abstract class BaseSecurityModule {

   public abstract void storeUser(String username, String password);
   public abstract boolean authenticateUser(String username, String password);

}
