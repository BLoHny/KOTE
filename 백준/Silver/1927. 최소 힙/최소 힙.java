import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public ArrayList<Integer> elems = new ArrayList<>();

    public Main() {
        elems.add(0);
    }

    public void push(int value) {
        elems.add(value);
        up_swap(elems.size() - 1);
    }

    public void pop() {
        if (elems.size() == 1) {
            System.out.println(0);
            return;
        }

        System.out.println(elems.get(1));
        int last = elems.get(elems.size() - 1);
        elems.set(1, last);

        elems.remove(elems.size() - 1);
        down_swap(1);
    }

    public void up_swap(int index) {
        int parent = parent(index);

        if (parent == 0) {
            return;
        }

        if (elems.get(parent) <= elems.get(index)) {
            return;
        }

        swap(parent, index, elems.get(parent), elems.get(index));
        up_swap(parent);
    }

    public void swap(int... indexs) {
        elems.set(indexs[0], indexs[3]);
        elems.set(indexs[1], indexs[2]);
    }

    public void down_swap(int index) {

        int leftIndex = leftChild(index);
        int rightIndex = rightChild(index);

        if (leftIndex < elems.size() && elems.get(leftIndex) < elems.get(index)) {
            if (rightIndex >= elems.size() || elems.get(leftIndex) < elems.get(rightIndex)) {
                swap(index, leftIndex, elems.get(index), elems.get(leftIndex));
                down_swap(leftIndex);
                return;
            }
        }

        if (rightIndex < elems.size() && elems.get(rightIndex) < elems.get(index)) {
            swap(index, rightIndex, elems.get(index), elems.get(rightIndex));
            down_swap(rightIndex);
        }
    }

    public int parent(int index) {
        return index / 2;
    }

    public int leftChild(int index) {
        return index * 2;
    }

    public int rightChild(int index) {
        return index * 2 + 1;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        for (int i = 0; i < len; i++) {
            int o = Integer.parseInt(br.readLine());
            if (o == 0) {
                main.pop();
            } else
                main.push(o);
        }
        br.close();
    }
}
