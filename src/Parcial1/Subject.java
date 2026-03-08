package Parcial1;
class Subject {

    private String name;
    private String id;
    private int credits;
    private Teacher teacher;

    public Subject(String name, String id, int credits, Teacher teacher){
        this.name = name;
        this.id = id;
        this.credits = credits;
        this.teacher = teacher;
    }

    public Subject(String name){
        this(name, name.substring(0,4), 0, null); 
    }

    public void editName(String name){
        this.name = name;
    }

    public void editId(String id){
        this.id = id;
    }

    public void editCredits(int credits){
        this.credits = credits;
    }

    public void editTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public int getCredits(){
        return credits;
    }

    public Teacher getTeacher(){
        return teacher;
    }
}
