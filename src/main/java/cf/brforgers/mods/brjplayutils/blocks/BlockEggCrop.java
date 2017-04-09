package cf.brforgers.mods.brjplayutils.blocks;

import cf.brforgers.mods.brjplayutils.manager.ItemManager;
import net.minecraft.block.BlockCrops;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockEggCrop extends BlockCrops {

    public BlockEggCrop() {
        setUnlocalizedName("crop_egg");
        setRegistryName("crop_egg");
    }

    @Override
    protected Item getSeed() {
        return ItemManager.eggSeed;
    }

    @Override
    protected Item getCrop() {
        return Items.EGG;
    }

}