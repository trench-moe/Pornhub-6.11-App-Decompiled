package r0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public abstract class c extends a {
    public LayoutInflater A;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public int f14620z;

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, null, z10);
        this.f14620z = i10;
        this.y = i10;
        this.A = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
