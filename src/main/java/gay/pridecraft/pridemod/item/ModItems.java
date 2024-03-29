package gay.pridecraft.pridemod.item;


import gay.pridecraft.pridemod.PrideMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PotionItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item GENDER_FLUID = registerItem("gender_fluid",
            new PotionItem(new FabricItemSettings()));

    public static final Item BLAHAJ = registerItem("blahaj",
            new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PrideMod.MOD_ID, name), item);

    }

    public static void registerModItems() {

      // PrideMod.LOGGER.info("Making the gay items from" + PrideMod.MOD_ID);

    }
}
