package id.sch.smktelkom_mlg.actors1_rani;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ActorsService {
    @GET("/JSONParsingTutorial/jsonActors")
    Call<ActorsService> getActors();
}