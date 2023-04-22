package androidx.databinding;

import android.view.View;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b {
    public List<b> a() {
        return Collections.emptyList();
    }

    public abstract ViewDataBinding b(c cVar, View view, int i10);

    public abstract ViewDataBinding c(c cVar, View[] viewArr, int i10);
}
