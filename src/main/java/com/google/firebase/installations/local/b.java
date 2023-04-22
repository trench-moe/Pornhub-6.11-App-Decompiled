package com.google.firebase.installations.local;

import com.appsflyer.oaid.BuildConfig;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.local.PersistedInstallation;

@AutoValue
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f8081a = 0;

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract b a();

        public abstract a b(PersistedInstallation.RegistrationStatus registrationStatus);
    }

    static {
        Long l10 = 0L;
        String str = l10 == null ? " expiresInSecs" : BuildConfig.FLAVOR;
        if (l10 == null) {
            str = a1.a.l(str, " tokenCreationEpochInSecs");
        }
        if (!str.isEmpty()) {
            throw new IllegalStateException(a1.a.l("Missing required properties:", str));
        }
        l10.longValue();
        l10.longValue();
    }

    public abstract String a();

    public abstract long b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract PersistedInstallation.RegistrationStatus f();

    public abstract long g();

    public boolean h() {
        return f() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR;
    }

    public boolean i() {
        PersistedInstallation.RegistrationStatus registrationStatus = ((com.google.firebase.installations.local.a) this).f8070c;
        if (registrationStatus != PersistedInstallation.RegistrationStatus.NOT_GENERATED && registrationStatus != PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
            return false;
        }
        return true;
    }

    public abstract a j();
}
