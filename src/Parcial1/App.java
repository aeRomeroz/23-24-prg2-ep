package Parcial1;
import java.util.Scanner;

class App {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);        

        Teacher manuel = new Teacher("Manuel", "Masias", "666999XY");
        Subject progra2 = new Subject("Programación 2", "PRG-2", 6, manuel);

        Teacher loyda = new Teacher("Loyda", "Alas", "433452A");
        Exam exam = new Exam("Parcial", progra2, loyda, 3);

        exam.addQuestion(0, "Vista Pública de Clases");
        exam.addQuestion(1, "Vista Pública de Objetos");
        exam.addQuestion(2, "Vista Privada de Clases");

        System.out.println("Nombre del profesor: " + manuel.getName() + " " + manuel.getSurname() + " - NIE " + manuel.getId());

        System.out.println("Asignatura: " + progra2.getName() + " - " + progra2.getId() + " - " + progra2.getCredits() + " créditos");

        System.out.println("Exámen: Exámen " + exam.getType() + " / Vigilado por Prof.: " + exam.getSupervisor().getName() + " " + exam.getSupervisor().getSurname() + " - NIE " + exam.getSupervisor().getId());

        for(int i=0;i < exam.getQuestionsQty(); i++){
            System.out.println("Pregunta " + (i+1) + ": " + exam.getQuestion(i));
        }
        
    }    

}
