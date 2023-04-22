package com.app.pornhub.view.common.widget;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/view/common/widget/NotifyingLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "a", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class NotifyingLinearLayoutManager extends LinearLayoutManager {
    public a E;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifyingLinearLayoutManager(Context context) {
        super(1, false);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public void l0(RecyclerView.w wVar) {
        super.l0(wVar);
        a aVar = this.E;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    public final void t1(a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.E = listener;
    }
}
