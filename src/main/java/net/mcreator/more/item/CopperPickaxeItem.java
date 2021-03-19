
package net.mcreator.more.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.more.itemgroup.MoreMaterialsItemGroup;
import net.mcreator.more.MoreModElements;

@MoreModElements.ModElement.Tag
public class CopperPickaxeItem extends MoreModElements.ModElement {
	@ObjectHolder("more:copper_pickaxe")
	public static final Item block = null;
	public CopperPickaxeItem(MoreModElements instance) {
		super(instance, 66);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 441;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 21;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CopperIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(MoreMaterialsItemGroup.tab)) {
		}.setRegistryName("copper_pickaxe"));
	}
}
