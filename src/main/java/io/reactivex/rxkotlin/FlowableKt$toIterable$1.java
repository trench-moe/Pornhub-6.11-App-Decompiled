package io.reactivex.rxkotlin;

import com.appsflyer.oaid.BuildConfig;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, d2 = {"io/reactivex/rxkotlin/FlowableKt$toIterable$1", BuildConfig.FLAVOR, "iterator", BuildConfig.FLAVOR, "rxkotlin"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class FlowableKt$toIterable$1<T> implements Iterable<T>, KMappedMarker {
    public final /* synthetic */ Iterator $this_toIterable;

    public FlowableKt$toIterable$1(Iterator<? extends T> it) {
        this.$this_toIterable = it;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.$this_toIterable;
    }
}
