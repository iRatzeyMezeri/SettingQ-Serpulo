package example;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class SettingQSerpulo extends Mod{

    public SettingQSerpulo(){
        Log.info("Loaded Setting Q: Serpulo Constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("indev");
                dialog.cont.add("this mod is still in development").row();
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading Setting Q: Serpulo Content");
    }

}
