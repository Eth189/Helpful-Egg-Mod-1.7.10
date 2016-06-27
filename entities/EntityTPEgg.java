package com.ethan.entities;

import cpw.mods.fml.common.eventhandler.EventBus;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.network.NetworkManager;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

public class EntityTPEgg
  extends EntityThrowable
{
  public EntityTPEgg(World par1World)
  {
    super(par1World);
  }
  
  public EntityTPEgg(World par1World, EntityLivingBase par2EntityLivingBase)
  {
    super(par1World, par2EntityLivingBase);
  }
  
  public EntityTPEgg(World par1World, double par2, double par4, double par6)
  {
    super(par1World, par2, par4, par6);
  }
  
  protected void onImpact(MovingObjectPosition position)
  {
    int i = position.blockX;
    int j = position.blockY;
    int k = position.blockZ;
    if (!this.worldObj.isRemote)
    {
    	 if (this.getThrower() != null && this.getThrower() instanceof EntityPlayerMP)
         {
             EntityPlayerMP entityplayermp = (EntityPlayerMP)this.getThrower();

             if (entityplayermp.playerNetServerHandler.func_147362_b().isChannelOpen() && entityplayermp.worldObj == this.worldObj)
             {
                 EnderTeleportEvent event = new EnderTeleportEvent(entityplayermp, this.posX, this.posY, this.posZ, 5.0F);
                 if (!MinecraftForge.EVENT_BUS.post(event))
                 { // Don't indent to lower patch size
                 if (this.getThrower().isRiding())
                 {
                     this.getThrower().mountEntity((Entity)null);
                 }

                 this.getThrower().setPositionAndUpdate(event.targetX, event.targetY, event.targetZ);
                 this.setDead();
                 }
             }
         }
    }
  }
  
  protected float getGravityVelocity()
  {
    return 0.01F;
  }
  
  protected float func_70182_d()
  {
    return 0.7F;
  }
  
  protected float func_70183_g()
  {
    return -20.0F;
  }
}
