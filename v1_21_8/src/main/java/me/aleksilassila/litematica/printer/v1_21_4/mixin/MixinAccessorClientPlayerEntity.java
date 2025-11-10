package me.aleksilassila.litematica.printer.v1_21_4.mixin;

import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ClientPlayerEntity.class)
public interface MixinAccessorClientPlayerEntity {
    @Accessor("ticksLeftToDoubleTapSprint")
    void setTicksLeftToDoubleTapSprint(int ticksLeftToDoubleTapSprint);

    @Accessor("lastPitchClient")
    float getLastPitch();
    @Accessor("lastPitchClient")
    void setLastPitch(float lastPitch);

    @Accessor("lastYawClient")
    float getLastYaw();
    @Accessor("lastYawClient")
    void setLastYaw(float lastYaw);
}
