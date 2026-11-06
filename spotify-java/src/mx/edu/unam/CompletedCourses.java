package mx.edu.unam;

public class CompletedCourses {
    private int total;
    public CompletedCourses(int total){
        this.total=total;
    }
    public boolean meetsRequirement(int total){
        return total>=25;
    }
}
