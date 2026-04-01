package electronique;

import java.util.ArrayList;

public class CircuitSerie extends Circuit {

    public CircuitSerie(ArrayList<Composant> composants) {

        super(composants);
    }

    @Override
    public double calculerResistance() {
        double resultat=0.0;
        for(int i=0; i<=composants.size(); i++) {
            resultat +=(composants.get(i).calculerResistance());
        }
        return  resultat;

    }
}
