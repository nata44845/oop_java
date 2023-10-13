package zoo;

import java.util.ArrayList;
import java.util.List;

public class ZooNoise {
    private List<Speakable> noise;

    public ZooNoise() {
        noise = new ArrayList<>();
        noise.add(new Dog());
        noise.add(new Cat());
        noise.add(new Radio());
    }

    public void speakAll(){
        for (Speakable speakable: noise){
            speakable.speak();
        }
    }
}
