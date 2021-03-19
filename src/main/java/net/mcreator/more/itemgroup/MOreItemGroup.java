
package net.mcreator.more.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.more.block.TitaniumOreBlock;
import net.mcreator.more.MoreModElements;

@MoreModElements.ModElement.Tag
public class MOreItemGroup extends MoreModElements.ModElement {
	public MOreItemGroup(MoreModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabm_ore") {
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
