package cf.brforgers.mods.brjplayutils.proxy;

import cf.brforgers.mods.brjplayutils.BRjPlaysUtils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(BRjPlaysUtils.MOD_ID + ":" + id, "inventory"));
    }
}
