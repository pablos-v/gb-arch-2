package hw_1.in_memory_model;

import hw_1.model_elements.Camera;
import hw_1.model_elements.Flash;
import hw_1.model_elements.PolygonalModel;
import hw_1.model_elements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    private List<PolygonalModel> models = new ArrayList<>();
    private List<Scene> scenes;
    private List<Flash> flashes;
    private List<Camera> cameras;
    private List<IModelChangedObserver> observers = new ArrayList<>();

    public void addObserver(IModelChangedObserver observer){
        observers.add(observer);
    }

    public void addModel(PolygonalModel model){
        models.add(model);
        notifyChange();
    }

    public Scene getScene(int id) {
        for (Scene s : this.scenes) {
            if (s.id == id) return s;
        }
        return null;
    }

    @Override
    public void notifyChange() {
        for (IModelChangedObserver o : observers) {
            o.applyUpdateModel();
        }
    }
}
