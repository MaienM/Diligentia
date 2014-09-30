package com.github.maienm.diligentia


import cpw.mods.fml.common.registry.GameRegistry
import cpw.mods.fml.common.{FMLLog, Mod}
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.FMLInitializationEvent
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import com.github.maienm.diligentia.blocks.GenericBlock
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.init.Blocks
import net.minecraft.item.ItemStack
import net.minecraftforge.oredict.ShapedOreRecipe

/**
 * Created by Subhi on 9/30/2014.
 */
@Mod(name = "Diligentia mod", modid = "diligentiamod", version = "0.0.1 alpha", modLanguage = "scala")
object DiligentiaMod {
  val genericDirt = new GenericBlock(Material.rock)
  @EventHandler
  def init(event: FMLInitializationEvent) {
    FMLLog.info("TutorialMod has been loaded!")
    genericDirt.setHardness(2F).setStepSound(Block.soundTypeSnow).setBlockName("PistonDirt").setCreativeTab(CreativeTabs.tabTransport)
    GameRegistry.registerBlock(genericDirt, "pistonDirt")
    GameRegistry.addRecipe(new ShapedOreRecipe(genericDirt, "A", "A", new Character('A'), Blocks.dirt))
    val inputStack = new ItemStack(Blocks.dirt)
    val outputStack = new ItemStack(genericDirt)
    GameRegistry.addSmelting(inputStack, outputStack, 0.1F)
  }
}
