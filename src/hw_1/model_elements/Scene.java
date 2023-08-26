package hw_1.model_elements;


import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int id;
    public List<PolygonalModel> models;
    public List<Camera> cameras;
    public List<Flash> flashes = new ArrayList<>();

    public <T> T method1(T t) {
        return t;
    }

    public <T> T method2(T t1, T t2) {
        return t1;
    }

    public Scene(int id, List<PolygonalModel> models, List<Camera> cameras, List<Flash> flashes) {
        this.id = id;
        this.models = models;
        this.cameras = cameras;
        this.flashes = flashes;
    }

    public Scene(int id, List<PolygonalModel> models, List<Camera> cameras) {
        this.id = id;
        this.models = models;
        this.cameras = cameras;
    }
}
