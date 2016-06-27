package com.ethan.entities;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityMiningEgg
  extends EntityThrowable
{
  public EntityMiningEgg(World par1World)
  {
    super(par1World);
  }
  
  public EntityMiningEgg(World par1World, EntityLivingBase par2EntityLivingBase)
  {
    super(par1World, par2EntityLivingBase);
  }
  
  public EntityMiningEgg(World par1World, double par2, double par4, double par6)
  {
    super(par1World, par2, par4, par6);
  }
  
  protected void onImpact(MovingObjectPosition position)
  {
    int r = 0;
	  int i = position.blockX;
    int j = position.blockY;
    int k = position.blockZ;
    int l = 1;
    int li = 0;
    if (!this.worldObj.isRemote) {
    	Block blck = worldObj.getBlock(i, j, k);
    	blck.dropBlockAsItem(worldObj, i, j, k, l , li);
      this.worldObj.setBlockToAir(i, j, k);
     
    
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
