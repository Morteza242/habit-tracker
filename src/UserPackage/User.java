package UserPackage;

import TaskPackage.Task;
import UtilityPackage.Utils;

public class User {
    private String username;
    private String password;

   public String first_name;
   public String last_name;
    public String email;
    public int streak;

    private static int index = 0 ;

    String[] TaskNames = new String[100];

    public boolean isTaskRepetitive (String TaskName) {
        for (int i=0 ; i<=index ; i++) {
            if (TaskNames[i].equals(TaskName)) return false ;
        }
        return true ;
    }

    public Task createTask (String TaskName) {
        if (!isTaskRepetitive(TaskName))
            System.out.println("That task Name is Repetitive.");
        TaskNames[index] = TaskName;
        index ++ ;
        return new Task (TaskName) ;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (Utils.isPasswordValid(password))
            this.password = password;
        else System.out.println("invalid password!!");
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