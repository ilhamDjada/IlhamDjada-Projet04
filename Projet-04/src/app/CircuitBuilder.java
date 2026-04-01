package app;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import electronique.Composant;

import java.io.File;
import java.io.IOException;

public class CircuitBuilder {
    public CircuitBuilder() {}
        public Composant construireCircuit(String json) {
            ObjectMapper mapper = new ObjectMapper();
            try{
                JsonNode donneeCircuit= mapper.readTree(new File(json));

            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }


            return null;
        }
       private Composant lireComposant(JsonNode nede){


        }




}
