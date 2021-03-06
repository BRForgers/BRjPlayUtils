package cf.brforgers.mods.brjplayutils.manager;

import de.ellpeck.actuallyadditions.api.ActuallyAdditionsAPI;
import de.ellpeck.actuallyadditions.mod.blocks.InitBlocks;
import de.ellpeck.actuallyadditions.mod.blocks.metalists.TheMiscBlocks;
import de.ellpeck.actuallyadditions.mod.items.InitItems;
import de.ellpeck.actuallyadditions.mod.items.metalists.TheDusts;
import mekanism.common.recipe.RecipeHandler;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class RecipeManager {
    public static void init() {
        Item dimensionalShard = ForgeRegistries.ITEMS.getValue(new ResourceLocation("rftools", "dimensional_shard"));
        Block dimensionalShardOre = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("rftools", "dimensional_shard_ore"));
        ItemStack blackquartzdust = new ItemStack(InitItems.itemDust,2, TheDusts.QUARTZ_BLACK.ordinal());
        ItemStack blackquartzore = new ItemStack(InitBlocks.blockMisc,1, TheMiscBlocks.ORE_QUARTZ.ordinal());

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockManager.blockDimensionalShard,1),
                "AAA","AAA","AAA",
                'A', dimensionalShard));
        GameRegistry.addShapelessRecipe(new ItemStack(dimensionalShard,9), BlockManager.blockDimensionalShard);
        ActuallyAdditionsAPI.addCrusherRecipe(new ItemStack(dimensionalShardOre,1), new ItemStack(dimensionalShard,4),null,0);
        GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.eggSeed,1), new ItemStack(Items.EGG,1));
        RecipeHandler.addEnrichmentChamberRecipe(new ItemStack(dimensionalShardOre), new ItemStack(dimensionalShard,6));
        RecipeHandler.addEnrichmentChamberRecipe(blackquartzore,blackquartzdust);
    }
}
