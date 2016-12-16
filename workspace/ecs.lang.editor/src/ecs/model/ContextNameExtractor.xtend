package ecs.model

import java.util.Set
import java.util.List
import ecs.lang.AComponent
import ecs.lang.ContextName

class ContextNameExtractor {
	static def Set<ContextName> commonContextName(List<AComponent> components){
		if (components.isEmpty){
			return newHashSet()
		}
		val result = newHashSet()
		if (components.get(0).contextRef == null){
			result.add(null)
		}else{
			components.get(0).contextRef.context.forEach[result.add(it)]		
		}
		for(index : 1..<components.size){
			val thisSet = newHashSet()
			if (components.get(0).contextRef == null){
				thisSet.add(null)
			}else{
				components.get(index).contextRef.context.forEach[thisSet.add(it)]		
			}
//			components.get(index).contextRef.context.forEach[thisSet.add(it)]
			result.retainAll(thisSet)
		}
		result
	}
}