package hw_1;

import hw_1.in_memory_model.ModelStore;
import hw_1.in_memory_model.Observer;
import hw_1.model_elements.Polygon;
import hw_1.model_elements.PolygonalModel;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {
        Observer observer = new Observer();

        ModelStore modelStore = new ModelStore();
        modelStore.addObserver(observer);

        Polygon polygon = new Polygon();
        List<Polygon> polygons = new ArrayList<>();
        polygons.add(polygon);
        PolygonalModel polygonalModel = new PolygonalModel(polygons);

        modelStore.addModel(polygonalModel);
    }
}
