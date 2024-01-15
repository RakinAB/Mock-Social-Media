import java.util.LinkedList;
import java.util.Queue;

public class User {
    
    private int userID;
    private String name;
    private String password;
    private String email;
    private LinkedList<User> friends;
    private LinkedList<Post> posts;
    private Queue<Notification> notifications;

    public User(int userID, String username, String password, String email){

        this.userID = userID;
        this.name = username;
        this.password = password;
        this.email = email;

    }

    public int getUserID() {
        return this.userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LinkedList<User> getFriends() {
        return this.friends;
    }

    public void setFriends(LinkedList<User> friends) {
        this.friends = friends;
    }

    public LinkedList<Post> getPosts() {
        return this.posts;
    }

    public void setPosts(LinkedList<Post> posts) {
        this.posts = posts;
    }

    public Queue<Notification> getNotifications() {
        return this.notifications;
    }

    public void setNotifications(Queue<Notification> notifications) {
        this.notifications = notifications;
    }

    

}