package Person;

import java.util.Scanner;

public class Administrator extends User{

    private String name = null;
    private String sorName = null;
    private String login = null;
    private String password = null;
    private int ID = 0;

    //constructors-----------------------------------------------------------------------------------------------

    public Administrator(String name, String sorName, String login, String password) {
        super(name, sorName, login, password);


    //TEST??????
        boolean flag = true;
        while (flag) {

            System.out.print("1-студент 2-delStud 3-prepod 4-Зам. Декана: ");
            Scanner scanner = new Scanner(System.in);
            String choise = scanner.nextLine();

            switch (choise) {

                case "1": {
                      Student.arrStudent.add(newStudent());
                      System.out.println(Student.arrStudent);
                }
                break;




                case "2": {
                    System.out.print("введите айди студента, которого хотите удалить: ");
                    int idDelStudent = scanner.nextInt();
                    for (Student x : Student.arrStudent){
                        if(x.getID() == idDelStudent){
                            delStudent(x);
                            System.out.println("студент " + x.getName() + "удален!");
                        }
                        User.ID--;
                    }

                }
                break;

                case "3":{
                    Teacher.arrTeacher.add(newTeacher());
                    System.out.println(Teacher.arrTeacher);
                }


            }


        }


    }


    //methods-----------------------------------------------------------------------------------------------

    private Student newStudent(){
        Scanner scanner = new Scanner(System.in);
        int idOfStudent = User.ID++;
        System.out.print("Введите имя:");
        String nameOfStudent = scanner.nextLine();
        System.out.print("Введите фамилию:");
        String sorNameOfStudent = scanner.nextLine();
        System.out.print("Введите логин:");
        String loginOfStudent = scanner.nextLine();
        System.out.print("Введите пароль:");
        String passwordOfStudent = scanner.nextLine();
        System.out.print("Введите группу:");
        String groupOfStudent = scanner.nextLine();

        Student student = new Student(nameOfStudent, sorNameOfStudent, loginOfStudent, passwordOfStudent, groupOfStudent, idOfStudent);

        return student;
    }
    //-------------------------------------------
    private void delStudent(Student student){
        Student.arrStudent.remove(student);
    }
    //-------------------------------------------
    private Teacher newTeacher(){
        Scanner scanner = new Scanner(System.in);
        int idOfTeacher = User.ID++;
        System.out.print("Введите имя:");
        String nameOfTeacher = scanner.nextLine();
        System.out.print("Введите фамилию:");
        String sorNameOfTeacher = scanner.nextLine();
        System.out.print("Введите логин:");
        String loginOfTeacher = scanner.nextLine();
        System.out.print("Введите пароль:");
        String passwordOfTeacher = scanner.nextLine();

        Teacher teacher = new Teacher(nameOfTeacher, sorNameOfTeacher, loginOfTeacher, passwordOfTeacher, idOfTeacher);

        return teacher;
    }
    //-------------------------------------------
    private void delTeacher(){}
    //-------------------------------------------
    private void addLesson(){}
    //-------------------------------------------
    private void delLesson(){}





}
