package UserPackage;

import TaskPackage.Task;
import UtilityPackage.Utils;

public class User {
    private String username;
    private String password;
    private String first_name;
    private String last_name;
    public String email;
    public int streak;
    private int index = 0 ;
    public Task[] Tasks = new Task[100];
    public boolean isTaskRepetitive (String TaskName) {
        for (int i=0 ; i<=index ; i++) {
            if (Tasks[i].getName().equals(TaskName)) return false ;
        }
        return true ;
    }
    public Task createTask (String TaskName) {
        if (!isTaskRepetitive(TaskName)){
            System.out.println("That task Name is Repetitive.");
            return null;
        }
        Tasks[index] = new Task (TaskName);
        index ++ ;
        return Tasks[index-1] ;
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
    public Task getTaskByName (String task) {
        int sw = 0 ;
        int i;
        for (i=0 ; i<index ; i++) {
            if (Tasks[i].getName().equals(task)) {
                sw = 1;
                break;
            }
        }
        if (sw == 0) {
            System.out.println("Task not found.");
            return null;
        } else
            return Tasks[i];
    }
    public Task[] getTaskByColor ( String color ) {
        int count = 0 ;
        for (int i=0 ; i< index ; i++) {
            if (Tasks[i].getColor().equals(color)) {
                count ++ ;
            }
        }
        if (count != 0) {
            Task[] task = new Task[count] ;
            int number = 0 ;
            for (int i=0 ; i< index ; i++) {
                if (Tasks[i].getColor().equals(color)) {
                    task[number] = Tasks[i] ;
                    number ++ ;
                }
            }
            return task ;
        } else {
            System.out.println("The desired task was not found");
            return null ;
        }
    }
    public String getFullName(){
        return first_name.concat(" ").concat(last_name);
    }
    public void setFirstName ( String firstName ) {
        first_name = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase() ;
    }
    public void setLastName ( String lastName ) {
        last_name = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase() ;
    }
    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
        return last_name;
    }
}