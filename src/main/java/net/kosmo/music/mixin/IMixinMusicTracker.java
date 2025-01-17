package net.kosmo.music.mixin;

import net.minecraft.client.sound.MusicTracker;
import net.minecraft.client.sound.SoundInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(MusicTracker.class)
public interface IMixinMusicTracker {
    @Accessor
    SoundInstance getCurrent();
    @Accessor
    void setCurrent(SoundInstance soundInstance);
}
