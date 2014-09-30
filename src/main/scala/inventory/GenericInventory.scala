package inventory

import net.minecraft.entity.player.EntityPlayer
import net.minecraft.inventory.IInventory
import net.minecraft.item.ItemStack
import net.minecraft.tileentity.TileEntity

/**
 * Created by Subhi on 9/30/2014.
 */
class GenericInventory extends TileEntity with IInventory {
  private var inventory = Array.fill[ItemStack](9)(null)
  override def getSizeInventory: Int = inventory.length

  override def decrStackSize(slot : Int, amount : Int): ItemStack = inventory(slot)

  override def closeInventory(): Unit = ???

  override def getInventoryStackLimit: Int = 64

  override def isItemValidForSlot(p_94041_1_ : Int, p_94041_2_ : ItemStack): Boolean = ???

  override def getStackInSlotOnClosing(slot : Int): ItemStack = inventory(slot)

  override def openInventory(): Unit = ???

  override def setInventorySlotContents(slot : Int, stack : ItemStack): Unit = inventory(slot) = stack

  override def isUseableByPlayer(p_70300_1_ : EntityPlayer): Boolean = ???

  override def getStackInSlot(slotNum : Int): ItemStack = inventory(slotNum)

  override def hasCustomInventoryName: Boolean = ???

  override def getInventoryName: String = ???
}
