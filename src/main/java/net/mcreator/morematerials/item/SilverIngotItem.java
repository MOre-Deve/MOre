
package net.mcreator.morematerials.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.morematerials.itemgroup.MoreMaterialsItemGroup;
import net.mcreator.morematerials.MorematerialsModElements;

@MorematerialsModElements.ModElement.Tag
public class SilverIngotItem extends MorematerialsModElements.ModElement {
	@ObjectHolder("morematerials:silver_ingot")
	public static final Item block = null;
	public SilverIngotItem(MorematerialsModElements instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MoreMaterialsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("silver_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
