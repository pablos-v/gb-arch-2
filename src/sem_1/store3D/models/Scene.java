package sem_1.store3D.models;

import hw_1.model_elements.Camera;
import hw_1.model_elements.Flash;

import java.util.ArrayList;
import java.util.List;

public class Scene {

    public int id;
    public List<PoligonalModel> models;
    public List<hw_1.model_elements.Camera> cameras;
    public List<hw_1.model_elements.Flash> flashes = new ArrayList<>();

    public <T> T method1(T t) {
        return t;
    }

    public <T> T method2(T t1, T t2) {
        return t1;
    }

    public Scene(int id, List<PoligonalModel> models, List<hw_1.model_elements.Camera> cameras, List<Flash> flashes) {
        this.id = id;
        this.models = models;
        this.cameras = cameras;
        this.flashes = flashes;
    }

    public Scene(int id, List<PoligonalModel> models, List<Camera> cameras) {
        this.id = id;
        this.models = models;
        this.cameras = cameras;
    }

}
