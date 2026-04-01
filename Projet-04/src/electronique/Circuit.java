package electronique;

import java.util.ArrayList;

public abstract class  Circuit extends Composant {
   protected ArrayList<Composant> composants = new ArrayList<>();

    public Circuit(ArrayList<Composant> composants) {
        this.composants = composants;
    }
}

