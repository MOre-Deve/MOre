
package net.mcreator.more.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.more.itemgroup.MoreMaterialsItemGroup;
import net.mcreator.more.MoreModElements;

@MoreModElements.ModElement.Tag
public class TitaniumHoeItem extends MoreModElements.ModElement {
	@ObjectHolder("more:titanium_hoe")
	public static final Item block = null;
	public TitaniumHoeItem(MoreModElements instance) {
		super(instance, 32);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2380;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 70;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TitaniumIngotItem.block, (int) (1)));
			}
		}, -3f, new Item.Properties().group(MoreMaterialsItemGroup.tab)) {
		}.setRegistryName("titanium_hoe"));
	}
}
