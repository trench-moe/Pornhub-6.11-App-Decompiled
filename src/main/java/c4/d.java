package c4;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d<T extends ViewDataBinding> extends RecyclerView.z {

    /* renamed from: u  reason: collision with root package name */
    public final T f3737u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(T binding) {
        super(binding.f1901c);
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f3737u = binding;
    }
}
