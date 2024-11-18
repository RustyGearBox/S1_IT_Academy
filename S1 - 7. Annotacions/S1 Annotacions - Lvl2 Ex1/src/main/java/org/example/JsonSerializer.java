package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class JsonSerializer {

    public static void serialize(Object object) throws IOException {
        JsonSerializable annotacion = object.getClass().getAnnotation(JsonSerializable.class);

        if (annotacion == null){
            throw new IllegalArgumentException("The class is not noted with @JsonSerializable");
        }

        String directory = annotacion.directory();
        String fileName = directory + "/" + object.getClass().getSimpleName() + ".json";

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(object);

        try(FileWriter writer = new FileWriter(fileName)) {
            writer.write(json);
        }

    }

}
