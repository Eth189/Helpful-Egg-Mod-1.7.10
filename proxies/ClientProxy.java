package com.ethan.proxies;

import com.ethan.entities.BEgg10;
import com.ethan.entities.BEgg5;
import com.ethan.entities.BEgg50;
import com.ethan.entities.EntityBEgg1;
import com.ethan.entities.EntityHelpfulChicken;
import com.ethan.entities.EntityHouseEgg;
import com.ethan.entities.EntityMiningEgg;
import com.ethan.entities.EntityTPEgg;
import com.ethan.entities.MobH;
import com.ethan.model.ModelHelpChicken;
import com.ethan.render.RenderHelpChicken;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.init.Items;

public class ClientProxy
  extends CommonProxy
{
  public void registerRendering() {}
  
  public void registerItemRenders()
  {
    RenderingRegistry.registerEntityRenderingHandler(EntityMiningEgg.class, new RenderSnowball(Items.stone_pickaxe));
    RenderingRegistry.registerEntityRenderingHandler(EntityHelpfulChicken.class, new RenderHelpChicken(new ModelHelpChicken(), 0.5F));
  }
  
  public void registerItemRenders2()
  {
    RenderingRegistry.registerEntityRenderingHandler(EntityTPEgg.class, new RenderSnowball(Items.ender_pearl));
  }
  
  public void registerItemRenders3()
  {
    RenderingRegistry.registerEntityRenderingHandler(EntityBEgg1.class, new RenderSnowball(Items.egg));
    RenderingRegistry.registerEntityRenderingHandler(BEgg5.class, new RenderSnowball(Items.egg));
    RenderingRegistry.registerEntityRenderingHandler(BEgg10.class, new RenderSnowball(Items.egg));
    RenderingRegistry.registerEntityRenderingHandler(BEgg50.class, new RenderSnowball(Items.egg));
    RenderingRegistry.registerEntityRenderingHandler(MobH.class, new RenderSnowball(Items.egg));
    RenderingRegistry.registerEntityRenderingHandler(EntityHouseEgg.class, new RenderSnowball(Items.egg));
  }
}
