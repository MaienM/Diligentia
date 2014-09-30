package com.github.maienm.diligentia.blocks

import net.minecraft.block.Block
import net.minecraft.block.material.Material

/**
 * Created by Subhi on 9/30/2014.
 */
class GenericBlock(material : Material) extends Block(material) {
  setHarvestLevel("shovel", 2)
  setLightLevel(1.0f)
  setBlockTextureName("diligentiamod:genericDirt")
  def test() = {
    println(material)
  }
}
