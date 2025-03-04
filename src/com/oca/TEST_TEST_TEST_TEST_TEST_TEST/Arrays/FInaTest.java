package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.Arrays;

public class FInaTest {
    public static void main(String[] args) {
        int [][]studentGrades = {{77,68,86}, {96,76,45}};
        outputGrade(studentGrades);

        for(int []studentGrade: studentGrades) {
            calcMinimumGrade(studentGrade);
            calcMaximumGrade(studentGrade);
            calcAverageGrade(studentGrade);
        }
    }

    static void outputGrade(int [][]studenGrade) {
        for(int[] grade: studenGrade) {
           for(int i = 0; i < grade.length; i++) System.out.print(grade[i] +",");
           System.out.println("");
        }
    }

    static private void calcMinimumGrade(int studenGrade[]) {
        int min = studenGrade[0];
        for (int grade: studenGrade) {
            if (grade < min) {
                min = grade;
            }
        }
        System.out.println("Min grade is " +  min);
    }

    static private void calcMaximumGrade(int studenGrade[]) {
        int max = studenGrade[0];
        for (int grade: studenGrade) {
            if (grade > max) {
                max = grade;
            }
        }
        System.out.println("Max grade is " +  max);
    }

    static private void calcAverageGrade(int studenGrade[]) {
        int max = 0;
        for (int grade: studenGrade) {
            max +=grade;
        }
        int avg = max / studenGrade.length;
        System.out.println("Average grade is " +  avg);
    }
}
