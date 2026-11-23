package net.mreskimo.ecologymod.items;

import net.mreskimo.ecologymod.EcologyMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EcologicalItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(EcologyMod.MOD_ID);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
