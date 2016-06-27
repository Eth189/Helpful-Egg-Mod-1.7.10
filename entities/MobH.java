package com.ethan.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class MobH
  extends EntityThrowable
{
  public MobH(World par1World)
  {
    super(par1World);
  }
  
  public MobH(World par1World, EntityLivingBase par2EntityLivingBase)
  {
    super(par1World, par2EntityLivingBase);
  }
  
  public MobH(World par1World, double par2, double par4, double par6)
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
        EntitySpider entitychicken = new EntitySpider(this.worldObj);
        
        entitychicken.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
        this.worldObj.spawnEntityInWorld(entitychicken);
        EntitySpider entitychicken1 = new EntitySpider(this.worldObj);
        entitychicken1.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
        this.worldObj.spawnEntityInWorld(entitychicken1);
      


        EntityCreeper entitychicken11 = new EntityCreeper(this.worldObj);
         entitychicken11.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
        this.worldObj.spawnEntityInWorld(entitychicken11);
        EntityCreeper entitychicken111 = new EntityCreeper(this.worldObj);
        entitychicken111.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
       this.worldObj.spawnEntityInWorld(entitychicken111);
       EntityCreeper entitychicken1111 = new EntityCreeper(this.worldObj);
       entitychicken1111.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
      this.worldObj.spawnEntityInWorld(entitychicken1111);
      EntityCreeper entitychicken11111 = new EntityCreeper(this.worldObj);
      entitychicken11111.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
     this.worldObj.spawnEntityInWorld(entitychicken11111);
     
     
     EntitySkeleton entitys = new EntitySkeleton(this.worldObj);
      entitys.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
      this.worldObj.spawnEntityInWorld(entitys);
      EntitySkeleton entitys1 = new EntitySkeleton(this.worldObj);
      entitys1.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
      this.worldObj.spawnEntityInWorld(entitys1);
      
      
      EntityZombie entitys11 = new EntityZombie(this.worldObj);
      entitys11.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
      this.worldObj.spawnEntityInWorld(entitys11);
      EntityZombie entitys111 = new EntityZombie(this.worldObj);
      entitys111.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
      this.worldObj.spawnEntityInWorld(entitys111);
      
      this.setDead();
    }
  }
  
  protected float onImpact()
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
