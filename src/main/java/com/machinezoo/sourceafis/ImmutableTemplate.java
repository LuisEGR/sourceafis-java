// Part of SourceAFIS for Java: https://sourceafis.machinezoo.com/java
package com.machinezoo.sourceafis;

class ImmutableTemplate {
	static final ImmutableTemplate EMPTY = new ImmutableTemplate();
	final IntPoint size;
	final ImmutableMinutia[] minutiae;
	final NeighborEdge[][] edges;
	private ImmutableTemplate() {
		size = new IntPoint(1, 1);
		minutiae = new ImmutableMinutia[0];
		edges = new NeighborEdge[0][];
	}
	ImmutableTemplate(TemplateBuilder builder) {
		size = builder.size;
		minutiae = builder.minutiae;
		edges = builder.edges;
	}
}
