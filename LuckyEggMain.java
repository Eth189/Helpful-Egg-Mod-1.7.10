package com.ethan;

import com.ethan.entities.BEgg10;
import com.ethan.entities.BEgg5;
import com.ethan.entities.BEgg50;
import com.ethan.entities.EntityBEgg1;
import com.ethan.entities.EntityHelpfulChicken;
import com.ethan.entities.EntityHouseEgg;
import com.ethan.entities.EntityMiningEgg;
import com.ethan.entities.EntityTPEgg;
import com.ethan.entities.MobH;
import com.ethan.items.ItemBEgg1;
import com.ethan.items.ItemBEgg10;
import com.ethan.items.ItemBEgg5;
import com.ethan.items.ItemBEgg50;
import com.ethan.items.ItemHouseEgg1;
import com.ethan.items.ItemLuckyEgg;
import com.ethan.items.ItemMobH;
import com.ethan.items.ItemTPEgg;
import com.ethan.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;

@Mod(modid="ethan_luckyegg", version="2.0 Alpha", name="Helpful Egg Mod", acceptedMinecraftVersions="[1.7.10]")
public class LuckyEggMain
{
  public static final String modid = "ethan_luckyegg";
  public static final String version = "2.0 Alpha";
  public static final String name = "Helpful Egg Mod";
  @SidedProxy(clientSide="com.ethan.proxies.ClientProxy", serverSide="com.ethan.proxies.CommonProxy")
  public static CommonProxy proxy;
  public static Item LuckyEgg;
  public static Item TPEgg;
  public static Item BEgg1;
  public static Item BEgg5;
  public static Item BEgg10;
  public static Item BEgg50;
  public static Item MobHord;
  public static Item HouseEgg;
  public static CreativeTabs tabEgg = new CreativeTabs("tabEgg")
  {
    @SideOnly(Side.CLIENT)
    public Item LuckyEgg()
    {
      return LuckyEggMain.LuckyEgg;
    }
  };
  static int startEntityId = 300;
  @SuppressWarnings("unchecked")
  public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor)
  {
    int id = getUniqueEntityId();
    EntityList.IDtoClassMapping.put(Integer.valueOf(id), entity);
    EntityList.entityEggs.put(Integer.valueOf(id), new EntityList.EntityEggInfo(id, primaryColor, secondaryColor));
  }
  
  private static int getUniqueEntityId()
  {
    do
    {
      startEntityId += 1;
    } while (EntityList.getStringFromID(startEntityId) != null);
    return startEntityId;
  }
  
  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event)
  {
    proxy.registerRendering();
    proxy.registerItemRenders();
    proxy.registerItemRenders2();
    proxy.registerItemRenders3();
    


    EntityRegistry.registerModEntity(EntityMiningEgg.class, "luckyegg", 2000, this, 80, 3, true);
    LuckyEgg = new ItemLuckyEgg("luckyegg");
    GameRegistry.registerItem(LuckyEgg, "Lucky Egg");
    EntityRegistry.registerModEntity(EntityTPEgg.class, "luckyegg", 2001, this, 80, 3, true);
    TPEgg = new ItemTPEgg("tpegg");
    GameRegistry.registerItem(TPEgg, "Teleportaion Egg");
    EntityRegistry.registerModEntity(EntityBEgg1.class, "begg1", 2002, this, 80, 3, true);
    BEgg1 = new ItemBEgg1("begg1");
    GameRegistry.registerItem(BEgg1, "Explosion Egg Size 1");
    EntityRegistry.registerModEntity(BEgg5.class, "begg5", 2003, this, 80, 3, true);
    BEgg5 = new ItemBEgg5("begg5");
    GameRegistry.registerItem(BEgg5, "Explosion Egg Size 5");
    EntityRegistry.registerModEntity(BEgg10.class, "begg10", 2004, this, 80, 3, true);
    BEgg10 = new ItemBEgg10("begg10");
    GameRegistry.registerItem(BEgg10, "Explosion Egg Size 10");
    EntityRegistry.registerModEntity(BEgg50.class, "begg50", 2005, this, 80, 3, true);
    BEgg50 = new ItemBEgg50("begg50");
    GameRegistry.registerItem(BEgg50, "Explosion Egg Size 50");
    EntityRegistry.registerModEntity(MobH.class, "mobhoard", 2006, this, 80, 3, true);
    MobHord = new ItemMobH("mobh");
    GameRegistry.registerItem(MobHord, "Mob Hoard");
    EntityRegistry.registerModEntity(EntityHouseEgg.class, "houseegg", 2007, this, 80, 3, true);
    HouseEgg = new ItemHouseEgg1("houseegg");
    GameRegistry.registerItem(HouseEgg, "House Spawning Egg");
    
    EntityRegistry.registerModEntity(EntityHelpfulChicken.class, "helpfulchicken", 2008, this, 80, 3, true);
    
    registerEntityEgg(EntityHelpfulChicken.class, 0xffff00, 0xff00000);
    
    EntityRegistry.addSpawn(EntityHelpfulChicken.class, 1, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] { BiomeGenBase.forest});
  }
  
  @Mod.EventHandler
  public void init(FMLInitializationEvent event)
  {
    GameRegistry.addRecipe(new ItemStack(LuckyEgg, 1), new Object[] { "   ", "XA ", "   ", 
      Character.valueOf('X'), Items.stone_pickaxe, Character.valueOf('A'), Items.egg });
    GameRegistry.addRecipe(new ItemStack(TPEgg, 1), new Object[] { "   ", "XA ", "   ", 
      Character.valueOf('X'), Items.ender_pearl, Character.valueOf('A'), Items.egg });
    GameRegistry.addRecipe(new ItemStack(BEgg1, 1), new Object[] { "   ", " XA", "   ", 
      Character.valueOf('X'), Blocks.TNT, Character.valueOf('A'), Items.egg });
    GameRegistry.addRecipe(new ItemStack(BEgg5, 1), new Object[] { "   ", "XAX", "   ", 
      Character.valueOf('X'), Blocks.TNT, Character.valueOf('A'), BEgg1 });
    GameRegistry.addRecipe(new ItemStack(BEgg10, 1), new Object[] { " X ", "XAX", " X ", 
      Character.valueOf('X'), Blocks.TNT, Character.valueOf('A'), BEgg5 });
    GameRegistry.addRecipe(new ItemStack(BEgg50, 1), new Object[] { "XXX", "XAX", "XXX", 
      Character.valueOf('X'), Blocks.TNT, Character.valueOf('A'), BEgg10 });
    GameRegistry.addRecipe(new ItemStack(MobHord, 1), new Object[] { "XXX", "ADA", "SSS", 
      Character.valueOf('X'), Items.rotten_flesh, Character.valueOf('A'), Items.bone, Character.valueOf('D'), Items.egg, Character.valueOf('S'), Items.spider_eye });
    GameRegistry.addRecipe(new ItemStack(HouseEgg, 1), new Object[] { "PPP", "PED", "CFH", Character.valueOf('P'), Blocks.torch, Character.valueOf('E'), Items.egg, Character.valueOf('D'), Blocks.torch, Character.valueOf('C'), Blocks.crafting_table, Character.valueOf('F'), Blocks.furnace, Character.valueOf('H'), Blocks.chest);
    
 
  }
}
