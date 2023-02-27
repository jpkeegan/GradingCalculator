import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double gradeNum;
        String gradeLetter = "";
        do{
            do{
                System.out.println("Input a grade between 1 and 100\n0 to exit");
                gradeNum = sc.nextDouble();
            }while(gradeNum < 0 || gradeNum > 100);

            if(gradeNum == 0){
                break;
            }
            if(gradeNum >= 98 && gradeNum <= 100){
                gradeLetter = "A+";
            }
            if(gradeNum >= 95 && gradeNum <= 97){
                gradeLetter = "A";
            }
            if(gradeNum >= 90 && gradeNum <= 94){
                gradeLetter = "A-";
            }
            if(gradeNum >= 88 && gradeNum <= 89){
                gradeLetter = "B+";
            }
            if(gradeNum >= 85 && gradeNum <= 87){
                gradeLetter = "B";
            }
            if(gradeNum >= 80 && gradeNum <= 84){
                gradeLetter = "B-";
            }
            if(gradeNum >= 78 && gradeNum <= 79){
                gradeLetter = "C+";
            }
            if(gradeNum >= 75 && gradeNum <= 77){
                gradeLetter = "C";
            }
            if(gradeNum >= 70 && gradeNum <= 74){
                gradeLetter = "C-";
            }
            if(gradeNum >= 65 && gradeNum <= 69){
                gradeLetter = "D";
            }
            if(gradeNum <= 64){
                gradeLetter = "F";
            }
            System.out.println(gradeLetter);
        }while(gradeNum != 0);

    }
}