package ecs.model

import java.util.Map
import java.util.Set

class ComponentModel {
	public String name
	public boolean unique
	public Map<String, String> properties
	public Set<String> contexNames
	public Integer index
	public String prefix
}