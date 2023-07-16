
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MyPen implements IPen{

    @Override
    public int f1(List<Pen> t) {
        int count = 0;
        for(int i = 0; i < t.size(); i++){
            if(t.get(i).getName().contains("A")) count++;
        }
        return count;
    }

    @Override
    public void f2(List<Pen> t) {
        int idMax = 0;
        for(int i = 0; i < t.size(); i++){
            if(t.get(i).getPrice() > t.get(idMax).getPrice() && t.get(i).getPrice() % 2 == 0) idMax = i;
        }
        t.remove(idMax);
    }

    @Override
    public void f3(List<Pen> t) {
        List<Pen> t1 = new ArrayList<>();
        for(int i = 2; i < 7; i++){
            t1.add(t.get(i));
        }
        Collections.sort(t1, (o1,o2) -> {
            if(o1.getName().compareTo(o2.getName()) == 0) return o1.getPrice()-o2.getPrice();
            return o1.getName().compareTo(o2.getName());
        });
        int pos = 0;
        for(int i = 2; i < 7; i++){
            t.set(i, t1.get(pos));
            pos++;
        }
    }
    
}
