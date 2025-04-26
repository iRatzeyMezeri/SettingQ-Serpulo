package sqserpulo.content;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.Seq;
import mindustry.*;
import mindustry.ai.types.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.Drawf;
import mindustry.graphics.Layer;
import mindustry.graphics.Pal;
import mindustry.type.*;
import mindustry.type.weapons.*;

public class sqserpuloUnitTypes {

    public static UnitType

    //Core
    // alphaq, betaq, gammaq,

    // Ground Specialist
    // demadian, atraxq, spiroctq, arkyidq, toxopidq

    // Ground Assault
    daggerq, maceq, // staff, scepterq, stormbow,

    // Ground Support
    // novaq, pulsarq, quasarq, velaq, ursa,

    // Air Assault
    flareq; // horizonq, zenithq, antumbraq, eclipseq,

    // Air Support
    // mono, poly, mega, tera, exa,

    // Naval Assault
    // rissoq, minkeq, brydeq, seiq, omuraq,

    // Naval Support
    // retusaq, oxynoeq, cyerceq, aegiresq, navanaxq;
  
   public static void load() {
      daggerq = new UnitType("daggerq"){{
            constructor = MechUnit::create;
            researchCostMultiplier = 0.5f;
          
            speed = 0.5f;
            hitSize = 8f;
            health = 200;
            weapons.add(new Weapon("sqserpulo-daggerq-weapon"){{
                reload = 13f;
                x = 4.5f;
                y = 1f;
                top = false;
                ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(2.5f, 9){{
                    backColor = Color.valueOf("#ab98d2");
                    frontColor = Color.valueOf("#ffffff");
                    trailColor = Color.valueOf("#8c7ea8");
                    sprite = "sqserpulo-leadbullet-front";
                    backSprite = "sqserpulo-leadbullet-back";
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
       maceq = new UnitType("maceq"){{
            constructor = MechUnit::create;
            speed = 0.5f;
            hitSize = 10f;
            health = 550;
            armor = 4f;

            immunities.add(StatusEffects.burning);

            weapons.add(new Weapon("sqserpulo-maceq-flamethrower"){{
                top = false;
                shootSound = Sounds.flame;
                x = 4
                inaccuracy = 10f;
                shootY = 2f;
                reload = 3f;
                recoil = 1f;
                ejectEffect = Fx.none;
                bullet = new BasicBulletType(4.2f, 10f){{
                    width = 1f;
                    height = 1f;
                    backColor = Color.valueOf("#95abd8");
                    frontColor = Color.valueOf("#ccd9f5");
                    hitSize = 7f;
                    lifetime = 13f;
                    pierce = true;
                    pierceBuilding = true;
                    pierceCap = 2;
                    statusDuration = 60f * 4;
                    shootEffect = Fx.shootSmallFlame;
                    hitEffect = Fx.hitFlameSmall;
                    despawnEffect = Fx.none;
                    status = StatusEffects.burning;
                    keepVelocity = false;
                    hittable = false;
                }};
            }});
        }};
  }
}
