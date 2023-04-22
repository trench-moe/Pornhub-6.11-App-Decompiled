package io.realm.internal;

import com.appsflyer.oaid.BuildConfig;
import io.realm.CompactOnLaunchCallback;
import io.realm.internal.OsSharedRealm;
import io.realm.log.RealmLog;
import io.realm.s;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class OsRealmConfig implements g {

    /* renamed from: w  reason: collision with root package name */
    public static final long f10881w = nativeGetFinalizerPtr();

    /* renamed from: c  reason: collision with root package name */
    public final s f10882c;

    /* renamed from: f  reason: collision with root package name */
    public final URI f10883f;

    /* renamed from: j  reason: collision with root package name */
    public final long f10884j;

    /* renamed from: m  reason: collision with root package name */
    public final f f10885m = new f();
    public final CompactOnLaunchCallback n;

    /* renamed from: t  reason: collision with root package name */
    public final OsSharedRealm.MigrationCallback f10886t;

    /* renamed from: u  reason: collision with root package name */
    public final OsSharedRealm.InitializationCallback f10887u;

    /* loaded from: classes2.dex */
    public enum Durability {
        FULL(0),
        MEM_ONLY(1);
        
        public final int value;

        Durability(int i10) {
            this.value = i10;
        }
    }

    /* loaded from: classes2.dex */
    public enum SchemaMode {
        /* JADX INFO: Fake field, exist only in values array */
        SCHEMA_MODE_AUTOMATIC((byte) 0),
        SCHEMA_MODE_IMMUTABLE((byte) 1),
        SCHEMA_MODE_READONLY((byte) 2),
        SCHEMA_MODE_RESET_FILE((byte) 3),
        SCHEMA_MODE_ADDITIVE_DISCOVERED((byte) 4),
        SCHEMA_MODE_MANUAL((byte) 6);
        
        public final byte value;

        SchemaMode(byte b10) {
            this.value = b10;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10896a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            f10896a = iArr;
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public s f10897a;

        /* renamed from: b  reason: collision with root package name */
        public OsSchemaInfo f10898b = null;

        /* renamed from: c  reason: collision with root package name */
        public OsSharedRealm.MigrationCallback f10899c = null;
        public OsSharedRealm.InitializationCallback d = null;

        /* renamed from: e  reason: collision with root package name */
        public boolean f10900e = false;

        /* renamed from: f  reason: collision with root package name */
        public String f10901f = BuildConfig.FLAVOR;

        public b(s sVar) {
            this.f10897a = sVar;
        }

        public OsRealmConfig a() {
            return new OsRealmConfig(this.f10897a, this.f10901f, this.f10900e, this.f10898b, this.f10899c, this.d, null);
        }
    }

    public OsRealmConfig(s sVar, String str, boolean z10, OsSchemaInfo osSchemaInfo, OsSharedRealm.MigrationCallback migrationCallback, OsSharedRealm.InitializationCallback initializationCallback, a aVar) {
        String str2;
        URI uri;
        URI uri2;
        this.f10882c = sVar;
        this.f10884j = nativeCreate(sVar.f11005c, str, true, sVar.f11015o);
        f.f10955b.a(this);
        Objects.requireNonNull(h.b());
        Object[] objArr = new Object[14];
        String str3 = (String) objArr[0];
        String str4 = (String) objArr[1];
        String str5 = (String) objArr[2];
        String str6 = (String) objArr[3];
        String str7 = (String) objArr[4];
        String str8 = (String) objArr[5];
        Byte b10 = (Byte) objArr[6];
        String str9 = (String) objArr[7];
        String str10 = (String) objArr[8];
        Map map = (Map) objArr[9];
        Byte b11 = (Byte) objArr[10];
        String str11 = (String) objArr[11];
        Object obj = objArr[12];
        Long l10 = (Long) objArr[13];
        String[] strArr = new String[map != null ? map.size() * 2 : 0];
        if (map != null) {
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                strArr[i10] = (String) entry.getKey();
                strArr[i10 + 1] = (String) entry.getValue();
                i10 += 2;
            }
        }
        byte[] a10 = sVar.a();
        if (a10 != null) {
            nativeSetEncryptionKey(this.f10884j, a10);
        }
        nativeSetInMemory(this.f10884j, sVar.f11010i == Durability.MEM_ONLY);
        nativeEnableChangeNotification(this.f10884j, z10);
        SchemaMode schemaMode = SchemaMode.SCHEMA_MODE_MANUAL;
        if (sVar.f11017q) {
            schemaMode = SchemaMode.SCHEMA_MODE_IMMUTABLE;
        } else if (sVar.f11014m) {
            schemaMode = SchemaMode.SCHEMA_MODE_READONLY;
        } else if (str4 != null) {
            schemaMode = SchemaMode.SCHEMA_MODE_ADDITIVE_DISCOVERED;
        } else if (sVar.f11009h) {
            schemaMode = SchemaMode.SCHEMA_MODE_RESET_FILE;
        }
        long j10 = sVar.f11007f;
        long j11 = osSchemaInfo == null ? 0L : osSchemaInfo.f10917c;
        this.f10886t = migrationCallback;
        nativeSetSchemaConfig(this.f10884j, schemaMode.value, j10, j11, migrationCallback);
        CompactOnLaunchCallback compactOnLaunchCallback = sVar.n;
        this.n = compactOnLaunchCallback;
        if (compactOnLaunchCallback != null) {
            nativeSetCompactOnLaunchCallback(this.f10884j, compactOnLaunchCallback);
        }
        this.f10887u = initializationCallback;
        if (initializationCallback != null) {
            nativeSetInitializationCallback(this.f10884j, initializationCallback);
        }
        URI uri3 = null;
        if (str4 != null) {
            String nativeCreateAndSetSyncConfig = nativeCreateAndSetSyncConfig(l10.longValue(), this.f10884j, str4, str5, str3, str6, str7, str8, b10.byteValue(), str9, str10, strArr, b11.byteValue(), str11, obj);
            try {
                nativeCreateAndSetSyncConfig = str5 + str9.substring(1);
                uri = new URI(nativeCreateAndSetSyncConfig);
                str2 = nativeCreateAndSetSyncConfig;
            } catch (URISyntaxException e10) {
                RealmLog.a(6, e10, "Cannot create a URI from the Realm URL address", new Object[0]);
                str2 = nativeCreateAndSetSyncConfig;
                uri = null;
            }
            ProxySelector proxySelector = ProxySelector.getDefault();
            if (uri != null && proxySelector != null) {
                try {
                    uri2 = new URI(str2.replaceFirst("ws", "http"));
                } catch (URISyntaxException e11) {
                    RealmLog.a(6, e11, "Cannot create a URI from the Realm URL address", new Object[0]);
                    uri2 = null;
                }
                List<Proxy> select = proxySelector.select(uri2);
                if (select != null && !select.isEmpty()) {
                    Proxy proxy = select.get(0);
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        byte b12 = a.f10896a[proxy.type().ordinal()] == 1 ? (byte) 0 : (byte) -1;
                        if (proxy.type() == Proxy.Type.HTTP) {
                            SocketAddress address = proxy.address();
                            if (address instanceof InetSocketAddress) {
                                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                nativeSetSyncConfigProxySettings(this.f10884j, b12, inetSocketAddress.getHostString(), inetSocketAddress.getPort());
                            } else {
                                StringBuilder m10 = a1.a.m("Unsupported proxy socket address type: ");
                                m10.append(address.getClass().getName());
                                RealmLog.a(6, null, m10.toString(), new Object[0]);
                            }
                        } else {
                            RealmLog.a(6, null, "SOCKS proxies are not supported.", new Object[0]);
                        }
                    }
                }
            }
            uri3 = uri;
        }
        this.f10883f = uri3;
    }

    private static native long nativeCreate(String str, String str2, boolean z10, long j10);

    private static native String nativeCreateAndSetSyncConfig(long j10, long j11, String str, String str2, String str3, String str4, String str5, String str6, byte b10, String str7, String str8, String[] strArr, byte b11, String str9, Object obj);

    private static native void nativeEnableChangeNotification(long j10, boolean z10);

    private static native long nativeGetFinalizerPtr();

    private static native void nativeSetCompactOnLaunchCallback(long j10, CompactOnLaunchCallback compactOnLaunchCallback);

    private static native void nativeSetEncryptionKey(long j10, byte[] bArr);

    private static native void nativeSetInMemory(long j10, boolean z10);

    private native void nativeSetInitializationCallback(long j10, OsSharedRealm.InitializationCallback initializationCallback);

    private native void nativeSetSchemaConfig(long j10, byte b10, long j11, long j12, OsSharedRealm.MigrationCallback migrationCallback);

    private static native void nativeSetSyncConfigProxySettings(long j10, byte b10, String str, int i10);

    @Override // io.realm.internal.g
    public long getNativeFinalizerPtr() {
        return f10881w;
    }

    @Override // io.realm.internal.g
    public long getNativePtr() {
        return this.f10884j;
    }
}
