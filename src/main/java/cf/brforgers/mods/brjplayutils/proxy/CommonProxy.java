package cf.brforgers.mods.brjplayutils.proxy;

import cf.brforgers.mods.brjplayutils.events.DragonKill;
import cf.brforgers.mods.brjplayutils.manager.*;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy
{
    public void preInit() {
        BlockManager.init();
        ItemManager.init();
    }
    public void postInit() {
        RecipeManager.init();
        MinecraftForge.EVENT_BUS.register(new DragonKill());
    }

    public void registerItemRenderer(Item item, int meta, String id) {
    }
}
