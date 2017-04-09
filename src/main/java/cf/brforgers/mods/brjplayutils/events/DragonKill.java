package cf.brforgers.mods.brjplayutils.events;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.AchievementList;
//import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DragonKill {
    @SubscribeEvent
    public void onMobKill(LivingDeathEvent e){
        if(e.getEntityLiving() != null) {
            if(!e.getEntityLiving().getEntityWorld().isRemote) {
                if (e.getEntityLiving() instanceof EntityDragon) {
                    if (e.getSource() != null) {
                        if (e.getSource().getEntity() != null) {
                            if (e.getSource().getEntity() instanceof EntityPlayer) {
//                                BlockPos endportal = new BlockPos(0,100,0);
//                                BlockPos endportalfix = new BlockPos(0,95,0);
                                    if(e.getEntityLiving().getEntityWorld().provider.getDimension() == 1) {
                                    EntityPlayerMP player = (EntityPlayerMP) e.getSource().getEntity();
//                                    player.getEntityWorld().destroyBlock(endportalfix,false);
//                                    player.getEntityWorld().setBlockState(endportalfix, Blocks.SAND.getDefaultState());
//                                    player.getEntityWorld().destroyBlock(endportal,false);
//                                    player.getEntityWorld().setBlockState(endportal, Blocks.DRAGON_EGG.getDefaultState());
                                      if (player.hasAchievement(AchievementList.THE_END2)) {
                                      player.getEntityWorld().spawnEntity(new EntityItem(player.getEntityWorld(), player.posX, player.posY, player.posZ, new ItemStack(Blocks.DRAGON_EGG)));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
