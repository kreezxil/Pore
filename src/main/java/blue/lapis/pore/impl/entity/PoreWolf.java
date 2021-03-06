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
package blue.lapis.pore.impl.entity;

import blue.lapis.pore.converter.type.material.DyeColorConverter;
import blue.lapis.pore.converter.wrapper.WrapperConverter;

import org.apache.commons.lang3.NotImplementedException;
import org.bukkit.DyeColor;
import org.bukkit.entity.EntityType;
import org.spongepowered.api.data.manipulator.DyeableData;
import org.spongepowered.api.data.manipulator.entity.SittingData;
import org.spongepowered.api.entity.living.animal.Wolf;

public class PoreWolf extends PoreTameable implements org.bukkit.entity.Wolf {

    public static PoreWolf of(Wolf handle) {
        return WrapperConverter.of(PoreWolf.class, handle);
    }

    protected PoreWolf(Wolf handle) {
        super(handle);
    }

    @Override
    public Wolf getHandle() {
        return (Wolf) super.getHandle();
    }

    @Override
    public EntityType getType() {
        return EntityType.WOLF;
    }

    @Override
    public boolean isAngry() {
        throw new NotImplementedException("TODO"); //TODO
    }

    @Override
    public void setAngry(boolean angry) {
        throw new NotImplementedException("TODO"); //TODO
    }

    @Override
    public boolean isSitting() {
        return has(SittingData.class);
    }

    @Override
    public void setSitting(boolean sitting) {
        if (sitting != isSitting()) {
            if (sitting) {
                set(getOrCreate(SittingData.class));
            } else {
                remove(SittingData.class);
            }
        }
    }

    @Override
    public DyeColor getCollarColor() {
        return DyeColorConverter.of(get(DyeableData.class).getValue());
    }

    @Override
    public void setCollarColor(DyeColor color) {
        DyeableData dyeable = getOrCreate(DyeableData.class);
        dyeable.setValue(DyeColorConverter.of(color));
        set(dyeable);
    }
}
