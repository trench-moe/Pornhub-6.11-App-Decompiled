package u1;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes2.dex */
public class b0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f15467a;

    public b0(View view) {
        this.f15467a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof b0) && ((b0) obj).f15467a.equals(this.f15467a);
    }

    public int hashCode() {
        return this.f15467a.hashCode();
    }
}
