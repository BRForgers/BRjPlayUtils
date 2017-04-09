package cf.brforgers.mods.brjplayutils.items;

import cf.brforgers.mods.brjplayutils.BRjPlaysUtils;
import cf.brforgers.mods.brjplayutils.helper.ItemModelProvider;
import cf.brforgers.mods.brjplayutils.manager.BlockManager;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class ItemEggSeed extends ItemSeeds implements ItemModelProvider {

    public ItemEggSeed() {
        super(BlockManager.eggCrop, Blocks.FARMLAND);
        setUnlocalizedName("egg_seed");
        setRegistryName("egg_seed");
        setCreativeTab(BRjPlaysUtils.tabBRjPlayUtils);
    }

    @Override
    public void registerItemModel(Item item) {
        BRjPlaysUtils.proxy.registerItemRenderer(item, 0, "egg_seed");
    }

}
