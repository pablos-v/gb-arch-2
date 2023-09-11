package hw_5;

/**
 * Интерфейс UI
 */
interface UILayer {

    void openProject(String fileName);

    void showProjectSettings();

    void saveProject();
    void deleteModel(int i);

    void printAllModels();

    void printAllTextures();

    void renderAll();

    void renderModel(int i);

}
