package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzkh extends IOException {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f7076c = 0;

    public zzkh(String str) {
        super(str);
    }

    public static zzkh a() {
        return new zzkh("Protocol message had invalid UTF-8.");
    }

    public static zzkh b() {
        return new zzkh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzkh c() {
        return new zzkh("Failed to parse the message.");
    }

    public static zzkh d() {
        return new zzkh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
