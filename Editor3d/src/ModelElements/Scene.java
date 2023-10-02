package ModelElements;

import java.util.List;

public class Scene {

    public int id;
    public List<PolygonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, List<PolygonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public <Type> Type method1(Type typeValue){
        Type result = null;
        return result;
    }

    public <Type1, Type2> Type1 method2(Type1 type1Value1, Type2 type2Value2){
        Type1 result = null;
        return result;
    }

    
}
