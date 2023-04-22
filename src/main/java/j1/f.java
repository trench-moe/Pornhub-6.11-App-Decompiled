package j1;

import android.annotation.SuppressLint;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f11171a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f11172b;

    /* renamed from: c  reason: collision with root package name */
    public List<IntentFilter> f11173c;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Bundle f11174a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<String> f11175b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<IntentFilter> f11176c;

        public a(String str, String str2) {
            Bundle bundle = new Bundle();
            this.f11174a = bundle;
            bundle.putString("id", str);
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
        }

        public a a(Collection<IntentFilter> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (IntentFilter intentFilter : collection) {
                        if (intentFilter == null) {
                            throw new IllegalArgumentException("filter must not be null");
                        }
                        if (this.f11176c == null) {
                            this.f11176c = new ArrayList<>();
                        }
                        if (!this.f11176c.contains(intentFilter)) {
                            this.f11176c.add(intentFilter);
                        }
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("filters must not be null");
        }

        @SuppressLint({"UnknownNullness"})
        public f b() {
            ArrayList<IntentFilter> arrayList = this.f11176c;
            if (arrayList != null) {
                this.f11174a.putParcelableArrayList("controlFilters", arrayList);
            }
            ArrayList<String> arrayList2 = this.f11175b;
            if (arrayList2 != null) {
                this.f11174a.putStringArrayList("groupMemberIds", arrayList2);
            }
            return new f(this.f11174a);
        }

        public a c(int i10) {
            this.f11174a.putInt("connectionState", i10);
            return this;
        }

        public a d(int i10) {
            this.f11174a.putInt("playbackType", i10);
            return this;
        }

        public a e(int i10) {
            this.f11174a.putInt("volume", i10);
            return this;
        }

        public a f(int i10) {
            this.f11174a.putInt("volumeHandling", i10);
            return this;
        }

        public a g(int i10) {
            this.f11174a.putInt("volumeMax", i10);
            return this;
        }
    }

    public f(Bundle bundle) {
        this.f11171a = bundle;
    }

    public static f b(Bundle bundle) {
        if (bundle != null) {
            return new f(bundle);
        }
        return null;
    }

    public void a() {
        if (this.f11173c == null) {
            ArrayList parcelableArrayList = this.f11171a.getParcelableArrayList("controlFilters");
            this.f11173c = parcelableArrayList;
            if (parcelableArrayList == null) {
                this.f11173c = Collections.emptyList();
            }
        }
    }

    public int c() {
        return this.f11171a.getInt("connectionState", 0);
    }

    public String d() {
        return this.f11171a.getString("status");
    }

    public int e() {
        return this.f11171a.getInt("deviceType");
    }

    public Bundle f() {
        return this.f11171a.getBundle("extras");
    }

    public List<String> g() {
        if (this.f11172b == null) {
            ArrayList<String> stringArrayList = this.f11171a.getStringArrayList("groupMemberIds");
            this.f11172b = stringArrayList;
            if (stringArrayList == null) {
                this.f11172b = Collections.emptyList();
            }
        }
        return this.f11172b;
    }

    public Uri h() {
        String string = this.f11171a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public String i() {
        return this.f11171a.getString("id");
    }

    public String j() {
        return this.f11171a.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    public int k() {
        return this.f11171a.getInt("playbackStream", -1);
    }

    public int l() {
        return this.f11171a.getInt("playbackType", 1);
    }

    public int m() {
        return this.f11171a.getInt("presentationDisplayId", -1);
    }

    public int n() {
        return this.f11171a.getInt("volume");
    }

    public int o() {
        return this.f11171a.getInt("volumeHandling", 0);
    }

    public int p() {
        return this.f11171a.getInt("volumeMax");
    }

    public boolean q() {
        return this.f11171a.getBoolean("enabled", true);
    }

    public boolean r() {
        a();
        return (TextUtils.isEmpty(i()) || TextUtils.isEmpty(j()) || this.f11173c.contains(null)) ? false : true;
    }

    public String toString() {
        StringBuilder l10 = android.support.v4.media.a.l("MediaRouteDescriptor{ ", "id=");
        l10.append(i());
        l10.append(", groupMemberIds=");
        l10.append(g());
        l10.append(", name=");
        l10.append(j());
        l10.append(", description=");
        l10.append(d());
        l10.append(", iconUri=");
        l10.append(h());
        l10.append(", isEnabled=");
        l10.append(q());
        l10.append(", connectionState=");
        l10.append(c());
        l10.append(", controlFilters=");
        a();
        l10.append(Arrays.toString(this.f11173c.toArray()));
        l10.append(", playbackType=");
        l10.append(l());
        l10.append(", playbackStream=");
        l10.append(k());
        l10.append(", deviceType=");
        l10.append(e());
        l10.append(", volume=");
        l10.append(n());
        l10.append(", volumeMax=");
        l10.append(p());
        l10.append(", volumeHandling=");
        l10.append(o());
        l10.append(", presentationDisplayId=");
        l10.append(m());
        l10.append(", extras=");
        l10.append(f());
        l10.append(", isValid=");
        l10.append(r());
        l10.append(", minClientVersion=");
        l10.append(this.f11171a.getInt("minClientVersion", 1));
        l10.append(", maxClientVersion=");
        l10.append(this.f11171a.getInt("maxClientVersion", IntCompanionObject.MAX_VALUE));
        l10.append(" }");
        return l10.toString();
    }
}
