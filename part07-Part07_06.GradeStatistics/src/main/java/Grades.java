/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jurek
 */
public class Grades {

    String count0 = "";
    String count1 = "";
    String count2 = "";
    String count3 = "";
    String count4 = "";
    String count5 = "";

    private int points;
    private gradeCalc passedGrades = new gradeCalc();
    private gradeCalc Grades = new gradeCalc();

    public void Grades(int grade) {

        this.points = grade;

        if (this.points >= 0 && this.points <= 100) {
            Grades.add(points);

            if (this.points >= 0 && this.points < 50) {
                count0 = count0 + "*";
            } else if (this.points >= 50 && this.points < 60) {
                count1 = count1 + "*";
            } else if (this.points >= 60 && this.points < 70) {
                count2 = count2 + "*";
            } else if (this.points >= 70 && this.points < 80) {
                count3 = count3 + "*";
            } else if (this.points >= 80 && this.points < 90) {
                count4 = count4 + "*";
            } else if (this.points >= 90 && this.points <= 100) {
                count5 = count5 + "*";
            }

            if (this.points >= 50 && this.points <= 100) {
                passedGrades.add(points);
            }
        }
    }

    public void printStars() {

        System.out.println("Grade distribution:");
        System.out.println("5: " + count5);
        System.out.println("4: " + count4);
        System.out.println("3: " + count3);
        System.out.println("2: " + count2);
        System.out.println("1: " + count1);
        System.out.println("0: " + count0);

    }

    @Override
    public String toString() {

        if (passedGrades.getAvg() == 0) {
            return "Point average (all): " + Grades.getAvg() + "\n" + "Point average (passing): " + "-" + "\n" + "Pass percentage: " + Grades.getPercentage();
        }

        return "Point average (all): " + Grades.getAvg() + "\n" + "Point average (passing): " + passedGrades.getAvg() + "\n" + "Pass percentage: " + Grades.getPercentage();

    }
}
