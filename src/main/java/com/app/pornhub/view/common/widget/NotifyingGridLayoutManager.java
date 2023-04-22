package com.app.pornhub.view.common.widget;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/view/common/widget/NotifyingGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "a", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class NotifyingGridLayoutManager extends GridLayoutManager {
    public a M;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifyingGridLayoutManager(Context context, int i10) {
        super(context, i10);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void D1(a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.M = listener;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public void l0(RecyclerView.w wVar) {
        super.l0(wVar);
        a aVar = this.M;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }
}
