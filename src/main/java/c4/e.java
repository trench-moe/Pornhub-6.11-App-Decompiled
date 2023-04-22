package c4;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class e extends RecyclerView.k {

    /* renamed from: a  reason: collision with root package name */
    public int f3738a;

    /* renamed from: b  reason: collision with root package name */
    public int f3739b;

    public e(int i10, int i11) {
        this.f3738a = i10;
        this.f3739b = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.w wVar) {
        RecyclerView.z K = RecyclerView.K(view);
        int e10 = K != null ? K.e() : -1;
        int i10 = this.f3739b;
        int i11 = e10 % i10;
        int i12 = this.f3738a;
        rect.left = i12 - ((i11 * i12) / i10);
        rect.right = ((i11 + 1) * i12) / i10;
        if (e10 >= i10) {
            rect.top = i12;
        }
        rect.top = i12;
    }
}
