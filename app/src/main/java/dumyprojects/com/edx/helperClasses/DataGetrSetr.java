package dumyprojects.com.edx.helperClasses;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by lenovo on 6/7/2018.
 */

public class DataGetrSetr {

    String name;
    int id;
    int image;
    Activity activity;
    public DataGetrSetr(String name, int id, int image, Activity activity){
        this.name=name;
        this.id=id;
        this.image=image;
        this.activity=activity;

        setName(name);
        setId(id);
        setImage(image);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
          return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
