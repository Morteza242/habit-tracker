package UserPackage;

import TaskPackage.Task;

public class User {
    private String username;
    private String password;

   public String first_name;
   public String last_name;
    public String email;
    public int streak;

    public Task createTask () {
        return new Task(getFullName()) ;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public User (String username , String password , String first_name , String last_name , String email) {
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }


    public String getFullName(){
        return first_name + " " + last_name ;
    }
}