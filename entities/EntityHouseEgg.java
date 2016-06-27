package com.ethan.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityHouseEgg
  extends EntityThrowable
{
  public EntityHouseEgg(World par1World)
  {
    super(par1World);
  }
  
  public EntityHouseEgg(World par1World, EntityLivingBase par2EntityLivingBase)
  {
    super(par1World, par2EntityLivingBase);
  }
  
  public EntityHouseEgg(World par1World, double par2, double par4, double par6)
  {
    super(par1World, par2, par4, par6);
  }
  

protected void onImpact(MovingObjectPosition position)
  {
    int i = position.blockX;
    int j = position.blocky;
    int k = position.blockY;
    if (!this.worldObj.isRemote)
    {
      this.world.setBlock(i, j + 1, k, Blocks.oak_wood);
      this.world.setBlock(i + 1, j + 1, k, Blocks.oak_wood);
      this.world.setBlock(i + 2, j + 1, k, Blocks.oak_wood);
      this.world.setBlock(i + 3, j + 1, k, Blocks.oak_wood);
      this.world.setBlock(i + 4, j + 1, k, Blocks.oak_wood);
      this.world.setBlock(i + 5, j + 1, k, Blocks.oak_wood);
      

      this.world.setBlock(i, j + 2, k, Blocks.oak_wood);
      this.world.setBlock(i + 1, j + 2, k, Blocks.oak_wood);
      this.world.setBlock(i + 2, j + 2, k, Blocks.oak_wood);
      this.world.setBlock(i + 3, j + 2, k, Blocks.oak_wood);
      this.world.setBlock(i + 4, j + 2, k, Blocks.oak_wood);
      this.world.setBlock(i + 5, j + 2, k, Blocks.oak_wood);
      
      this.world.setBlock(i + 5, j + 2, k + 1, Blocks.oak_wood);
      this.world.setBlock(i + 5, j + 2, k + 2, Blocks.oak_wood);
      this.world.setBlock(i + 5, j + 2, k + 3, Blocks.oak_wood);
      this.world.setBlock(i + 5, j + 2, k + 4, Blocks.oak_wood);
      this.world.setBlock(i + 5, j + 2, k + 5, Blocks.oak_wood);
      this.world.setBlock(i + 5, j + 2, k + 6, Blocks.oak_wood);
      

      this.world.setBlock(i + 5, j + 1, k + 1, Blocks.oak_wood);
      this.world.setBlock(i + 5, j + 1, k + 2, Blocks.oak_wood);
      this.world.setBlock(i + 5, j + 1, k + 3, Blocks.oak_wood);
      this.world.setBlock(i + 5, j + 1, k + 4, Blocks.oak_wood);
      this.world.setBlock(i + 5, j + 1, k + 5, Blocks.oak_wood);
      this.world.setBlock(i + 5, j + 1, k + 6, Blocks.oak_wood);
      


      this.world.setBlock(i, j + 1, k + 1, Blocks.oak_wood);
      this.world.setBlock(i, j + 1, k + 2, Blocks.oak_wood);
      this.world.setBlock(i, j + 1, k + 3, Blocks.oak_wood);
      this.world.setBlock(i, j + 1, k + 4, Blocks.oak_wood);
      this.world.setBlock(i, j + 1, k + 5, Blocks.oak_wood);
      this.world.setBlock(i, j + 1, k + 6, Blocks.oak_wood);
      

      this.world.setBlock(i, j + 2, k + 1, Blocks.oak_wood);
      this.world.setBlock(i, j + 2, k + 2, Blocks.oak_wood);
      this.world.setBlock(i, j + 2, k + 3, Blocks.oak_wood);
      this.world.setBlock(i, j + 2, k + 4, Blocks.oak_wood);
      this.world.setBlock(i, j + 2, k + 5, Blocks.oak_wood);
      this.world.setBlock(i, j + 2, k + 6, Blocks.oak_wood);
      

      this.world.setBlock(i, j + 1, k + 6, Blocks.oak_wood);
      this.world.setBlock(i + 1, j + 1, k + 6, Blocks.oak_wood);
      this.world.setBlock(i + 2, j + 1, k + 6, Blocks.oak_wood);
      this.world.setBlock(i + 3, j + 1, k + 6, Blocks.door);
      this.world.setBlock(i + 4, j + 1, k + 6, Blocks.oak_wood);
      this.world.setBlock(i + 5, j + 1, k + 6, Blocks.oak_wood);
      

      this.world.setBlock(i, j + 2, k + 6, Blocks.oak_wood);
      this.world.setBlock(i + 1, j + 2, k + 6, Blocks.oak_wood);
      this.world.setBlock(i + 2, j + 2, k + 6, Blocks.oak_wood);
      this.world.setBlock(i + 4, j + 2, k + 6, Blocks.oak_wood);
      this.world.setBlock(i + 5, j + 2, k + 6, Blocks.oak_wood);
      

      this.world.setBlock(i, j, k + 1, Blocks.oak_wood);
      this.world.setBlock(i + 1, j, k + 1, Blocks.oak_wood);
      this.world.setBlock(i + 2, j, k + 1, Blocks.oak_wood);
      this.world.setBlock(i + 3, j, k + 1, Blocks.oak_wood);
      this.world.setBlock(i + 4, j, k + 1, Blocks.oak_wood);
      this.world.setBlock(i + 5, j, k + 1, Blocks.oak_wood);
      this.world.setBlock(i, j, k + 2, Blocks.oak_wood);
      this.world.setBlock(i + 1, j, k + 2, Blocks.oak_wood);
      this.world.setBlock(i + 2, j, k + 2, Blocks.oak_wood);
      this.world.setBlock(i + 3, j, k + 2, Blocks.oak_wood);
      this.world.setBlock(i + 4, j, k + 2, Blocks.oak_wood);
      this.world.setBlock(i + 5, j, k + 2, Blocks.oak_wood);
      this.world.setBlock(i, j, k + 3, Blocks.oak_wood);
      this.world.setBlock(i + 1, j, k + 3, Blocks.oak_wood);
      this.world.setBlock(i + 2, j, k + 3, Blocks.oak_wood);
      this.world.setBlock(i + 3, j, k + 3, Blocks.oak_wood);
      this.world.setBlock(i + 4, j, k + 3, Blocks.oak_wood);
      this.world.setBlock(i + 5, j, k + 3, Blocks.oak_wood);
      this.world.setBlock(i, j, k + 4, Blocks.oak_wood);
      this.world.setBlock(i + 1, j, k + 4, Blocks.oak_wood);
      this.world.setBlock(i + 2, j, k + 4, Blocks.oak_wood);
      this.world.setBlock(i + 3, j, k + 4, Blocks.oak_wood);
      this.world.setBlock(i + 4, j, k + 4, Blocks.oak_wood);
      this.world.setBlock(i + 5, j, k + 4, Blocks.oak_wood);
      this.world.setBlock(i, j, k + 5, Blocks.oak_wood);
      this.world.setBlock(i + 1, j, k + 5, Blocks.oak_wood);
      this.world.setBlock(i + 2, j, k + 5, Blocks.oak_wood);
      this.world.setBlock(i + 3, j, k + 5, Blocks.oak_wood);
      this.world.setBlock(i + 4, j, k + 5, Blocks.oak_wood);
      this.world.setBlock(i + 5, j, k + 5, Blocks.oak_wood);
      this.world.setBlock(i, j, k + 6, Blocks.oak_wood);
      this.world.setBlock(i + 1, j, k + 6, Blocks.oak_wood);
      this.world.setBlock(i + 2, j, k + 6, Blocks.oak_wood);
      this.world.setBlock(i + 3, j, k + 6, Blocks.oak_wood);
      this.world.setBlock(i + 4, j, k + 6, Blocks.oak_wood);
      this.world.setBlock(i + 5, j, k + 6, Blocks.oak_wood);
      

      this.world.setBlock(i, j + 3, k + 1, Blocks.oak_wood);
      this.world.setBlock(i + 1, j + 3, k + 1, Blocks.oak_wood);
      this.world.setBlock(i + 2, j + 3, k + 1, Blocks.oak_wood);
      this.world.setBlock(i + 3, j + 3, k + 1, Blocks.oak_wood);
      this.world.setBlock(i + 4, j + 3, k + 1, Blocks.oak_wood);
      this.world.setBlock(i + 5, j + 3, k + 1, Blocks.oak_wood);
      this.world.setBlock(i, j + 3, k + 2, Blocks.oak_wood);
      this.world.setBlock(i + 1, j + 3, k + 2, Blocks.oak_wood);
      this.world.setBlock(i + 2, j + 3, k + 2, Blocks.oak_wood);
      this.world.setBlock(i + 3, j + 3, k + 2, Blocks.oak_wood);
      this.world.setBlock(i + 4, j + 3, k + 2, Blocks.oak_wood);
      this.world.setBlock(i + 5, j + 3, k + 2, Blocks.oak_wood);
      this.world.setBlock(i, j + 3, k + 3, Blocks.oak_wood);
      this.world.setBlock(i + 1, j + 3, k + 3, Blocks.oak_wood);
      this.world.setBlock(i + 2, j + 3, k + 3, Blocks.oak_wood);
      this.world.setBlock(i + 3, j + 3, k + 3, Blocks.oak_wood);
      this.world.setBlock(i + 4, j + 3, k + 3, Blocks.oak_wood);
      this.world.setBlock(i + 5, j + 3, k + 3, Blocks.oak_wood);
      this.world.setBlock(i, j + 3, k + 4, Blocks.oak_wood);
      this.world.setBlock(i + 1, j + 3, k + 4, Blocks.oak_wood);
      this.world.setBlock(i + 2, j + 3, k + 4, Blocks.oak_wood);
      this.world.setBlock(i + 3, j + 3, k + 4, Blocks.oak_wood);
      this.world.setBlock(i + 4, j + 3, k + 4, Blocks.oak_wood);
      this.world.setBlock(i + 5, j + 3, k + 4, Blocks.oak_wood);
      this.world.setBlock(i, j + 3, k + 5, Blocks.oak_wood);
      this.world.setBlock(i + 1, j + 3, k + 5, Blocks.oak_wood);
      this.world.setBlock(i + 2, j + 3, k + 5, Blocks.oak_wood);
      this.world.setBlock(i + 3, j + 3, k + 5, Blocks.oak_wood);
      this.world.setBlock(i + 4, j + 3, k + 5, Blocks.oak_wood);
      this.world.setBlock(i + 5, j + 3, k + 5, Blocks.oak_wood);
      this.world.setBlock(i + 3, j + 3, k + 6, Blocks.oak_wood);
      

      this.world.setBlock(i + 1, j + 1, k + 1, Blocks.crafting_table);
      this.world.setBlock(i + 2, j + 1, k + 1, Blocks.chest);
      this.world.setBlock(i + 1, j + 1, k + 2, Blocks.furnace);
      this.world.setBlock(i + 1, j + 2, k + 2, Blocks.torch);
      this.world.setBlock(i + 4, j + 2, k + 2, Blocks.torch);
      






      func_70106_y();
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

