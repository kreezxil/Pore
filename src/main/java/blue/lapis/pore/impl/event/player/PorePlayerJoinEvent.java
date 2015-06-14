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
package blue.lapis.pore.impl.event.player;

import static com.google.common.base.Preconditions.checkNotNull;

import blue.lapis.pore.event.DynamicallyReigster;
import blue.lapis.pore.impl.entity.PorePlayer;

import org.bukkit.entity.Player;
import org.spongepowered.api.event.entity.player.PlayerJoinEvent;
import org.spongepowered.api.text.Texts;
import org.spongepowered.api.util.TextMessageException;

@DynamicallyReigster
public class PorePlayerJoinEvent extends org.bukkit.event.player.PlayerJoinEvent {

    private final PlayerJoinEvent handle;

    public PorePlayerJoinEvent(PlayerJoinEvent handle) {
        super(null, null);
        this.handle = checkNotNull(handle, "handle");
    }

    public PlayerJoinEvent getHandle() {
        return handle;
    }

    @Override
    public Player getPlayer() {
        return PorePlayer.of(handle.getUser());
    }

    @Override
    public String getJoinMessage() {
        return Texts.legacy().to(handle.getNewMessage());
    }

    @Override
    @SuppressWarnings("deprecation")
    public void setJoinMessage(String joinMessage) {
        try {
            handle.setNewMessage(Texts.legacy().from(joinMessage));
        } catch (TextMessageException ex) {
            throw new IllegalArgumentException(ex);
        }
    }

}
