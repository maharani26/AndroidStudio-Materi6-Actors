package id.sch.smktelkom_mlg.actors1_rani;

import com.google.gson.annotations.SerializedName;

import java.util.List;

//import javax.annotation.Generated;

//@Generated("com.robohorse.robopojogenerator")
public class ActorsResponse {
    @SerializedName("actors")
    private List<ActorsItem> actors;

    public List<ActorsItem> getActors() {
        return actors;
    }

    public void setActors(List<ActorsItem> actors) {
        this.actors = actors;
    }
}
