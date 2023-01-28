public class PairUtil {
    public static <T> Pair<T> swap(Pair<T> pair) {
        return new Pair<T>(pair.getSecond(), pair.getFirst());
    }
}

class PairUtilDemo {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<String>("Hello", "World");
        System.out.println("Original pair: " + pair.getFirst() + " " + pair.getSecond());
        Pair<String> swappedPair = PairUtil.swap(pair);
        System.out.println("Swapped pair: " + swappedPair.getFirst() + " " + swappedPair.getSecond());
    }
}
