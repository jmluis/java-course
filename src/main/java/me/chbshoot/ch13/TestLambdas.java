package me.chbshoot.ch13;

public class TestLambdas {
    public static void main(final String[] args) {
        final Detailable det = () -> { return "hello world!"; };
        System.out.println(det.getDetails());
    }
}