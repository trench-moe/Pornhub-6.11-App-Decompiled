package b0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import c0.a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r implements Iterable<Intent> {

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<Intent> f3441c = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final Context f3442f;

    public r(Context context) {
        this.f3442f = context;
    }

    public r b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f3442f.getPackageManager());
        }
        if (component != null) {
            e(component);
        }
        this.f3441c.add(intent);
        return this;
    }

    public r e(ComponentName componentName) {
        int size = this.f3441c.size();
        try {
            Intent b10 = h.b(this.f3442f, componentName);
            while (b10 != null) {
                this.f3441c.add(size, b10);
                b10 = h.b(this.f3442f, b10.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public void g() {
        if (this.f3441c.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.f3441c;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Context context = this.f3442f;
        Object obj = c0.a.f3717a;
        a.C0047a.a(context, intentArr, null);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f3441c.iterator();
    }
}
