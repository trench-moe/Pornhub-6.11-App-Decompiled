package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public class v0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1123a;

    /* renamed from: b  reason: collision with root package name */
    public final View f1124b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f1125c;
    public final WindowManager.LayoutParams d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f1126e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1127f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f1128g;

    public v0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.d = layoutParams;
        this.f1126e = new Rect();
        this.f1127f = new int[2];
        this.f1128g = new int[2];
        this.f1123a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f1124b = inflate;
        this.f1125c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(v0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2132017162;
        layoutParams.flags = 24;
    }

    public void a() {
        if (this.f1124b.getParent() != null) {
            ((WindowManager) this.f1123a.getSystemService("window")).removeView(this.f1124b);
        }
    }
}
