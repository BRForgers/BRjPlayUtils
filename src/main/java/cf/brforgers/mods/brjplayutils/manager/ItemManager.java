package cf.brforgers.mods.brjplayutils.manager;

import cf.brforgers.mods.brjplayutils.helper.ItemModelProvider;
import cf.brforgers.mods.brjplayutils.items.ItemEggSeed;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemManager {
    public static ItemEggSeed eggSeed;

    public static void init() {
        eggSeed = register(new ItemEggSeed());
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if(item instanceof ItemModelProvider) {
            ((ItemModelProvider)item).registerItemModel(item);
        }

        return item;
    }
}
