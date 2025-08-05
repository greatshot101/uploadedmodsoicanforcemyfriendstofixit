package com.greatshot101.mod.item;



import com.greatshot101.mod.mod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;



public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS,mod.MODID);




    public static final RegistryObject<Item> Titanium = ITEMS.register("Titanium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
