package sirraisinbran.ebulliento.init;

import java.util.function.Supplier;

import net.minecraft.item.Food;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import sirraisinbran.ebulliento.EbullientOverworld;
import sirraisinbran.ebulliento.objects.ModdedSpawnEggItem;

public class Items {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EbullientOverworld.modid);
	
	public static final RegistryObject<ModdedSpawnEggItem> FISHLIN_SPAWN_EGG = ITEMS.register("fishlin_spawn_egg", () -> new ModdedSpawnEggItem(EntitiesInit.FISHLIN_ENTITY, 0xF0A5A2, 0xA9672B, new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> RED_PINEAPPLE = ITEMS.register("red_pineapple", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(2).saturation(1).build())));
	public static final RegistryObject<Item> CINNABAR_FLAKES = ITEMS.register("cinnabar_flakes", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> HYDRARGYRUM = ITEMS.register("hydrargyrum", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> HYDRARGYRUM_PICKAXE = ITEMS.register("hydrargyrum_pickaxe", () -> new PickaxeItem(HydrargyrumTier.HYDRARGYRUMTIER, 1, -2.8F, new Item.Properties().group(ItemGroup.TOOLS).maxStackSize(1).setNoRepair()));
	public static final RegistryObject<Item> REEDS = ITEMS.register("reeds", () -> new Item(new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<Item> POMEGRANATE = ITEMS.register("pomegranate", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(1).saturation(1).build())));
	
	public enum HydrargyrumTier implements IItemTier {
		HYDRARGYRUMTIER(2, 24, 5.0F, 1.5F, 0, () -> {
			return Ingredient.EMPTY;
		});
		
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantibility;
		private final LazyValue<Ingredient> repairMaterial;
		
		private HydrargyrumTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantibility, Supplier<Ingredient> repairMaterial) {
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantibility = enchantibility;
			this.repairMaterial = new LazyValue<>(repairMaterial);
			
		}

		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return this.enchantibility;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
	}
}
