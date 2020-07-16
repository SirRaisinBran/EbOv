package sirraisinbran.ebulliento.init;

import net.minecraft.block.Block;
import net.minecraft.block.HayBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import sirraisinbran.ebulliento.EbullientOverworld;

public class Blocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EbullientOverworld.modid);
	
	public static final RegistryObject<Block> THATCH = BLOCKS.register("thatch", () -> new HayBlock(Block.Properties.create(Material.ORGANIC).hardnessAndResistance(0.5f).sound(SoundType.PLANT).harvestTool(ToolType.HOE)))));
	public static final RegistryObject<Block> CINNABAR_ORE = BLOCKS.register("cinnabar_ore", () -> new OreBlock(Block.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(3.0F, 3.0F).harvestTool(ToolType.PICKAXE)));
}
