
package net.mcreator.morematerials.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.morematerials.itemgroup.MoreMaterialsItemGroup;
import net.mcreator.morematerials.MorematerialsModElements;

@MorematerialsModElements.ModElement.Tag
public class CopperSwordItem extends MorematerialsModElements.ModElement {
	@ObjectHolder("morematerials:copper_sword")
	public static final Item block = null;
	public CopperSwordItem(MorematerialsModElements instance) {
		super(instance, 68);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 441;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 7f;
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
		}, 3, -3f, new Item.Properties().group(MoreMaterialsItemGroup.tab)) {
		}.setRegistryName("copper_sword"));
	}
}
