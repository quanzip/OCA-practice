package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.enumm;

public class Complex {
    public static void main(String[] args) {
        Climate windy = Climate.WINDY;
        System.out.println("windy " + windy);
        System.out.println("windy.showName() " + windy.showName());
        System.out.println("windy.getTemperture() " + windy.getTemperture());

        System.out.println("-----------");
        Climate sunny = Climate.SUNNY;
        System.out.println("sunny " + sunny);
        System.out.println("sunny.showName() " + sunny.showName());
        System.out.println("sunny.getTemperture() " + sunny.getTemperture());

        // compare
        System.out.println("Compare enums");
        Climate windy1 = Climate.WINDY;
        System.out.println("using == " + (windy1 == windy));
        System.out.println("using equals " + windy1.equals(windy));
    }
}

enum Climate {
    WINDY(new Temperture("morning", 3)){
        @Override
        Object showName() {
            return "WINDYYYYYY";
        }

        public void showWindDirection() {   // không gọi được với instance vì cha không có. chỉ có thể gọi dược method này nếu là overide method, đã được khai báo ở class cha
            System.out.println(this.getTemperture());
        }
    },
    SUNNY(new Temperture("evening", 4)) {
        @Override
        Object showName() {
            return this.ordinal();
        }

        @Override
        Temperture getTemperture() {
            System.out.println("This method is overided by SUNNY");
            return new Temperture(super.getTemperture().moment, super.getTemperture().level + 10);
        }
    },
    COLD(new Temperture("Afternoon", 1)) {
        @Override
        Object showName() {
            return null;
        }
    },
    RAINY(new Temperture("noon", 2)) {
        @Override
        Object showName() {
            return this.name();
        }
    };  // remember this ;

    // field
    private final Temperture temperture;

    // constructor
    Climate(Temperture temperture) {
        this.temperture = temperture;
    }

    // method
    Temperture getTemperture() {
        return this.temperture;
    }

    // abstract method, all element must overide this method
    abstract Object showName();
}
class Temperture {
    String moment;
    int level;

    public Temperture(String moment, int level) {
        this.moment = moment;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Temperture{" +
                "moment='" + moment + '\'' +
                ", level=" + level +
                '}';
    }
}