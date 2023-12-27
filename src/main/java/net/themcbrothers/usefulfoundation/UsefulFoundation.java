package net.themcbrothers.usefulfoundation;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.themcbrothers.usefulfoundation.infrastructure.Registration;

@Mod(UsefulFoundation.MOD_ID)
public class UsefulFoundation {
    public static final String MOD_ID = "usefulfoundation";

    public UsefulFoundation(IEventBus modEventBus) {
        // Register stuff
        Registration.register(modEventBus);
    }
}
