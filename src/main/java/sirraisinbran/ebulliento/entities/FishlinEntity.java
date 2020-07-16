package sirraisinbran.ebulliento.entities;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class FishlinEntity extends AnimalEntity {
	
	public FishlinEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
		super(type, worldIn);
	}

	@Override
	protected void registerGoals() {
		this.goalSelector.addGoal(0, new SwimGoal(this));
	    this.goalSelector.addGoal(1, new PanicGoal(this, 1.25D));
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.5D, true));
		this.goalSelector.addGoal(3, new LookAtGoal(this, PlayerEntity.class, 1.0F));
	    this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
	}
	
	public static AttributeModifierMap.MutableAttribute func_234551_eU_() {
	    return MobEntity.func_233666_p_().func_233815_a_(Attributes.field_233821_d_, 0.5D).func_233815_a_(Attributes.field_233819_b_, 48.0D).func_233815_a_(Attributes.field_233818_a_, 15.0D);
	}

	@Override
	public FishlinEntity createChild(final AgeableEntity parent) {
		return (FishlinEntity) getType().create(this.world);
	}
	
	@Override
	public boolean canDespawn(double distanceToClosestPlayer)
	{
		return false;
	}
}
