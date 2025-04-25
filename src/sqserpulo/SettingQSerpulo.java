package sqserpulo;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import sqserpulo.content.*;

public class SettingQSerpulo extends Mod{

    public SettingQSerpulo(){
        
    }

    @Override
    public void init(){
        for (Planet planet : Vars.content.planets()) {
            if (planet != sqserpuloPlanets.serpuloq) {
                planet.hiddenItems.addAll(sqserpuloItems.sqserpuloItems);
            }
        }
    }

    @Override
    public void loadContent(){
        sqserpuloPlanets.load();
        sqserpuloItems.load();
    }

}
