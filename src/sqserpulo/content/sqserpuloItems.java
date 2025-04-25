package sqserpulo.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class sqserpuloItems{
    public static Item
    scrapq, copperq, leadq, graphiteq, coalq, titaniumq, thoriumq, siliconq, plastaniumq,
    phaseFabricq, surgeAlloyq, sporePodq, sandq, blastCompoundq, pyratiteq, metaglassq,

    public static final Seq<Item> sqserpuloItems = new Seq<>();

    public static void load(){
        copperq = new Item("copper", Color.valueOf("d99d73")){{
            hardness = 1;
            cost = 0.5f;
            alwaysUnlocked = true;
        }};

        leadq = new Item("lead", Color.valueOf("8c7fa9")){{
            hardness = 1;
            cost = 0.7f;
        }};

        metaglassq = new Item("metaglass", Color.valueOf("ebeef5")){{
            cost = 1.5f;
        }};

        graphiteq = new Item("graphite", Color.valueOf("b2c6d2")){{
            cost = 1f;
        }};

        sandq = new Item("sand", Color.valueOf("f7cba4")){{
            lowPriority = true;
            buildable = false;
            //needed to show up as requirement
            alwaysUnlocked = true;
        }};

        coalq = new Item("coal", Color.valueOf("272727")){{
            explosiveness = 0.2f;
            flammability = 1f;
            hardness = 2;
            buildable = false;
        }};

        titaniumq = new Item("titanium", Color.valueOf("8da1e3")){{
            hardness = 3;
            cost = 1f;
        }};

        thoriumq = new Item("thorium", Color.valueOf("f9a3c7")){{
            explosiveness = 0.2f;
            hardness = 4;
            radioactivity = 1f;
            cost = 1.1f;
            healthScaling = 0.2f;
        }};

        scrapq = new Item("scrap", Color.valueOf("777777")){{
            cost = 0.5f;
        }};

        siliconq = new Item("silicon", Color.valueOf("53565c")){{
            cost = 0.8f;
        }};

        plastaniumq = new Item("plastanium", Color.valueOf("cbd97f")){{
            flammability = 0.1f;
            explosiveness = 0.2f;
            cost = 1.3f;
            healthScaling = 0.1f;
        }};

        phaseFabricq = new Item("phase-fabric", Color.valueOf("f4ba6e")){{
            cost = 1.3f;
            radioactivity = 0.6f;
            healthScaling = 0.25f;
        }};

        surgeAlloyq = new Item("surge-alloy", Color.valueOf("f3e979")){{
            cost = 1.2f;
            charge = 0.75f;
            healthScaling = 0.25f;
        }};

        sporePodq = new Item("spore-pod", Color.valueOf("7457ce")){{
            flammability = 1.15f;
            buildable = false;
        }};

        blastCompoundq = new Item("blast-compound", Color.valueOf("ff795e")){{
            flammability = 0.4f;
            explosiveness = 1.2f;
            buildable = false;
        }};

        pyratiteq = new Item("pyratite", Color.valueOf("ffaa5f")){{
            flammability = 1.4f;
            explosiveness = 0.4f;
            buildable = false;
        }};

        sqserpuloItems.addAll(
        scrapq, copperq, leadq, graphiteq, coalq, titaniumq, thoriumq, siliconq, plastaniumq,
        phaseFabricq, surgeAlloyq, sporePodq, sandq, blastCompoundq, pyratiteq, metaglassq
        );

    }
}
