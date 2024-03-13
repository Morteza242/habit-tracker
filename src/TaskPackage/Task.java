package TaskPackage;

import UserPackage.User;

public class Task {
    final String color ;
    public String name;
    private double start_time;
    private double finish_time;

    User user ;

    public void setStart_time(double start_time) {

        if (start_time < 0) start_time *= -1;

        this.start_time = start_time;
    }

    public double getStart_time() {
        return start_time;
    }

    public void setFinish_time(double finish_time) {
        if ( finish_time < 0 ) finish_time *= -1;

        this.finish_time = finish_time;
    }

    public double getFinish_time() {
        return finish_time;
    }

    public Task (String name) {
        color = null;
        this.name = name;
    }
    public Task ( String name , User user) {
        color = null ;
        this.name = name;
        this.user = user;
    }
    public Task ( String name , User user , String color) {
        this.name = name;
        this.user = user;
        this.color = color;
    }

    public boolean isColorValid (String Color) {
        int i ;
        for ( i=0 ; i<Color.length() ; i++) {
            if ( ('0'>Color.charAt(i) && Color.charAt(i)>'9') || Color.charAt(i)!='F' || Color.charAt(i)!='A' ) break;
        }
        return i >= Color.length();
    }
    public double getDuration () {
        return finish_time - start_time ;
    }
}
