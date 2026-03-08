package Parcial1;
class Exam {

    private String type;
    private Subject subject;
    private Teacher supervisor;
    private int questionQuantity;

    private String[] questions;

    public Exam(String type, Subject subject, Teacher supervisor, int questionQuantity){
        this.type = type;
        this.subject = subject;
        this.supervisor = supervisor;
        this.questionQuantity = questionQuantity;
        questions = new String[questionQuantity];
    }

    public Exam(Exam exam){
        this(exam.type, exam.subject, exam.supervisor, exam.questionQuantity);
    }

    public void addQuestion(int index, String question){
        questions[index] = question;
    }

    public void removeQuestion(int index){
        questions[index] = null;
    }

    public void editSupervisor(Teacher supervisor){
        this.supervisor = supervisor;
    }

    public void editSubject(Subject subject){
        this.subject = subject;
    }

    public String getQuestion(int index){
        return questions[index];
    }

    public Teacher getSupervisor(){
        return supervisor;
    }

    public String getType(){
        return type;
    }

    public int getQuestionsQty(){
        return questionQuantity;
    }

}
