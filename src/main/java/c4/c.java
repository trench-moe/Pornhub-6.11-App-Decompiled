package c4;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.t;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ItemPlaylistBindingBinding;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c<T, V extends ViewDataBinding> extends t<T, d<? extends V>> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n.e<T> diffCallback) {
        super(diffCallback);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fa  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(androidx.recyclerview.widget.RecyclerView.z r13, int r14) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.c.h(androidx.recyclerview.widget.RecyclerView$z, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.z i(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(parent, "parent");
        ViewDataBinding c10 = androidx.databinding.d.c(LayoutInflater.from(parent.getContext()), R.layout.item_playlist_binding, parent, false, null);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(\n            Lay…          false\n        )");
        return new d((ItemPlaylistBindingBinding) c10);
    }
}
