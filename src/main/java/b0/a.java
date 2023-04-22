package b0;

import android.app.Activity;
import android.content.pm.PackageManager;
import b0.c;

/* loaded from: classes.dex */
public class a implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String[] f3382c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Activity f3383f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f3384j;

    public a(String[] strArr, Activity activity, int i10) {
        this.f3382c = strArr;
        this.f3383f = activity;
        this.f3384j = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr = new int[this.f3382c.length];
        PackageManager packageManager = this.f3383f.getPackageManager();
        String packageName = this.f3383f.getPackageName();
        int length = this.f3382c.length;
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = packageManager.checkPermission(this.f3382c[i10], packageName);
        }
        ((c.a) this.f3383f).onRequestPermissionsResult(this.f3384j, this.f3382c, iArr);
    }
}
