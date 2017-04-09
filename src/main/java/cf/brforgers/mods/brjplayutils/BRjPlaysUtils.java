package cf.brforgers.mods.brjplayutils;

import cf.brforgers.mods.brjplayutils.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityDragonPart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = BRjPlaysUtils.MOD_ID,
        name = BRjPlaysUtils.MOD_NAME,
        version = BRjPlaysUtils.VERSION,
        dependencies = "required-after:actuallyadditions;required-after:rftools"
)
public class BRjPlaysUtils {

    public static final String MOD_ID = "brjplayutils";
    public static final String MOD_NAME = "BRjPlay Utils";
    public static final String VERSION = "1.0";
    //Proxy Identity
    public static final String COMMONPROXY = "cf.brforgers.mods.brjplayutils.proxy.CommonProxy";
    public static final String CLIENT = "cf.brforgers.mods.brjplayutils.proxy.ClientProxy";
    public static final String RESOURCE_PATH = MOD_ID + ":";

    @Mod.Instance(MOD_ID)
    public static BRjPlaysUtils instance;

    public static Logger logger = LogManager.getLogger("BRjPlayUtils");

    @SidedProxy(clientSide = CLIENT, serverSide = COMMONPROXY)
    public static CommonProxy proxy;

    public static CreativeTabs tabBRjPlayUtils = new CreativeTabs("tabBRjPlayUtils")
    {
        @Override
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem()
        {
            return new ItemStack(Blocks.DRAGON_EGG);
        }

        @Override
        @SideOnly(Side.CLIENT)
        public boolean hasSearchBar()
        {
            return true;
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        logger.info("Armelin is Topper!");
        //logger = e.getModLog();
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        proxy.postInit();
    }
}
