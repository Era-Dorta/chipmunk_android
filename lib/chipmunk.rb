module CP
	java_import 'chipmunk.java.Shape'
	java_import 'chipmunk.java.Space'
	java_import 'chipmunk.java.Vec2'
	
	#Add array access method to Vec2 here since 
	#Java does not allow it on its side
	class Vec2
    def [](index)
      @coordinates[index]
    end
	end
	
	java_import 'chipmunk.java.Body'
	
	class Shape
		java_import 'chipmunk.java.Segment'
		java_import 'chipmunk.java.Poly'	
		java_import 'chipmunk.java.Circle'
	end	
end
