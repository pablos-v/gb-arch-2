package hw_5;

import java.util.Collection;

/**
 * Интерфейс BLL (Business Logical Layer)
 */
interface BusinessLogicalLayer {
    Collection<Model3D> getAllModels();

    Collection<Texture> getAllTextures();

    void renderModel(Model3D model);

    void renderAllModels();
}
