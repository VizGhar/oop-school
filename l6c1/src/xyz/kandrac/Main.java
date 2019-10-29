package xyz.kandrac;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Lietavec lietavec = new Lietavec();
        Mrchozrut mrchozrut = new Mrchozrut();
        Vtak vtak = new Vtak();

        vtak.rozpetieKridel = 1;

        lietavec.rozpetieKridel = 2;
        lietavec.let();

        mrchozrut.rozpetieKridel = 3;
        mrchozrut.let();
        mrchozrut.trhaj();

    }
}
