public class SwapTest {

    int value;

    SwapTest(int value) {
        this.value = value;
    }

    static void swap(SwapTest a, SwapTest b) {
        SwapTest temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        SwapTest o1 = new SwapTest(10);
        SwapTest o2 = new SwapTest(20);

        swap(o1, o2);

        System.out.println(o1.value);
        System.out.println(o2.value);
    }
}
