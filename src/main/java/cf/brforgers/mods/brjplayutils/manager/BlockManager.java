package cf.brforgers.mods.brjplayutils.manager;

import cf.brforgers.mods.brjplayutils.BRjPlaysUtils;
import cf.brforgers.mods.brjplayutils.blocks.BlockBase;
import cf.brforgers.mods.brjplayutils.blocks.BlockEggCrop;
import cf.brforgers.mods.brjplayutils.helper.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockManager {
    public static BlockBase blockDimensionalShard;
    public static BlockEggCrop eggCrop;

    public static void init(){
        blockDimensionalShard = register(new BlockBase(Material.ROCK,"block_dimensional_shard")).setCreativeTab(BRjPlaysUtils.tabBRjPlayUtils);
        eggCrop = register(new BlockEggCrop(),null);
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        if (itemBlock != null) {
            GameRegistry.register(itemBlock);
            if (block instanceof ItemModelProvider) {
                ((ItemModelProvider)block).registerItemModel(itemBlock);
            }
            if (block instanceof BlockBase) {
                ((BlockBase)block).registerItemModel(itemBlock);
            }
        }

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
