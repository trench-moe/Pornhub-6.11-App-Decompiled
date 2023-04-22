package bb;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f3626i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f3627j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f3628k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f3629l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: b  reason: collision with root package name */
    public final Paint f3631b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f3632c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f3633e;

    /* renamed from: f  reason: collision with root package name */
    public int f3634f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f3635g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public Paint f3636h = new Paint();

    /* renamed from: a  reason: collision with root package name */
    public final Paint f3630a = new Paint();

    public a() {
        a(-16777216);
        this.f3636h.setColor(0);
        Paint paint = new Paint(4);
        this.f3631b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f3632c = new Paint(paint);
    }

    public void a(int i10) {
        this.d = e0.a.j(i10, 68);
        this.f3633e = e0.a.j(i10, 20);
        this.f3634f = e0.a.j(i10, 0);
        this.f3630a.setColor(this.d);
    }
}
