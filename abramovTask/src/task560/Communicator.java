package task560;

import java.util.List;

public class Communicator {
    public void resOut(List<Integer> list){
        System.out.print("All pairs of friendly numbers : ");
        for (int k: list) {
            System.out.print(k + " ");
        }
    }
}

