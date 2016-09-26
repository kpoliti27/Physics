package org.micds.physics.kinematics.visual;

import javafx.scene.shape.Sphere;
import lombok.Data;
import org.micds.physics.kinematics.Entity;

@Data
public class Ball extends Sphere {
	private final Entity ent;

	public Ball(final Entity entity) {
		this(1.0, entity);
	}

	public Ball(final double[] position) {
		this(new Entity(position));
	}

	public Ball(final double radius, final double[] position) {
		this(radius, new Entity(position));
	}

	public Ball(final double radius, final Entity ent) {
		super(radius);
		this.ent = ent;
	}

	// TODO: Bridge gap between physics entity and javafx sphere representation

}
