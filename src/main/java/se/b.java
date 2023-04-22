package se;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class b extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Function0 f15011e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function0 function0, String str, boolean z10, String str2, boolean z11) {
        super(str2, z11);
        this.f15011e = function0;
    }

    @Override // se.a
    public long a() {
        this.f15011e.invoke();
        return -1L;
    }
}
