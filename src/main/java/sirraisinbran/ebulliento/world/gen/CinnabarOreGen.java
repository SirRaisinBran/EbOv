package sirraisinbran.ebulliento.world.gen;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;
import sirraisinbran.ebulliento.init.Blocks;

public class CinnabarOreGen {

	public static void generateOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
			if (biome == Biomes.DESERT) {
				ConfiguredPlacement<CountRangeConfig> customConfig = Placement.COUNT_RANGE
						.configure(new CountRangeConfig(5, 20, 20, 40));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE
								.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.CINNABAR_ORE.get().getDefaultState(), 3))
								.withPlacement(customConfig));
			}
		}
	}

}
