package g1;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public c f9690a;

    public a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName = remoteUserInfo.getPackageName();
        Objects.requireNonNull(packageName, "package shouldn't be null");
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.f9690a = new b(remoteUserInfo);
    }

    public a(String str, int i10, int i11) {
        Objects.requireNonNull(str, "package shouldn't be null");
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9690a = new b(str, i10, i11);
        } else {
            this.f9690a = new c(str, i10, i11);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f9690a.equals(((a) obj).f9690a);
        }
        return false;
    }

    public int hashCode() {
        return this.f9690a.hashCode();
    }
}
