/*
 * Pore
 * Copyright (c) 2014-2015, Lapis <https://github.com/LapisBlue>
 *
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package blue.lapis.pore.converter.type.world.effect;

import blue.lapis.pore.converter.type.TypeConverter;

import com.google.common.base.Converter;
import org.bukkit.Sound;
import org.spongepowered.api.effect.sound.SoundType;
import org.spongepowered.api.effect.sound.SoundTypes;

public final class SoundConverter {

    private SoundConverter() {
    }

    public static final Converter<Sound, SoundType> CONVERTER = TypeConverter.builder(Sound.class, SoundType.class)
            .add(Sound.AMBIENCE_CAVE, SoundTypes.AMBIENCE_CAVE)
            .add(Sound.AMBIENCE_RAIN, SoundTypes.AMBIENCE_RAIN)
            .add(Sound.AMBIENCE_THUNDER, SoundTypes.AMBIENCE_THUNDER)
            .add(Sound.ANVIL_BREAK, SoundTypes.ANVIL_BREAK)
            .add(Sound.ANVIL_LAND, SoundTypes.ANVIL_LAND)
            .add(Sound.ANVIL_USE, SoundTypes.ANVIL_USE)
            .add(Sound.ARROW_HIT, SoundTypes.ARROW_HIT)
            .add(Sound.BURP, SoundTypes.BURP)
            .add(Sound.CHEST_CLOSE, SoundTypes.CHEST_CLOSE)
            .add(Sound.CHEST_OPEN, SoundTypes.CHEST_OPEN)
            .add(Sound.CLICK, SoundTypes.CLICK)
            .add(Sound.DOOR_CLOSE, SoundTypes.DOOR_CLOSE)
            .add(Sound.DOOR_OPEN, SoundTypes.DOOR_OPEN)
            .add(Sound.DRINK, SoundTypes.DRINK)
            .add(Sound.EAT, SoundTypes.EAT)
            .add(Sound.EXPLODE, SoundTypes.EXPLODE)
            .add(Sound.FALL_BIG, SoundTypes.FALL_BIG)
            .add(Sound.FALL_SMALL, SoundTypes.FALL_SMALL)
            .add(Sound.FIRE, SoundTypes.FIRE)
            .add(Sound.FIRE_IGNITE, SoundTypes.FIRE_IGNITE)
            .add(Sound.FIZZ, SoundTypes.FIZZ)
            .add(Sound.FUSE, SoundTypes.FUSE)
            .add(Sound.GLASS, SoundTypes.GLASS)
            .add(Sound.HURT_FLESH, SoundTypes.HURT_FLESH)
            .add(Sound.ITEM_BREAK, SoundTypes.ITEM_BREAK)
            .add(Sound.ITEM_PICKUP, SoundTypes.ITEM_PICKUP)
            .add(Sound.LAVA, SoundTypes.LAVA)
            .add(Sound.LAVA_POP, SoundTypes.LAVA_POP)
            .add(Sound.LEVEL_UP, SoundTypes.LEVEL_UP)
            .add(Sound.MINECART_BASE, SoundTypes.MINECART_BASE)
            .add(Sound.MINECART_INSIDE, SoundTypes.MINECART_INSIDE)
            .add(Sound.NOTE_BASS, SoundTypes.NOTE_BASS)
            .add(Sound.NOTE_PIANO, SoundTypes.NOTE_PIANO)
            .add(Sound.NOTE_BASS_DRUM, SoundTypes.NOTE_BASS_DRUM)
            .add(Sound.NOTE_STICKS, SoundTypes.NOTE_STICKS)
            .add(Sound.NOTE_BASS_GUITAR, SoundTypes.NOTE_BASS_GUITAR)
            .add(Sound.NOTE_SNARE_DRUM, SoundTypes.NOTE_SNARE_DRUM)
            .add(Sound.NOTE_PLING, SoundTypes.NOTE_PLING)
            .add(Sound.ORB_PICKUP, SoundTypes.ORB_PICKUP)
            .add(Sound.PISTON_EXTEND, SoundTypes.PISTON_EXTEND)
            .add(Sound.PISTON_RETRACT, SoundTypes.PISTON_RETRACT)
            .add(Sound.PORTAL, SoundTypes.PORTAL)
            .add(Sound.PORTAL_TRAVEL, SoundTypes.PORTAL_TRAVEL)
            .add(Sound.PORTAL_TRIGGER, SoundTypes.PORTAL_TRIGGER)
            .add(Sound.SHOOT_ARROW, SoundTypes.SHOOT_ARROW)
            .add(Sound.SPLASH, SoundTypes.SPLASH)
            .add(Sound.SPLASH2, SoundTypes.SPLASH2)
            .add(Sound.STEP_GRASS, SoundTypes.STEP_GRASS)
            .add(Sound.STEP_GRAVEL, SoundTypes.STEP_GRAVEL)
            .add(Sound.STEP_LADDER, SoundTypes.STEP_LADDER)
            .add(Sound.STEP_SAND, SoundTypes.STEP_SAND)
            .add(Sound.STEP_SNOW, SoundTypes.STEP_SNOW)
            .add(Sound.STEP_STONE, SoundTypes.STEP_STONE)
            .add(Sound.STEP_WOOD, SoundTypes.STEP_WOOD)
            .add(Sound.STEP_WOOL, SoundTypes.STEP_WOOL)
            .add(Sound.SWIM, SoundTypes.SWIM)
            .add(Sound.WATER, SoundTypes.WATER)
            .add(Sound.WOOD_CLICK, SoundTypes.WOOD_CLICK)
            .add(Sound.BAT_DEATH, SoundTypes.BAT_DEATH)
            .add(Sound.BAT_HURT, SoundTypes.BAT_HURT)
            .add(Sound.BAT_IDLE, SoundTypes.BAT_IDLE)
            .add(Sound.BAT_LOOP, SoundTypes.BAT_LOOP)
            .add(Sound.BAT_TAKEOFF, SoundTypes.BAT_TAKEOFF)
            .add(Sound.BLAZE_BREATH, SoundTypes.BLAZE_BREATH)
            .add(Sound.BLAZE_DEATH, SoundTypes.BLAZE_DEATH)
            .add(Sound.BLAZE_HIT, SoundTypes.BLAZE_HIT)
            .add(Sound.CAT_HISS, SoundTypes.CAT_HISS)
            .add(Sound.CAT_HIT, SoundTypes.CAT_HIT)
            .add(Sound.CAT_MEOW, SoundTypes.CAT_MEOW)
            .add(Sound.CAT_PURR, SoundTypes.CAT_PURR)
            .add(Sound.CAT_PURREOW, SoundTypes.CAT_PURREOW)
            .add(Sound.CHICKEN_IDLE, SoundTypes.CHICKEN_IDLE)
            .add(Sound.CHICKEN_HURT, SoundTypes.CHICKEN_HURT)
            .add(Sound.CHICKEN_EGG_POP, SoundTypes.CHICKEN_EGG_POP)
            .add(Sound.CHICKEN_WALK, SoundTypes.CHICKEN_WALK)
            .add(Sound.COW_IDLE, SoundTypes.COW_IDLE)
            .add(Sound.COW_HURT, SoundTypes.COW_HURT)
            .add(Sound.COW_WALK, SoundTypes.COW_WALK)
            .add(Sound.CREEPER_HISS, SoundTypes.CREEPER_HISS)
            .add(Sound.CREEPER_DEATH, SoundTypes.CREEPER_DEATH)
            .add(Sound.ENDERDRAGON_DEATH, SoundTypes.ENDERDRAGON_DEATH)
            .add(Sound.ENDERDRAGON_GROWL, SoundTypes.ENDERDRAGON_GROWL)
            .add(Sound.ENDERDRAGON_HIT, SoundTypes.ENDERDRAGON_HIT)
            .add(Sound.ENDERDRAGON_WINGS, SoundTypes.ENDERDRAGON_WINGS)
            .add(Sound.ENDERMAN_DEATH, SoundTypes.ENDERMAN_DEATH)
            .add(Sound.ENDERMAN_HIT, SoundTypes.ENDERMAN_HIT)
            .add(Sound.ENDERMAN_IDLE, SoundTypes.ENDERMAN_IDLE)
            .add(Sound.ENDERMAN_TELEPORT, SoundTypes.ENDERMAN_TELEPORT)
            .add(Sound.ENDERMAN_SCREAM, SoundTypes.ENDERMAN_SCREAM)
            .add(Sound.ENDERMAN_STARE, SoundTypes.ENDERMAN_STARE)
            .add(Sound.GHAST_SCREAM, SoundTypes.GHAST_SCREAM)
            .add(Sound.GHAST_SCREAM2, SoundTypes.GHAST_SCREAM2)
            .add(Sound.GHAST_CHARGE, SoundTypes.GHAST_CHARGE)
            .add(Sound.GHAST_DEATH, SoundTypes.GHAST_DEATH)
            .add(Sound.GHAST_FIREBALL, SoundTypes.GHAST_FIREBALL)
            .add(Sound.GHAST_MOAN, SoundTypes.GHAST_MOAN)
            .add(Sound.IRONGOLEM_DEATH, SoundTypes.IRONGOLEM_DEATH)
            .add(Sound.IRONGOLEM_HIT, SoundTypes.IRONGOLEM_HIT)
            .add(Sound.IRONGOLEM_THROW, SoundTypes.IRONGOLEM_THROW)
            .add(Sound.IRONGOLEM_WALK, SoundTypes.IRONGOLEM_WALK)
            .add(Sound.MAGMACUBE_WALK, SoundTypes.MAGMACUBE_WALK)
            .add(Sound.MAGMACUBE_WALK2, SoundTypes.MAGMACUBE_WALK2)
            .add(Sound.MAGMACUBE_JUMP, SoundTypes.MAGMACUBE_JUMP)
            .add(Sound.PIG_IDLE, SoundTypes.PIG_IDLE)
            .add(Sound.PIG_DEATH, SoundTypes.PIG_DEATH)
            .add(Sound.PIG_WALK, SoundTypes.PIG_WALK)
            .add(Sound.SHEEP_IDLE, SoundTypes.SHEEP_IDLE)
            .add(Sound.SHEEP_SHEAR, SoundTypes.SHEEP_SHEAR)
            .add(Sound.SHEEP_WALK, SoundTypes.SHEEP_WALK)
            .add(Sound.SILVERFISH_HIT, SoundTypes.SILVERFISH_HIT)
            .add(Sound.SILVERFISH_KILL, SoundTypes.SILVERFISH_DEATH)
            .add(Sound.SILVERFISH_IDLE, SoundTypes.SILVERFISH_IDLE)
            .add(Sound.SILVERFISH_WALK, SoundTypes.SILVERFISH_WALK)
            .add(Sound.SKELETON_IDLE, SoundTypes.SKELETON_IDLE)
            .add(Sound.SKELETON_DEATH, SoundTypes.SKELETON_DEATH)
            .add(Sound.SKELETON_HURT, SoundTypes.SKELETON_HURT)
            .add(Sound.SKELETON_WALK, SoundTypes.SKELETON_WALK)
            .add(Sound.SLIME_ATTACK, SoundTypes.SLIME_ATTACK)
            .add(Sound.SLIME_WALK, SoundTypes.SLIME_WALK)
            .add(Sound.SLIME_WALK2, SoundTypes.SLIME_WALK2)
            .add(Sound.SPIDER_IDLE, SoundTypes.SPIDER_IDLE)
            .add(Sound.SPIDER_DEATH, SoundTypes.SPIDER_DEATH)
            .add(Sound.SPIDER_WALK, SoundTypes.SPIDER_WALK)
            .add(Sound.WITHER_DEATH, SoundTypes.WITHER_DEATH)
            .add(Sound.WITHER_HURT, SoundTypes.WITHER_HURT)
            .add(Sound.WITHER_IDLE, SoundTypes.WITHER_IDLE)
            .add(Sound.WITHER_SHOOT, SoundTypes.WITHER_SHOOT)
            .add(Sound.WITHER_SPAWN, SoundTypes.WITHER_SPAWN)
            .add(Sound.WOLF_BARK, SoundTypes.WOLF_BARK)
            .add(Sound.WOLF_DEATH, SoundTypes.WOLF_DEATH)
            .add(Sound.WOLF_GROWL, SoundTypes.WOLF_GROWL)
            .add(Sound.WOLF_HOWL, SoundTypes.WOLF_HOWL)
            .add(Sound.WOLF_HURT, SoundTypes.WOLF_HURT)
            .add(Sound.WOLF_PANT, SoundTypes.WOLF_PANT)
            .add(Sound.WOLF_SHAKE, SoundTypes.WOLF_SHAKE)
            .add(Sound.WOLF_WALK, SoundTypes.WOLF_WALK)
            .add(Sound.WOLF_WHINE, SoundTypes.WOLF_WHINE)
            .add(Sound.ZOMBIE_METAL, SoundTypes.ZOMBIE_METAL)
            .add(Sound.ZOMBIE_WOOD, SoundTypes.ZOMBIE_WOOD)
            .add(Sound.ZOMBIE_WOODBREAK, SoundTypes.ZOMBIE_WOODBREAK)
            .add(Sound.ZOMBIE_IDLE, SoundTypes.ZOMBIE_IDLE)
            .add(Sound.ZOMBIE_DEATH, SoundTypes.ZOMBIE_DEATH)
            .add(Sound.ZOMBIE_HURT, SoundTypes.ZOMBIE_HURT)
            .add(Sound.ZOMBIE_INFECT, SoundTypes.ZOMBIE_INFECT)
            .add(Sound.ZOMBIE_UNFECT, SoundTypes.ZOMBIE_UNFECT)
            .add(Sound.ZOMBIE_REMEDY, SoundTypes.ZOMBIE_REMEDY)
            .add(Sound.ZOMBIE_WALK, SoundTypes.ZOMBIE_WALK)
            .add(Sound.ZOMBIE_PIG_IDLE, SoundTypes.ZOMBIE_PIG_IDLE)
            .add(Sound.ZOMBIE_PIG_ANGRY, SoundTypes.ZOMBIE_PIG_ANGRY)
            .add(Sound.ZOMBIE_PIG_DEATH, SoundTypes.ZOMBIE_PIG_DEATH)
            .add(Sound.ZOMBIE_PIG_HURT, SoundTypes.ZOMBIE_PIG_HURT)
            .add(Sound.DIG_WOOL, SoundTypes.DIG_WOOL)
            .add(Sound.DIG_GRASS, SoundTypes.DIG_GRASS)
            .add(Sound.DIG_GRAVEL, SoundTypes.DIG_GRAVEL)
            .add(Sound.DIG_SAND, SoundTypes.DIG_SAND)
            .add(Sound.DIG_SNOW, SoundTypes.DIG_SNOW)
            .add(Sound.DIG_STONE, SoundTypes.DIG_STONE)
            .add(Sound.DIG_WOOD, SoundTypes.DIG_WOOD)
            .add(Sound.FIREWORK_BLAST, SoundTypes.FIREWORK_BLAST)
            .add(Sound.FIREWORK_BLAST2, SoundTypes.FIREWORK_BLAST2)
            .add(Sound.FIREWORK_LARGE_BLAST, SoundTypes.FIREWORK_LARGE_BLAST)
            .add(Sound.FIREWORK_LARGE_BLAST2, SoundTypes.FIREWORK_LARGE_BLAST2)
            .add(Sound.FIREWORK_TWINKLE, SoundTypes.FIREWORK_TWINKLE)
            .add(Sound.FIREWORK_TWINKLE2, SoundTypes.FIREWORK_TWINKLE2)
            .add(Sound.FIREWORK_LAUNCH, SoundTypes.FIREWORK_LAUNCH)
            .add(Sound.SUCCESSFUL_HIT, SoundTypes.SUCCESSFUL_HIT)
            .add(Sound.HORSE_ANGRY, SoundTypes.HORSE_ANGRY)
            .add(Sound.HORSE_ARMOR, SoundTypes.HORSE_ARMOR)
            .add(Sound.HORSE_BREATHE, SoundTypes.HORSE_BREATHE)
            .add(Sound.HORSE_DEATH, SoundTypes.HORSE_DEATH)
            .add(Sound.HORSE_GALLOP, SoundTypes.HORSE_GALLOP)
            .add(Sound.HORSE_HIT, SoundTypes.HORSE_HIT)
            .add(Sound.HORSE_IDLE, SoundTypes.HORSE_IDLE)
            .add(Sound.HORSE_JUMP, SoundTypes.HORSE_JUMP)
            .add(Sound.HORSE_LAND, SoundTypes.HORSE_LAND)
            .add(Sound.HORSE_SADDLE, SoundTypes.HORSE_SADDLE)
            .add(Sound.HORSE_SOFT, SoundTypes.HORSE_SOFT)
            .add(Sound.HORSE_WOOD, SoundTypes.HORSE_WOOD)
            .add(Sound.DONKEY_ANGRY, SoundTypes.DONKEY_ANGRY)
            .add(Sound.DONKEY_DEATH, SoundTypes.DONKEY_DEATH)
            .add(Sound.DONKEY_HIT, SoundTypes.DONKEY_HIT)
            .add(Sound.DONKEY_IDLE, SoundTypes.DONKEY_IDLE)
            .add(Sound.HORSE_SKELETON_DEATH, SoundTypes.HORSE_SKELETON_DEATH)
            .add(Sound.HORSE_SKELETON_HIT, SoundTypes.HORSE_SKELETON_HIT)
            .add(Sound.HORSE_SKELETON_IDLE, SoundTypes.HORSE_SKELETON_IDLE)
            .add(Sound.HORSE_ZOMBIE_DEATH, SoundTypes.HORSE_ZOMBIE_DEATH)
            .add(Sound.HORSE_ZOMBIE_HIT, SoundTypes.HORSE_ZOMBIE_HIT)
            .add(Sound.HORSE_ZOMBIE_IDLE, SoundTypes.HORSE_ZOMBIE_IDLE)
            .add(Sound.VILLAGER_DEATH, SoundTypes.VILLAGER_DEATH)
            .add(Sound.VILLAGER_HAGGLE, SoundTypes.VILLAGER_HAGGLE)
            .add(Sound.VILLAGER_HIT, SoundTypes.VILLAGER_HIT)
            .add(Sound.VILLAGER_IDLE, SoundTypes.VILLAGER_IDLE)
            .add(Sound.VILLAGER_NO, SoundTypes.VILLAGER_NO)
            .add(Sound.VILLAGER_YES, SoundTypes.VILLAGER_YES)
            .build();

    public static SoundType of(Sound sound) {
        return CONVERTER.convert(sound);
    }

    public static Sound of(SoundType sound) {
        return CONVERTER.reverse().convert(sound);
    }

}
