package net.amigocraft.pore.implementation.entity;

import org.apache.commons.lang.NotImplementedException;
import org.bukkit.DyeColor;
import org.bukkit.entity.Wolf;

public class PoreWolf extends PoreTameableAnimal implements Wolf {

	// TODO: Bridge

	public PoreWolf(org.spongepowered.api.entity.LivingEntity handle) { //TODO: accept most specfific type
		super(handle);
	}

	@Override
	public boolean isAngry() {
		return false;
	}

	@Override
	public void setAngry(boolean angry) {
		throw new NotImplementedException();
	}

	@Override
	public boolean isSitting() {
		return false;
	}

	@Override
	public void setSitting(boolean sitting) {
		throw new NotImplementedException();
	}

	@Override
	public DyeColor getCollarColor() {
		throw new NotImplementedException();
	}

	@Override
	public void setCollarColor(DyeColor color) {
		throw new NotImplementedException();
	}
}
