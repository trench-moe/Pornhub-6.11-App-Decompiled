package j1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: c  reason: collision with root package name */
    public static final k f11274c = new k(new Bundle(), null);

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f11275a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f11276b;

    public k(Bundle bundle, List<String> list) {
        this.f11275a = bundle;
        this.f11276b = list;
    }

    public static k b(Bundle bundle) {
        if (bundle != null) {
            return new k(bundle, null);
        }
        return null;
    }

    public void a() {
        if (this.f11276b == null) {
            ArrayList<String> stringArrayList = this.f11275a.getStringArrayList("controlCategories");
            this.f11276b = stringArrayList;
            if (stringArrayList != null && !stringArrayList.isEmpty()) {
                return;
            }
            this.f11276b = Collections.emptyList();
        }
    }

    public boolean c() {
        a();
        return this.f11276b.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            a();
            kVar.a();
            return this.f11276b.equals(kVar.f11276b);
        }
        return false;
    }

    public int hashCode() {
        a();
        return this.f11276b.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MediaRouteSelector{ ");
        sb2.append("controlCategories=");
        a();
        sb2.append(Arrays.toString(this.f11276b.toArray()));
        sb2.append(" }");
        return sb2.toString();
    }
}
