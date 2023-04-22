package j1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final List<f> f11255a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11256b;

    public j(List<f> list, boolean z10) {
        this.f11255a = list == null ? Collections.emptyList() : list;
        this.f11256b = z10;
    }

    public static j a(Bundle bundle) {
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.add(f.b((Bundle) parcelableArrayList.get(i10)));
            }
            arrayList = arrayList2;
        }
        return new j(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public boolean b() {
        int i10;
        int size = this.f11255a.size();
        while (i10 < size) {
            f fVar = this.f11255a.get(i10);
            i10 = (fVar != null && fVar.r()) ? i10 + 1 : 0;
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder l10 = android.support.v4.media.a.l("MediaRouteProviderDescriptor{ ", "routes=");
        l10.append(Arrays.toString(this.f11255a.toArray()));
        l10.append(", isValid=");
        l10.append(b());
        l10.append(" }");
        return l10.toString();
    }
}
