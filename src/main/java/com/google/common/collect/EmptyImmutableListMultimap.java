package com.google.common.collect;

/* loaded from: classes.dex */
class EmptyImmutableListMultimap extends ImmutableListMultimap<Object, Object> {
    private static final long serialVersionUID = 0;

    /* renamed from: t  reason: collision with root package name */
    public static final EmptyImmutableListMultimap f7939t = new EmptyImmutableListMultimap();

    private EmptyImmutableListMultimap() {
        super(RegularImmutableMap.f7966u, 0);
    }

    private Object readResolve() {
        return f7939t;
    }
}
