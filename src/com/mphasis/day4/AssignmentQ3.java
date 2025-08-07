package com.mphasis.day4;

class Sport {
    public void play() {
        System.out.println("Playing a sport");
    }
}

class Football extends Sport {
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}

class Basketball extends Sport {
    @Override
    public void play() {
        System.out.println("Playing Basketball");
    }
}

class Tennis extends Sport {
    @Override
    public void play() {
        System.out.println("Playing Tennis");
    }
}

public class AssignmentQ3 {
    public static void main(String[] args) {
        Sport s1 = new Sport();
        Sport s2 = new Football();
        Sport s3 = new Basketball();
        Sport s4 = new Tennis();

        s1.play();
        s2.play();
        s3.play();
        s4.play();
    }
}
