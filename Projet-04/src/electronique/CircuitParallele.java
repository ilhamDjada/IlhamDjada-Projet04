package electronique;

import java.util.ArrayList;

public class CircuitParallele extends Circuit {
    public CircuitParallele(ArrayList<Composant> composants) {
        super(composants);
    }

    @Override
    public double calculerResistance() {

        double resultat=0.0;
        for(int i=0; i<=composants.size(); i++) {
            resultat +=1/(composants.get(i).calculerResistance());
        }
        return 1/ resultat;



    }

}
