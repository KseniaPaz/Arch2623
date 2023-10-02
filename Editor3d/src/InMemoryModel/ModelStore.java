package InMemoryModel;

import java.util.List;
import java.util.ArrayList;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PolygonalModel;
import ModelElements.Scene;

public class ModelStore implements IModelChanger {

    public List<PolygonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver[] changedObservers;

    public ModelStore(IModelChangedObserver[] changeObservers) {
        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();
        
        models.add(new PolygonalModel(null));
        scenes.add(new Scene(1, null, null, null));
        flashes.add(new Flash());
        cameras.add(new Camera());
    }

    // Возвращает сцену по id
    public Scene getScene(Integer idScene){
        return null;

    }

    // Регистрация изменений
    @Override
    public void notifyChange(IModelChanger sender) {

    }

}
