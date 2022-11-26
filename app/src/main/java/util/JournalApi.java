package util;
import android.app.Application;

public class JournalApi extends Application {
    //This is a sigleton class so always once object is created
    //method all constructor of class pvt, static method return instance, instance stored in pvy static vaaribale
    private String username;
    private String userId;
    private static JournalApi instance;

    public static JournalApi getInstance(){
        if(instance == null){
            instance = new JournalApi();
        }
        return instance;
    }

    public JournalApi(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
