package io.firstwave.hermes.systems;

import io.firstwave.hermes.Aspect;
import io.firstwave.hermes.Entity;
import io.firstwave.hermes.EntitySystem;
import io.firstwave.hermes.utils.ImmutableBag;

/**
 * This system has an empty aspect so it processes no entities, but it still gets invoked.
 * You can use this system if you need to execute some game logic and not have to concern
 * yourself about aspects or entities.
 * 
 * @author Arni Arent
 *
 */
public abstract class VoidEntitySystem extends EntitySystem {

	public VoidEntitySystem() {
		super(Aspect.getEmpty());
	}

	@Override
	protected final void processEntities(ImmutableBag<Entity> entities) {
		processSystem();
	}
	
	protected abstract void processSystem();

	@Override
	protected boolean checkProcessing() {
		return true;
	}

}
