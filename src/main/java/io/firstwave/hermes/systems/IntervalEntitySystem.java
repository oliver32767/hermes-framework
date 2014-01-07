package io.firstwave.hermes.systems;

import io.firstwave.hermes.Aspect;
import io.firstwave.hermes.EntitySystem;


/**
 * A system that processes entities at a interval in milliseconds.
 * A typical usage would be a collision system or physics system.
 * 
 * @author Arni Arent
 *
 */
public abstract class IntervalEntitySystem extends EntitySystem {
	private float acc;
	private float interval;

	public IntervalEntitySystem(Aspect aspect, float interval) {
		super(aspect);
		this.interval = interval;
	}

	@Override
	protected boolean checkProcessing() {
		acc += world.getDelta();
		if(acc >= interval) {
			acc -= interval;
			return true;
		}
		return false;
	}

}
