public class PairUtil {
    public static<T,S> Pair<T,S> swap(Pair<T,S> pair){
        Pair<T,S>nowa=new Pair<>((T)pair.getSecond(),(S)pair.getFirst());
        return nowa;
    }
}
