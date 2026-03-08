package Parcial1;
class Teacher {

    private String name;
    private String surname;
    private String id;

    Teacher(String name, String surname, String id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public void editId(String id){
        this.id = id;
    }

    public void editName(String name){
        this.name = name;
    }

    public void editSurname(String surname){
        this.surname = surname;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
}
