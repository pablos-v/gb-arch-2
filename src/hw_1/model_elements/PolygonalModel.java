package hw_1.model_elements;

import java.util.ArrayList;
import java.util.List;

public class PolygonalModel {
    public List<Polygon> polygons;
    public List<Texture> textures = new ArrayList<>();

    public PolygonalModel(List<Polygon> polygons) {
        this.polygons = polygons;
    }

    public PolygonalModel(List<Polygon> polygons, List<Texture> textures) {
        this.polygons = polygons;
        this.textures = textures;
    }
}
