package sirraisinbran.ebulliento.entities;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FishlinEntity extends AgeableEntity {
	
	public FishlinEntity(EntityType<? extends AgeableEntity> type, World worldIn) {
		super(type, worldIn);
	}
	
	BlockPos blockpos = this.func_233580_cy_();

	@Override
	protected void registerGoals() {
		this.goalSelector.addGoal(1, new SwimGoal(this));
		this.goalSelector.addGoal(2, new RandomWalkingGoal(this, 1.2d));
	}
	
	public static AttributeModifierMap.MutableAttribute func_234551_eU_() {
	    return MobEntity.func_233666_p_().func_233815_a_(Attributes.field_233821_d_, 0.5D).func_233815_a_(Attributes.field_233819_b_, 48.0D);
	}

	@Override
	public FishlinEntity createChild(final AgeableEntity parent) {
		return (FishlinEntity) getType().create(this.world);
	}
}
