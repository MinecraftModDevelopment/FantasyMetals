package fantasymetals.items;

import cyano.basemetals.init.Achievements;
import cyano.basemetals.material.MetalMaterial;
import fantasymetals.init.Materials;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMetalBlend extends cyano.basemetals.items.ItemMetalBlend {

	public ItemMetalBlend(MetalMaterial metal) {
		super(metal);
		// TODO Auto-generated constructor stub
	}

    public void onCreated(final ItemStack item, final World world, final EntityPlayer crafter) {
    	super.onCreated(item, world, crafter);
    	// achievement
    	if(metal == Materials.template){
        	crafter.addStat(Achievements.metallurgy, 1);
    	}
	}
}