package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.Part5Test;


import java.util.ArrayList;
import java.util.List;

public class DriverOOA {
    public static void main(String[] args) {
        List<Exercise> exerciseList = new ArrayList<>();
        Exercise exercise = new Soccer(12.5);
        exerciseList.add(exercise);

        Exercise sprint = new Sprint(.1);
        exerciseList.add(sprint);

        Exercise stroll = new Stroll(10);
        exerciseList.add(stroll);

        Exercise raceWalking = new RaceWalking(5);
        exerciseList.add(raceWalking);

        performExercises(exerciseList);

        System.out.println("------------------------- test instance of and assignable -------------------------");
        Object t = new Integer(1);
        System.out.println("t instanceof Number: " + (t instanceof Number));
        System.out.println("t instanceof Object: " + (t instanceof Object));

        System.out.println("t.getClass().isAssignableFrom(Integer.class): " + (t.getClass().isAssignableFrom(Integer.class)));
        System.out.println("t.getClass().isAssignableFrom(Object.class): " + (t.getClass().isAssignableFrom(Object.class)));
        System.out.println("t.getClass().isAssignableFrom(Number.class): " + (t.getClass().isAssignableFrom(Number.class)));


    }

    /*
    * instanceof & isAsignableFrom
    * A instanceof B sẽ trả true nếu A là B hoặc A là con kế thừa B hoặc B là ô nội, cụ, kỵ, còn không thì sẽ trả false
    *  A isAssignableFrom B nếu B chính là class được khai báo (Object type) trước đó, ngoài ra trả fall với bất kỳ kiểu nào khác,
    *  vd Object t = new Int(1), t.getClassIsAssignableFrom(Int.class) => true nhưng  t.getClassIsAssignableFrom(Object.class) => false
    * */
    static void performExercises(List<Exercise> exerciseList) {
        for(Exercise exercise: exerciseList) {
            if (exercise instanceof BallSport) {
                exercise.move();
            } else if (exercise instanceof OlimpicSport) {
                exercise.move();
            }

            if (exercise.getClass().isAssignableFrom(Soccer.class)) {
                exercise.move();
            } else if (exercise.getClass().isAssignableFrom(RaceWalking.class)) {
                exercise.move();
            }
        }
    }
}

interface Exercise {
    double distanceCoverd();
    void move();
}

interface OlimpicSport {
}

interface BallSport {
}

abstract class Run implements Exercise {
    double distanceKm;
    Run(double distanceKm) {
        this.distanceKm = distanceKm;
    }
    public double distanceCoverd() {
        return this.distanceKm;
    }
}

abstract class Walk implements Exercise{
    double distanceKm;
    Walk(double distanceKm) {
        this.distanceKm = distanceKm;
    }
    public double distanceCoverd() {
        return this.distanceKm;
    }
}

class Stroll extends Walk{

    Stroll(double distanceKm) {
        super(distanceKm);
    }

    @Override
    public void move() {
        System.out.println(this.getClass().getSimpleName()+"::moving()");
    }
}

class RaceWalking extends Walk implements OlimpicSport{

    RaceWalking(double distanceKm) {
        super(distanceKm);
    }

    @Override
    public void move() {
        System.out.println(this.getClass().getSimpleName()+"::moving()");
    }
}

class Soccer extends Walk implements BallSport{

    Soccer(double distanceKm) {
        super(distanceKm);
    }

    @Override
    public void move() {
        System.out.println(this.getClass().getSimpleName()+"::moving()");
    }
}

class Sprint extends Walk{

    Sprint(double distanceKm) {
        super(distanceKm);
    }

    @Override
    public void move() {
        System.out.println(this.getClass().getSimpleName()+"::moving()");
    }
}
