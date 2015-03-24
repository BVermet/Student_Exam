package be.howest.nmct.admin;


import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


/**
 * Created by Bryan on 13/02/2015.
 */
public class Student implements Comparable<Student> {

    private String emailStudent;

    public String getEmailStudent() {
        return emailStudent;
    }
    private HashMap<String, ModulePunt>  scoresStudent;

    public void setEmailStudent(String emailStudent) {
        this.emailStudent = emailStudent;
    }

    private Student(String emailStudent,
                    HashMap<String, ModulePunt> scoresStudent) {
        super();
        this.emailStudent = emailStudent;
        this.scoresStudent = scoresStudent;
    }
    public void voegScoreToe(String sModuleNaam, double score)
    {
        ModulePunt student  = new ModulePunt(sModuleNaam, 0 , score);
        scoresStudent.put(emailStudent, student);
    }
    public float getTotaleScoreStudent()
    {
        Iterator<String> keySetIterator = scoresStudent.keySet().iterator();
        float alleProducten = 0;
        int totaalStudiePunten = 0;
        while(keySetIterator.hasNext()){
            String key = keySetIterator.next();
            totaalStudiePunten += scoresStudent.get(key).getAantalStudiePunten();
        }
        Iterator<String> keySetIterator2 = scoresStudent.keySet().iterator();
        while(keySetIterator2.hasNext()){
            String key = keySetIterator.next();
            alleProducten += (scoresStudent.get(key).getScore()) * (scoresStudent.get(key).getAantalStudiePunten() / totaalStudiePunten);
        }
        return alleProducten;
    }
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Email Student: ")
                .append(emailStudent)
                .append(", Scores student: ")
                .append(scoresStudent);

        return sb.toString();
    }

    public int compareTo(Student  other){
        double mijnTotaleScore = this.getTotaleScoreStudent();
        double andereTotaleScore = other.getTotaleScoreStudent();
        double dVerschil = mijnTotaleScore - andereTotaleScore;

        if (dVerschil > 0){
            return +1;
        }else if(dVerschil <0){
            return -1;
        }
        return 0;
    }

    public static List<Double> getScoresModule(List<Student> studenten, String moduleNaam){

    }

    public static double getGemiddeldeScoreModule(List<Student> studenten, String moduleNaam){

    }

    public static void sorteerStudenten(List<Student> studenten){

    }




}
