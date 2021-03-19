
package net.mcreator.more.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.more.block.TitaniumOreBlock;
import net.mcreator.more.MoreModElements;

@MoreModElements.ModElement.Tag
public class MoreMaterialsItemGroup extends MoreModElements.ModElement {
	public MoreMaterialsItemGroup(MoreModElements instance) {
		super(instance, 65);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmore_materials") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TitaniumOreBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
