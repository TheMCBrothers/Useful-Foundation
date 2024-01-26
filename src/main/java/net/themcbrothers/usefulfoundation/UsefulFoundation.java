package net.themcbrothers.usefulfoundation;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.themcbrothers.usefulfoundation.core.Registration;

@Mod(UsefulFoundation.MOD_ID)
public class UsefulFoundation {
    public static final String MOD_ID = "usefulfoundation";

    public UsefulFoundation(IEventBus modEventBus) {
        // Register stuff
        Registration.register(modEventBus);
    }

    public static ResourceLocation rl(String pathIn) {
        return new ResourceLocation(MOD_ID, pathIn);
    }
}
